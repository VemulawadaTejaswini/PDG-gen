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
		for(int k=0; k<n; k++){
			int[] a=new int[3];
			for(int i=0; i<3; i++)
				a[i]=sc.nextInt();
			sort(a);
			if(a[0]*a[0]+a[1]*a[1]==a[2]*a[2])
				println("YES");
			else
				println("NO");
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