import java.util.*;
import java.awt.geom.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1183();
	}
	
	class AOJ1183{
		AOJ1183(){
			while(sc.hasNext()){
				int n=sc.nextInt();
				if(n==0)	break;
				solve(n);
			}
		}
		Circle[] c;
		Point2D[][] p1;
		Point2D[] p2;
		void solve(int n){
			c=new Circle[n];
			for(int i=0; i<n; ++i)	c[i]=new Circle(sc.nextInt(), sc.nextInt(), sc.nextInt());
			p1=new Point2D[n-1][2];
			for(int i=0; i<n-1; ++i)	p1[i]=intersectPtCC(c[i], c[i+1]);
			p2=new Point2D[2*n];
			p2[0]=c[0].p;
			p2[2*n-1]=c[n-1].p;
			for(int i=0; i<n-1; ++i){
				p2[2*i+1]=p1[i][0];
				p2[2*i+2]=p1[i][1];
			}
			double[] dp=new double[2*n];
			for(int i=1; i<2*n; ++i)	dp[i]=Double.MAX_VALUE/4;
			for(int i=0; i<2*n; ++i)for(int j=i+1; j<2*n; ++j){
				if(i==j || !f1(i,j))	continue;
				dp[j]=min(dp[j], dp[i]+p2[j].distance(p2[i]));
			}
			System.out.println(dp[2*n-1]);
		}
		boolean f1(int from,int to){
			Line2D l=new Line2D.Double(p2[from],p2[to]);
			int f=(from+1)/2-1,t=(to+1)/2-1;
			for(int i=f+1; i<t; ++i)if(!new Line2D.Double(p1[i][0],p1[i][1]).intersectsLine(l))	return false;
			return true;
		}
		Point2D add(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		}
		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(), p1.getY()-p2.getY());
		}
		Point2D mul(double n,Point2D p1){
			return new Point2D.Double(p1.getX()*n, p1.getY()*n);
		}
		Point2D normalVector1(Point2D p){
			return new Point2D.Double(-p.getY(), p.getX());
		}
		Point2D normalVector2(Point2D p){
			return new Point2D.Double(p.getY(), -p.getX());
		}
		class Circle{
			Point2D p;
			double r;
			Circle(double x,double y,double r){
				this.p=new Point2D.Double(x,y);
				this.r=r;
			}
		}
		Point2D[] intersectPtCC(Circle a,Circle b){
			double dis = a.p.distance(b.p);
			if(dis > a.r+b.r)	return null;
			Point2D v = sub(b.p, a.p);
			double rc = (dis*dis + a.r*a.r - b.r*b.r)/(2*dis);
			double rate = rc/dis;
			v = mul(rate, v);
			Point2D c = add(v, a.p);
			double disC2c = c.distance(b.p);
			double disqc = Math.sqrt(b.r*b.r - disC2c*disC2c);
			Point2D v2 = sub(b.p, c);
			v2 = mul(disqc/disC2c, v2);
			Point2D[] ret = new Point2D.Double[2];
			ret[0] = add(normalVector1(v2), c);
			ret[1] = add(normalVector2(v2), c);
			return ret;
		}
	}
}