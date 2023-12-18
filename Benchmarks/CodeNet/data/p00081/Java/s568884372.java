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
			String[] s=sc.nextLine().split(",");
			double x1=Double.parseDouble(s[0]);
			double y1=Double.parseDouble(s[1]);
			double x2=Double.parseDouble(s[2]);
			double y2=Double.parseDouble(s[3]);
			double xq=Double.parseDouble(s[4]);
			double yq=Double.parseDouble(s[5]);
			P p1=new P(x1, y1);
			P p2=new P(x2, y2);
			P q=new P(xq, yq);
			P proj=p1.add(p2.sub(p1).mul(
					p2.sub(p1).dot(q.sub(p1))/p2.sub(p1).abs2()));
			P r=proj.sub(q).add(proj);
			println(r.x+" "+r.y);
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

	class P{
		double x, y;

		P(){}

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
			return new P(m*x, m*y);
		}

		double dot(P p){
			return x*p.x+y*p.y;
		}

		double abs2(){
			return x*x+y*y;
		}
	}
}