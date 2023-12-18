import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new Q2001A();
	}
	
	class Q2001A{
		int N;
		Q2001A(){
			while(true){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			Point2D[][] p=new Point2D[N+2][N+2];
			for(int x=1; x<=N; ++x)	p[x][0]=new Point2D.Double(sc.nextDouble(), 0.0);
			for(int x=1; x<=N; ++x)	p[x][N+1]=new Point2D.Double(sc.nextDouble(), 1.0);
			for(int y=1; y<=N; ++y)	p[0][y]=new Point2D.Double(0.0, sc.nextDouble());
			for(int y=1; y<=N; ++y)	p[N+1][y]=new Point2D.Double(1.0, sc.nextDouble());
			p[0][0] = new Point2D.Double(0, 0);
			p[N+1][0] = new Point2D.Double(1, 0);
			p[0][N+1] = new Point2D.Double(0, 1);
			p[N+1][N+1] = new Point2D.Double(1, 1);
			for(int x=1; x<=N; ++x){
				Line2D.Double col = new Line2D.Double(p[x][0], p[x][N+1]);
				for(int y=1; y<=N; ++y){
					Line2D.Double row = new Line2D.Double(p[0][y], p[N+1][y]);
					p[x][y] = intersectionPoint(row, col);
				}
			}
			
			double ans=0.0;
			for(int x=0; x<=N; ++x)for(int y=0; y<=N; ++y){
				Point2D v1 = diff(p[x+1][y], p[x][y]),
						v2 = diff(p[x][y+1], p[x][y]);
				double area = abs(cross(v1, v2) /2);
				Point2D v3 = diff(p[x][y+1], p[x+1][y+1]),
						v4 = diff(p[x+1][y], p[x+1][y+1]);
				area += abs(cross(v3, v4)/2);
				ans = max(ans, area);
			}
			
			System.out.printf("%.6f\n", ans);
			
		}
		Point2D intersectionPoint(Line2D l1,Line2D l2){
			return intersectionPoint(l1.getP1(), l1.getP2(), l2.getP1(), l2.getP2());
		}
		Point2D intersectionPoint(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
			Point2D a=diff(a2,a1),
					b=diff(b2,b1);
			return sum(a1, mul(cross(b, diff(b1,a1))/cross(b,a), a));
		}
		Point2D diff(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()-p2.getX(), p1.getY()-p2.getY());
		}
		double cross(Point2D p1,Point2D p2){
			return p1.getX()*p2.getY() - p2.getX()*p1.getY();
		}
		Point2D mul(double n,Point2D p1){
			return new Point2D.Double(p1.getX()*n, p1.getY()*n);
		}
		Point2D sum(Point2D p1,Point2D p2){
			return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
		}
	}

}