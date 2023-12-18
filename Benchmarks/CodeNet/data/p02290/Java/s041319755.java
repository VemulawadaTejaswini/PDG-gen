import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJCGL_1C().doIt();
	}

	class AOJCGL_1C{
		private Point2D projection(Line2D l,Point2D p2){
			double kyori = l.getP1().distance(l.getP2());
			double angle = angle(l.getP1(),l.getP2(), p2);
			double t = l.getP1().distance(p2) * Math.cos(angle);
			Point2D result = new Point2D.Double(l.getP1().getX()+(l.getP2().getX()-l.getP1().getX())*t/kyori,
					l.getP1().getY()+(l.getP2().getY()-l.getP1().getY())*t/kyori);
			return result;
		}
		private double angle(Point2D p0, Point2D p1, Point2D p2){
			return Math.atan2(p2.getY()-p0.getY(),p2.getX()-p0.getX())-
					Math.atan2(p1.getY()-p0.getY(),p1.getX()-p0.getX());
		}
		void doIt(){
			Point2D p0 = new Point2D.Double(in.nextDouble(),in.nextDouble());
			Point2D p1 = new Point2D.Double(in.nextDouble(),in.nextDouble());
			int q = in.nextInt();
			for(int i=0;i<q;i++){
				Point2D p2 = new Point2D.Double(in.nextDouble(), in.nextDouble());
				Point2D ans = projection(new Line2D.Double(p0, p1), p2);
				System.out.printf("%.9f %.9f",ans.getX(),ans.getY());
			}
		}
	}

}