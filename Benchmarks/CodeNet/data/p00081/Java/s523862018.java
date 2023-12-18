import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Main();	
	}

	public Main() {
		while(sc.hasNext()){
			new aoj0081().doIt();
		}
	}
	class aoj0081 {
		private Point2D sub(Point2D p2, Point2D p1) {
	        double x = p2.getX() - p1.getX();
	        double y = p2.getY() - p1.getY();
	        return new Point2D.Double(x, y);
		}
		private Point2D mul(double value, Point2D p) {
	        return new Point2D.Double(p.getX() * value, p.getY() * value);
	    }
		private Point2D add(Point2D p1, Point2D p2) {
	        double x = p2.getX() + p1.getX();
	        double y = p2.getY() + p1.getY();
	        return new Point2D.Double(x, y);
		}
		private double norm(Point2D p){
			return p.getX() * p.getX() + p.getY() * p.getY();
		}
		private double dot(Point2D p1, Point2D p2){
	        return p1.getX() * p2.getX() + p1.getY() * p2.getY();
	    }
		private Point2D projection(Line2D l, Point2D p){
			double t = dot(sub(p, l.getP1()), sub(l.getP1(), l.getP2())) / norm(sub(l.getP1(), l.getP2()));
			return add(l.getP1(), mul(t, sub(l.getP1(), l.getP2())));
		}
		
		void doIt() {
			String str[] = sc.nextLine().split(",");
			double ab[] = new double[6];
			for(int i = 0;i < 6;i++){
				ab[i] = Double.parseDouble(str[i]);
			}
			Point2D P1 = new Point2D.Double(ab[0],ab[1]);
			Point2D P2 = new Point2D.Double(ab[2],ab[3]);
			Point2D Q = new Point2D.Double(ab[4],ab[5]);
			Line2D AB = new Line2D.Double(P1,P2);
			Point2D sa = projection(AB,Q);
			Point2D ans = new Point2D.Double(Q.getX() - (2*(Q.getX() - sa.getX())),Q.getY() - (2*(Q.getY() - sa.getY())));
			System.out.println(ans.getX()+" "+ans.getY());
		}
	}
}