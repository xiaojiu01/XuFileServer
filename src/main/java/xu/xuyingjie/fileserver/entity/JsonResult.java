package xu.xuyingjie.fileserver.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
/**
 * 返回JSON字符串模板类
 * @author 许映杰
 *
 * @param <T>
 */
@JsonInclude(Include.NON_NULL)	//如果字段为null，则不在json中返回
public class JsonResult<T> {
	private int errcode;	//返回的错误码，为0则没有错误
	private T data;		//返回的内容，泛型
	private String errmsg;		//返回的错误信息
	
	//返回错误码
	public static final int SERVER_ERR = 1;
	public static final String SERVER_ERR_MSG = "服务器繁忙，请稍后再试...";


	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

}
