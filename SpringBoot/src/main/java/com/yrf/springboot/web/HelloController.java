package com.yrf.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**  
* <p>Title: file_name</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* <p>Company: www.ZTESoft.com</p>  
* @author @yrf  
* @date 2018年10月9日  
* @version 1.0  
*/

@RestController
// @RestController 是spring4里的新注解，是@ResponseBody和@Controller的缩写。
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring Boot @yrf";
	}

}
