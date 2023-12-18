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
		for(;;){
			int n=sc.nextInt();
			if(n==0)
				break;
			int[] a=new int[n];
			for(int i=0; i<n; i++)
				a[i]=sc.nextInt();
			int ans=Integer.MIN_VALUE;
			for(int i=0; i<n; i++){
				int sum=0;
				for(int j=i; j<n; j++){
					ans=max(ans, sum+=a[j]);
				}
			}
			println(ans+"");
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