import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

// 2012/12/25
// Up Above the World So High
public class Main{
	Scanner sc=new Scanner(System.in);

	double EPS=1e-6;

	int n;
	P[] ps;
	double rad;

	void run(){
		n=sc.nextInt();
		ps=new P[n];
		for(int i=0; i<n; i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			ps[i]=new P(x, y, z);
		}
		rad=sc.nextInt();
		solve();
	}

	void solve(){
		rad=toRadians(rad);
		int max=1;
		Random rand=new Random(0);
		for(int trial=0; trial<10; trial++){
			double d1=rand.nextDouble()*PI, d2=rand.nextDouble()*PI, d3=rand
					.nextDouble()*PI;
			for(int i=0; i<n; i++){
				ps[i]=ps[i].div(ps[i].norm()).rotX(d1).rotY(d2).rotZ(d3);
			}
			double cos2=cos(rad)*cos(rad);
			for(int i=0; i<n; i++){
				for(int j=i+1; j<n; j++){
					P P=ps[i], Q=ps[j];
					double A, B, C, D;
					{
						double a=-(P.x*Q.z-Q.x*P.z), b=(Q.z-P.z)*cos2, c=(P.y
								*Q.z-Q.y*P.z);
						A=a/c;
						B=b/c;
					}
					{
						double a=-(P.x*Q.y-Q.x*P.y), b=(Q.y-P.y)*cos2, c=(P.z
								*Q.y-Q.z*P.y);
						C=a/c;
						D=b/c;
					}
					for(double vx : quad(1+A*A+C*C, 2*(A*B+C*D), B*B+D*D-cos2)){
						P v=new P(vx, A*vx+B, C*vx+D);
						int count=0;
						for(int k=0; k<n; k++){
							if(acos(v.dot(ps[k])/v.norm())<rad+EPS){
								count++;
							}
						}
						max=max(max, count);
					}
				}
			}
		}
		println(max+"");
	}

	double[] quad(double a, double b, double c){
		double D=b*b-4*a*c;
		if(D+EPS<0){
			return new double[0];
		}
		D=max(D, 0);
		return new double[]{(-b-sqrt(D))/(2*a), 2*c/(-b-sqrt(D))};
	}

	class P{
		double x, y, z;

		P(double x, double y, double z){
			this.x=x;
			this.y=y;
			this.z=z;

		}

		double dot(P p){
			return x*p.x+y*p.y+z*p.z;
		}

		P div(double d){
			return new P(x/d, y/d, z/d);
		}

		double norm(){
			return sqrt(x*x+y*y+z*z);
		}

		P rotX(double d){
			return new P(x, y*cos(d)-z*sin(d), y*sin(d)+z*cos(d));
		}

		P rotY(double d){
			return new P(z*sin(d)+x*cos(d), y, z*cos(d)-x*sin(d));
		}

		P rotZ(double d){
			return new P(x*cos(d)-y*sin(d), x*sin(d)+y*cos(d), z);
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new Main().run();
	}
}