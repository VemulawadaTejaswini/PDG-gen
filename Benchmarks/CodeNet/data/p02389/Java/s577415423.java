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
		String[] b=str.split(" ",0);
		int a=Integer.parseInt(b[0]);
		int c=Integer.parseInt(b[1]);
		int d=(2*a)+(2*c);
		System.out.println(a*c+" "+d);
		}
		br.close();
	}
}