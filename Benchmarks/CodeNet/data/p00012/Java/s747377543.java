import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ0012();
	}
	class AOJ0012{
		AOJ0012(){
			while(sc.hasNext())	solve();
		}
		void solve(){
			// 外積が全て同じ符号なら内部にある
			Point2D[] p=new Point2D[3];
			for(int i=0; i<3; ++i)p[i]=new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			Point2D pp=new Point2D.Double(sc.nextDouble(), sc.nextDouble());
			int cnt=0;
			for(int i=0; i<3; ++i){
				double c=cross(diff(p[i],pp), diff(p[(i+1)%3],pp));
//				System.out.println(c);
				cnt+=(c>0?1:0);
			}
//			System.out.println(cnt);
			System.out.println(Math.abs(cnt)==3?"YES":"NO");
		}
	}
	class AOJ0058{
		AOJ0058(){
			while(sc.hasNext())	solve();
		}
		void solve(){
			// 内積が0なら直交する
			Line2D l1=new Line2D.Double(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble()),
					l2=new Line2D.Double(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			Point2D d1=diff(l1.getP1(),l1.getP2()),
					d2=diff(l2.getP1(),l2.getP2());
			double dot=dot(d1,d2);
//			System.out.println(dot);
			System.out.println(Math.abs(dot)<EPS?"YES":"NO");
		}
	}
	class AOJ0010{
		AOJ0010(){
			int n=sc.nextInt();
			while(--n>=0)	solve();
		}
		void solve(){
			// 垂直二等分線の交点
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
	
	// 外積 0010
	double cross(Point2D p1,Point2D p2){
		return p1.getX()*p2.getY() - p2.getX()*p1.getY();
	}
	
	// 内積 0058
	double dot(Point2D p1,Point2D p2){
		return p1.getX()*p2.getX() + p1.getY()*p2.getY();
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
	
	// ノルム
	double norm(Point2D p1){
		return p1.getX()*p1.getX() + p1.getY()*p1.getY();
	}
	
	// 長さ
	double abs(Point2D p1){
		return Math.sqrt(norm(p1));
	}
	
	// 角度(radian)
	double angleR(Point2D p1,Point2D p2){
		return Math.acos(dot(p1,p2)/abs(p1)/abs(p2));
	}
	// 角度(degree)
	double angleD(Point2D p1,Point2D p2){
		return Math.toDegrees(angleR(p1, p2));
	}
	
	// 中点 0010
	Point2D mid(Line2D l1){
		return mid(l1.getP1(),l1.getP2());
	}
	Point2D mid(Point2D p1,Point2D p2){
		return new Point2D.Double((p1.getX()+p2.getX())/2, (p1.getY()+p2.getY())/2);
	}
	
	// 垂直二等分線 0010
	Line2D perpendicularBisector(Line2D l1){
		return perpendicularBisector(l1.getP1(), l1.getP2());
	}
	Line2D perpendicularBisector(Point2D p1,Point2D p2){
		Point2D mid=mid(p1,p2),
				diff=diff(p1,p2);
		return new Line2D.Double(mid, sum(mid, new Point2D.Double(diff.getY(), -diff.getX())));
	}
	
	// 2直線の交差判定（平行=外積が0でなければ必ず交差する）
	boolean intersectLL(Line2D l1,Line2D l2){
		return intersectLL(l1.getP1(), l1.getP2(), l2.getP1(), l2.getP2());
	}
	boolean intersectLL(Point2D a1,Point2D a2,Point2D b1,Point2D b2){
		return (Math.abs(cross(diff(a2,a1), diff(b2,b1))) >EPS)||(Math.abs(cross(diff(a2,a1),diff(a1,b1)))<EPS);
	}
	
	// 2線分の交差判定 -> Line2D.intersectsLine()を使え
	
	// 2直線の交点（平行の場合どうなるか不明）0010
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