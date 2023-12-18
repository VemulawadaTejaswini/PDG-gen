package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String args[]) throws IOException{
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);

		String str=br.readLine();
		int a=Integer.parseInt(str);
                int b=a*a*a;
		System.out.println(b);
	}
}