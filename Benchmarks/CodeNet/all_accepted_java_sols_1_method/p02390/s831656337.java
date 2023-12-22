import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * ???????????§??????????´? EightQueen.java
 *
 * Copyright(C) 2016 Nagasaki Team All Rights Reserved.
 */
/**
 * AIZU???Time???????????¨????§????h:m:s???????????????
 *@author Iwanaga
 * @version 1.00
 */

class Main{
	/*
	 *main????????????
	 */
	public static void main(String[] args)throws IOException{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int sec = 0;
		int[] time=new int[3];

		str = br.readLine();
		sec = Integer.parseInt(str);
		
		for(int i=0; i<3; i++){
			time[i]=sec%60;
			sec=sec/60;
		}
		System.out.println(time[2]+":"+time[1]+":"+time[0]);
	}
}