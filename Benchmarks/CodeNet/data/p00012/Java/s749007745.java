import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);;

	int INF=1<<28;
	double EPS=1e-9;

	void run(){
		for(; sc.hasNext();){
			P[] ps=new P[3];
			for(int i=0; i<3; i++){
				double x=sc.nextDouble();
				double y=sc.nextDouble();
				ps[i]=new P(x, y);
			}
			double xp=sc.nextDouble();
			double yp=sc.nextDouble();
			P q=new P(xp, yp);
			for(int i=0; i<3; i++){
				ps[i]=ps[i].sub(q);
			}
			double[] signs=new double[3];
			for(int i=0; i<3; i++){
				signs[i]=Math.signum(ps[i].det(ps[(i+1)%3]));
			}
			if(signs[0]==signs[1]&&signs[1]==signs[2]){
				println("YES");
			}else{
				println("NO");
			}
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

		P sub(P p){
			return new P(x-p.x, y-p.y);
		}

		double det(P p){
			return x*p.y-y*p.x;
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