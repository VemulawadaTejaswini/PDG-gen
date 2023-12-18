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
			int y1=sc.nextInt();
			int m1=sc.nextInt();
			int d1=sc.nextInt();
			int y2=sc.nextInt();
			int m2=sc.nextInt();
			int d2=sc.nextInt();
			if(y1<0||m1<0||d1<0||y2<0||m2<0||d2<0)
				break;
			Calendar c1=Calendar.getInstance();
			Calendar c2=Calendar.getInstance();
			c1.set(y1, m1, d1);
			c2.set(y2, m2, d2);
			long diff=c2.getTimeInMillis()-c1.getTimeInMillis();
			println((diff/1000/60/60/24)+"");
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