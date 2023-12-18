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
		for(int i=0; i<n; i++){
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			double x3=sc.nextDouble();
			double y3=sc.nextDouble();
			double x4=sc.nextDouble();
			double y4=sc.nextDouble();

			double vx1=x2-x1;
			double vy1=y2-y1;
			double vx2=x4-x3;
			double vy2=y4-y3;
			double kx=vx2/vx1;
			double ky=vy2/vy1;

			println(abs(kx-ky)<EPS?"YES":"NO");
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