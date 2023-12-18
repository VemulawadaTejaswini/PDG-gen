import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ1134().doIt();
	}

	class AOJ1134{
		final double EPS=1.0e-8;
		Point2D[] intersectPtCC(Circle a,Circle b){
			double dis = a.p.distance(b.p);
			if(dis > a.r+b.r) return null;
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

		Point2D add(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		}
		
		Point2D normalVector1(Point2D p){
			return new Point2D.Double(-p.getY(), p.getX());
		}
		Point2D normalVector2(Point2D p){
			return new Point2D.Double(p.getY(), -p.getX());
		}
		
		Point2D mul(double n,Point2D p1){
			return new Point2D.Double(p1.getX()*n,p1.getY()*n);
		}

		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(),p1.getY()-p2.getY());
		}

		class Circle{
			Point2D p;
			double r;
			Circle(Point2D p,double r){ 
				this.p=p;
				this.r=r;
			}
			Circle(double x,double y,double r){  
				this.p=new Point2D.Double(x,y); 
				this.r=r;
			}
		}

		void doIt(){
			int n = in.nextInt();
			if(n==0)return;
			Point2D[] p = new Point2D[n];
			for(int i=0;i<n;i++)p[i] = new Point2D.Double(in.nextDouble(),in.nextDouble());
			int result = 1;
			for(int i=0;i<n;i++)for(int s=0;s<n;s++)if(i!=s)if(p[i].distance(p[s])<=2){
				Point2D[] k = intersectPtCC(new Circle(p[i], 1+EPS), new Circle(p[s], 1+EPS));
				for(int a=0;a<k.length;a++){
					int cnt = 0;
					for(int b=0;b<n;b++)if(k[a].distance(p[b])<=1+EPS)cnt++;
					result = Math.max(result, cnt);
				}
			}
			System.out.println(result);
		}
	}
}