import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-9;

	void run(){
		sc=new Scanner(System.in);
		for(; sc.hasNext();){
			String s=sc.next();
			int[][] a=new int[10][10];
			for(int i=0; i<10; i++)
				a[0][i]=s.charAt(i)-'0';
			for(int j=1; j<10; j++){
				for(int i=0; i<10-j; i++){
					a[j][i]=(a[j-1][i]+a[j-1][i+1])%10;
				}
			}
			println(""+a[9][0]);
		}
		sc.close();
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}