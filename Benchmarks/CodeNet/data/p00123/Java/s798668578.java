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
			double t1=sc.nextDouble();
			double t2=sc.nextDouble();
			double[] s1={70.0, 55.0, 50.0, 43.0, 40.0, 37.5, 35.5};
			double[] s2={148.0, 116.0, 105.0, 89.0, 83.0, 77.0, 71.0};
			String[] s={"E", "D", "C", "B", "A", "AA", "AAA"};
			String ans="NA";
			for(int i=0; i<7; i++){
				if(t1<s1[i]&&t2<s2[i])
					ans=s[i];
				else
					break;
			}
			println(ans);
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