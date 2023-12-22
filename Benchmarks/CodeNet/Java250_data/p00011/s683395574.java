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
		int n=sc.nextInt();
		int[] l=new int[n+1];
		for(int i=1;i<=n;i++)
			l[i]=i;
		int m=sc.nextInt();
		for(int i=0;i<m;i++){
			String[] s=sc.next().split(",");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			for(int k=1;k<=n;k++){
				if(l[k]==a)
					l[k]=b;
				else if(l[k]==b)
					l[k]=a;
			}
		}
		int[] ans=new int[n+1];
		for(int i=1;i<=n;i++)
			ans[l[i]]=i;
		for(int i=1;i<=n;i++)
			println(""+ans[i]);
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