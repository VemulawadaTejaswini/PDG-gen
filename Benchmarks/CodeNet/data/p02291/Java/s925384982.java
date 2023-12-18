import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJCGL_1B().doIt();
	}

	class AOJCGL_1B{
		void doIt(){
			Point2D p0 = new Point2D.Double(in.nextDouble(), in.nextDouble());
			Point2D p1 = new Point2D.Double(in.nextDouble(), in.nextDouble());
			int q = in.nextInt();
			for(int i=0;i<q;i++){
				Point2D p2 = new Point2D.Double(in.nextDouble(),in.nextDouble());
				Point2D result = getVerticalPoint(p0,p1,p2);
				double dx = result.getX()-p2.getX();
				double dy = result.getY()-p2.getY();
//				System.out.println(dx+" "+dy);
//				System.out.println(result.getX()+" "+result.getY());
				double tx = dx+result.getX();
				double ty = dy+result.getY();
				System.out.printf("%.9f %.9f\n",tx,ty);
			}
		}
		
		//p0-p1の直線があるときに直線p2から直線らしたときp0-p1上の垂直な点を求める。
		private Point2D getVerticalPoint(Point2D p0,Point2D p1,Point2D p2){
			double kyori = p0.distance(p1);
			double angle = angle(p0, p1, p2);
			double t = p0.distance(p2) * Math.cos(angle);
			Point2D result = new Point2D.Double(p0.getX()+(p1.getX()-p0.getX())*t/kyori,
					p0.getY()+(p1.getY()-p0.getY())*t/kyori);
			return result;
		}

		private double angle(Point2D p0, Point2D p1, Point2D p2){
			return Math.atan2(p2.getY()-p0.getY(),p2.getX()-p0.getX())-
					Math.atan2(p1.getY()-p0.getY(),p1.getX()-p0.getX());
		}

	}
}