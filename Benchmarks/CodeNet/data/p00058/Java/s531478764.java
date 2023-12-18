import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ0058().doIt();
	}
	
	class AOJ0058{
		final double EPS=1.0e-8; 
		boolean parallel(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){     
			double kata1=(y1-y2)/(x1-x2);
			double kata2=(y3-y4)/(x3-x4);
			if(kata1==kata2)return true;
			if((y1-y2==0&&y3-y4==0)||(x1-x2==0&&x3-x4==0))return true;
			return false;
		}
		boolean parallel(Line2D l1,Line2D l2){
			return parallel(l1.getP1().getX(), l1.getP1().getY(), l1.getP2().getX(),l1.getP2().getY(),
					l2.getP1().getX(),l2.getP1().getY(),l2.getP2().getX(),l2.getP2().getY());
		}
		boolean orthogonal(Line2D l1,Line2D l2){
			return orthogonal(l1.getP1().getX(), l1.getP1().getY(), l1.getP2().getX(),l1.getP2().getY(),
					l2.getP1().getX(),l2.getP1().getY(),l2.getP2().getX(),l2.getP2().getY());
		}
		boolean orthogonal(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
			double a=(y1-y2)/(x1-x2);
			double b=(y3-y4)/(x3-x4);
			if(Math.abs(a-(-(1/b)))<EPS||Math.abs((-(1/a)-b))<EPS)return true;
			if(Math.abs((-(1/b))-a)<EPS||Math.abs(b-(-(1/a)))<EPS)return true;
			return false;
		}
		
		void doIt(){
			Line2D l1 = new Line2D.Double(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble());
			Line2D l2 = new Line2D.Double(in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble());
			if(parallel(l1, l2))System.out.println("NO");
			else if(orthogonal(l1, l2))System.out.println("YES");
			else System.out.println("NO");
		}
	}
	
}