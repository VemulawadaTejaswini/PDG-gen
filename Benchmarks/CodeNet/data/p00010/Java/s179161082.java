import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ0010();
	}
	
	class AOJ0010{
		AOJ0010(){
			int n=sc.nextInt();
			while(--n>=0)	solve();
		}
		void solve(){
			Point2D p1=new Point2D.Double(sc.nextDouble(), sc.nextDouble()),
					p2=new Point2D.Double(sc.nextDouble(), sc.nextDouble()),
					p3=new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			Line2D l1=perpendicularBisector(p1, p2);
			Line2D l2=perpendicularBisector(p2, p3);
			Point2D p=intersectionPoint(l1, l2);
			System.out.printf("%.3f %.3f %.3f\n", p.getX(), p.getY(), p.distance(p1));
		}
	}
	
	
	// test
	
	final double EPS=1.0e-8;
	
	// 外積
	double cross(Point2D p1,Point2D p2){
		return p1.getX()*p2.getY() - p2.getX()*p1.getY();
	}
	
	// 内積
	double dot(Point2D p1,Point2D p2){
		return p1.getX()*p2.getX() + p2.getY()*p2.getY();
	}
	
	// 和
	Point2D sum(Point2D p1,Point2D p2){
		return new Point2D.Double(p1.getX()+p2.getX(), p1.getY()+p2.getY());
	}
	
	// 差
	Point2D diff(Point2D p1,Point2D p2){
		return new Point2D.Double(p1.getX()-p2.getX(), p1.getY()-p2.getY());
	}
	
	// スカラー倍
	Point2D mul(Point2D p1,double n){
		return new Point2D.Double(p1.getX()*n, p1.getY()*n);
	}
	
	// 長さ
	double abs(Point2D p1){
		return Math.sqrt(p1.getX()*p1.getX() + p1.getY()*p1.getY());
	}
	
	// 角度(radian)
	double angleR(Point2D p1,Point2D p2){
		return Math.acos(dot(p1,p2)/abs(p1)/abs(p2));
	}
	// 角度(degree)
	double angleD(Point2D p1,Point2D p2){
		return Math.toDegrees(angleR(p1, p2));
	}
	
	// 中点
	Point2D mid(Line2D l1){
		return mid(l1.getP1(),l1.getP2());
	}
	Point2D mid(Point2D p1,Point2D p2){
		return new Point2D.Double((p1.getX()+p2.getX())/2, (p1.getY()+p2.getY())/2);
	}
	
	// 垂直二等分線
	Line2D perpendicularBisector(Line2D l1){
		return perpendicularBisector(l1.getP1(), l1.getP2());
	}
	Line2D perpendicularBisector(Point2D p1,Point2D p2){
		Point2D mid=mid(p1,p2),
				diff=diff(p1,p2);
		return new Line2D.Double(mid, sum(mid, new Point2D.Double(diff.getY(), -diff.getX())));
	}
	
	// 2直線の交点（平行でない）
	Point2D intersectionPoint(Line2D l1,Line2D l2){
		return intersectionPoint(l1.getP1(), l1.getP2(), l2.getP1(), l2.getP2());
	}
	Point2D intersectionPoint(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
		Point2D a=diff(a2,a1),
				b=diff(b2,b1);
		return sum(a1, mul(a, cross(b, diff(b1,a1))/cross(b,a)));
	}
	
	String lineToStr(Line2D l){
		return "Line2D "+l.getP1()+"-"+l.getP2();
	}
	
}