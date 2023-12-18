import java.util.*;
import java.awt.geom.*;

public class Main {
	double EPS = 1.0e-08;
	
	public class Circle{
		Point2D p;
		double r;
		public Circle(Point2D p, double r) {
			this.p = p; this.r = r;
		}
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Circle [] clist = new Circle[n];
			for(int i = 0; i < n; i++){
				String [] s = sc.next().split(",");
				Point2D p = new Point2D.Double(Double.parseDouble(s[0]), Double.parseDouble(s[1]));
				clist[i] = new Circle(p, 1.0);
			}
			
			int res = 0;
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					Point2D [] interp = intersectPtCC(clist[i], clist[j]);
					for(int k = 0; k < interp.length; k++){
						int result = count(clist, interp[k]);
						res = Math.max(res, result);
					}
				}
			}
			System.out.println(res);
		}
	}
	
	private int count(Circle[] clist, Point2D p) {
		int count = 0;
		for(int i = 0; i < clist.length; i++){
			if(clist[i].p.distance(p) - 1.0 <= EPS){
				count++;
			}
		}
		return count;
	}

	Point2D [] intersectPtCC(Circle a,Circle b) {
		double dis = a.p.distance(b.p);
		Point2D v = sub(b.p, a.p);
		double rc = (dis * dis + a.r * a.r - b.r * b.r) / (2 * dis);
		double rate = rc / dis;
		v = mul(v, rate);
		Point2D c = add(v, a.p);
		double disC2c = c.distance(b.p);
		double disqc = Math.sqrt(b.r * b.r - disC2c * disC2c);
		Point2D v2 = sub(b.p, c);
		v2 = mul(v2, disqc / disC2c);
		Point2D [] res = new Point2D[2];
		res[0] = add(normalVector1(v2), c);
		res[1] = add(normalVector2(v2), c);
		return res;
	}
	
	private Point2D sub(Point2D p2, Point2D p1) {
		double x = p2.getX() - p1.getX();
		double y = p2.getY() - p1.getY();
		return new Point2D.Double(x, y);
	}
	
	private Point2D add(Point2D p1, Point2D p2) {
		double x = p2.getX() + p1.getX();
		double y = p2.getY() + p1.getY();
		return new Point2D.Double(x, y);
	}
	
	private Point2D mul(Point2D p,double value) {
		return new Point2D.Double(p.getX() * value, p.getY() * value);
	}
	
	private Point2D normalVector1(Point2D p) {
		return new Point2D.Double(-p.getY(), p.getX());
	}
	
	private Point2D normalVector2(Point2D p) {
		return new Point2D.Double(p.getY(), -p.getX());
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}