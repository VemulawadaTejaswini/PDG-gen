import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc;

	static final int INF=1<<28;
	static final double EPS=1e-6;

	void run(){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++){

			double x1=sc.nextDouble(), y1=sc.nextDouble(), r1=sc.nextDouble(), x2=sc
					.nextDouble(), y2=sc.nextDouble(), r2=sc.nextDouble();
			double d=Math.hypot(x2-x1, y2-y1);
			if(d>r1+r2+EPS){
				System.out.println(0);
			}else if(d>Math.abs(r1-r2)-EPS){
				System.out.println(1);
			}else{
				if(r1>r2){
					System.out.println(2);
				}else{
					System.out.println(-2);
				}
			}
			if(1==1)
				continue;
			double xa=sc.nextDouble();
			double ya=sc.nextDouble();
			double ra=sc.nextDouble();
			double xb=sc.nextDouble();
			double yb=sc.nextDouble();
			double rb=sc.nextDouble();
			P a=new P(xa, ya);
			P b=new P(xb, yb);
			double dis=a.sub(b).abs();
			if(ra+rb+EPS<dis)
				println("0");
			else if(abs(rb-ra)<dis+EPS)
				println("1");
			else if(ra<rb)
				println("-2");
			else
				println("2");
		}
	}

	class P{
		double x, y;

		P(){
			this(0, 0);
		}

		P(double x, double y){
			this.x=x;
			this.y=y;
		}

		P add(P p){
			return new P(x+p.x, y+p.y);
		}

		P sub(P p){
			return new P(x-p.x, y-p.y);
		}

		P mul(double m){
			return new P(x*m, y*m);
		}

		P div(double d){
			return new P(x/d, y/d);
		}

		double abs(){
			return Math.sqrt(abs2());
		}

		double abs2(){
			return x*x+y*y;
		}

		double dot(P p){
			return x*p.x+y*p.y;
		}

		double det(P p){
			return x*p.y-p.x*y;
		}

		P rot90(){
			return new P(-y, x);
		}
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