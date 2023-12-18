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

	double xa1, ya1, xa2, ya2;
	double xb1, yb1, xb2, yb2;

	boolean inA(double x, double y){
//		return (x>xa1-EPS)&&(x<xa2+EPS)&&(y>ya1-EPS)&&(y<ya2+EPS);
		return (x>xa1)&&(x<xa2)&&(y>ya1)&&(y<ya2);
	}

	boolean inB(double x, double y){
//		return (x>xb1-EPS)&&(x<xb2+EPS)&&(y>yb1-EPS)&&(y<yb2+EPS);
		return (x>xb1)&&(x<xb2)&&(y>yb1)&&(y<yb2);
	}

	void run(){
		sc=new Scanner(System.in);
		for(; sc.hasNext();){
			xa1=sc.nextDouble();
			ya1=sc.nextDouble();
			xa2=sc.nextDouble();
			ya2=sc.nextDouble();
			xb1=sc.nextDouble();
			yb1=sc.nextDouble();
			xb2=sc.nextDouble();
			yb2=sc.nextDouble();

			boolean f=false;
			f|=inA(xb1, yb1);
			f|=inA(xb1, yb2);
			f|=inA(xb2, yb1);
			f|=inA(xb2, yb2);
			f|=inB(xa1, ya1);
			f|=inB(xa1, ya2);
			f|=inB(xa2, ya1);
			f|=inB(xa2, ya2);

			f=(xa1<xb2)&&(xb1<xa2)&&(ya1<yb2)&&(yb1<ya2);
			
			println(f?"YES":"NO");

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