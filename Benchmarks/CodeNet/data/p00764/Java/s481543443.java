import java.awt.geom.*;
import java.util.*;
import static java.lang.Math.*;
public class Main{
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
				int n = sc.nextInt();
				if(n==0)	break;
				solve(n);
			}
		}
		final double INF = Double.MAX_VALUE/4;
		C[] c;
		Point2D.Double[][] p;
		Point2D.Double[] p2;
		void solve(int n){
			c=new C[n];
			for(int i=0; i<n; ++i)	c[i]=new C(sc.nextInt(),sc.nextInt(),sc.nextInt());
			p = new Point2D.Double[n][2];	// 交点の座標
			for(int i=0; i<n-1; ++i)	p[i]=intersectR(c[i], c[i+1]);
			p2=new Point2D.Double[2*n];
			p2[0]=(java.awt.geom.Point2D.Double) c[0].p;
			p2[2*n-1]=(java.awt.geom.Point2D.Double) c[n-1].p;
			for(int i=0; i<n-1; ++i){
				p2[i*2+1]=p[i][0];
				p2[i*2+2]=p[i][1];
			}
//			System.out.println(Arrays.toString(p2));
			
			double[] dp=new double[2*n];
			for(int i=0; i<2*n; ++i)	dp[i]=INF;
			dp[0]=0;
			for(int i=0; i<2*n; ++i){
				for(int j=i+1; j<2*n; ++j){
					if(!f1(i,j))	continue;
					dp[j]=min(dp[j], dp[i]+p2[i].distance(p2[j]));
//					System.out.println(i+" "+j+" "+dp[j]);
				}
			}
			
			System.out.println(dp[2*n-1]);
		}
		boolean f1(int from,int to){
			int f=(from+1)/2-1, t=(to+1)/2-1;
			Line2D.Double l=new Line2D.Double(p2[from], p2[to]);
			for(int i=f+1; i<t; ++i)if(!new Line2D.Double(p[i][0], p[i][1]).intersectsLine(l))	return false;
			return true;
		}
		Point2D.Double[] intersectR(C a,C b){
			double dis = a.p.distance(b.p);
			if(dis > a.r + b.r)	return null;
			Point2D v = sub(b.p, a.p);
			double rc = (dis*dis+a.r*a.r-b.r*b.r)/(2*dis);
			double rate = rc/dis;
			v = mul(rate,v);
			Point2D c = add(v, a.p);
			double disC2c = c.distance(b.p);
			double disqc = Math.sqrt(b.r*b.r - disC2c*disC2c);
			Point2D v2 = sub(b.p, c);
			v2 = mul(disqc / disC2c, v2);
			Point2D.Double[] ret = new Point2D.Double[2];
			ret[0] = (Point2D.Double)add(normalVector1(v2), c);
			ret[1] = (Point2D.Double)add(normalVector2(v2), c);
			return ret;
		}
		Point2D add(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		}
		Point2D sub(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(), p1.getY()-p2.getY());
		}
		Point2D mul(double v,Point2D p){
			return new Point2D.Double(p.getX()*v, p.getY()*v);
		}
		Point2D normalVector1(Point2D p){
			return new Point2D.Double(-p.getY(), p.getX());
		}
		Point2D normalVector2(Point2D p){
			return new Point2D.Double(p.getY(), -p.getX());
		}
		class C{
			Point2D p;
			double r;
			C(int x,int y,int r){
				this.p=new Point2D.Double(x,y);
				this.r=r;
			}
			
		}
	}
}