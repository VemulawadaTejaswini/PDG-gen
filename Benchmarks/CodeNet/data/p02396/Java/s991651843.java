/* 
 * ???????????§??????????´? PrintTestCase.java
 *
 * Copyright(C) 2016 Nagasaki Team All Rights Reserved.
 */
/**
 * ??\???????????????????????????????????????
 *
 * @author Maemichi
 * @version 1.00
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 1;
		while(!str.equals("0")){
			System.out.println("case "+ cnt + ": " +str);
			cnt++;
			br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
		}
	}
}