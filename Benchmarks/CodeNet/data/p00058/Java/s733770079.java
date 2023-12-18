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
			double xa=sc.nextDouble();
			double ya=sc.nextDouble();
			double xb=sc.nextDouble();
			double yb=sc.nextDouble();
			double xc=sc.nextDouble();
			double yc=sc.nextDouble();
			double xd=sc.nextDouble();
			double yd=sc.nextDouble();
			double vx1=xb-xa;
			double vy1=yb-ya;
			double vx2=xc-xd;
			double vy2=yc-yd;
			println(abs(vx1*vx2+vy1*vy2)<EPS?"YES":"NO");
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