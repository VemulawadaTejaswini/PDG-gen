package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test{
	public static void main(String args[]) throws IOException{
		//System.out.println("hello world");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String str;
		while((str=br.readLine())!=null){
		int a=Integer.parseInt(str);
		System.out.println(a*a*a);
		}
	}
}