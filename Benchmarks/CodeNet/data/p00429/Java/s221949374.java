/*  http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0506 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			
			
			while(true){
				int n = Integer.parseInt(sc.nextLine());
				if(n==0) { break; }

				String s = sc.nextLine();

				for(int i=0;i<n;i++){
					s = encode(s);
				}
				System.out.println(s);
			}

		}catch(Exception e){
			e.printStackTrace(System.out);
		}
	}
	
	private static String encode(String s){
		if(s.equals("")){ return ""; }
		
		char c = s.charAt(0);
		int n;
		for(n=0;n<s.length() && s.charAt(n)==c ;n++){
			//nop
		}
		return String.valueOf(n) + String.valueOf(c) + encode(s.substring(n));
	}
}