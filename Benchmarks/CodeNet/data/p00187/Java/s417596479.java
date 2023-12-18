
import java.awt.geom.*;
import java.util.*;
public class Main {
	//1442 start
	
	double EPS = 1.0e-08;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			if((x1|y1|x2|y2) == 0) break;
			Line2D [] list = new Line2D[3];
			list[0] = new Line2D.Double(x1, y1, x2, y2);
			for(int i= 1; i < 3; i++){
				int xx1 = sc.nextInt();
				int yy1 = sc.nextInt();
				int xx2 = sc.nextInt();
				int yy2 = sc.nextInt();
				list[i] = new Line2D.Double(xx1, yy1, xx2, yy2);
			}
			
			boolean isOK = true;
			Point2D [] plist = new Point2D[3];
			for(int i = 0; i < 3; i++){
				if(list[i].intersectsLine(list[(i+1) % 3])){
					Point2D v1 = sub(list[i]);
					Point2D v2 = sub(list[(i+1) % 3]);
					if(Math.abs(cross(v1, v2)) < EPS){
						isOK = false;
						break;
					}
					else{
						plist[i] = intersectPtSS(list[i], list[(i+1) % 3]);
					}
				}
				else{
					isOK = false;
					break;
				}
			}
			if(isOK && plist[0].distance(plist[1]) < EPS && plist[0].distance(plist[2]) < EPS) isOK = false;
			if(isOK){
				double res = area(plist);
				if(res < 100000){
					System.out.println("syo-kichi");
				}
				else if(res < 1000000){
					System.out.println("kichi");
				}
				else if(res < 1900000){
					System.out.println("chu-kichi");
				}
				else{
					System.out.println("dai-kichi");
				}
			}
			else{
				System.out.println("kyo");
			}
		}
	}

	private double area(Point2D[] plist) {
		double res = 0;
		for(int i = 0; i < plist.length; i++){
			res += cross(plist[i], plist[(i + 1) % plist.length]);
		}
		return Math.abs(res / 2);
	}

	private Point2D intersectPtSS(Line2D l, Line2D m) {
		Point2D lv = sub(l.getP2(), l.getP1());
		Point2D mv = sub(m.getP2(), m.getP1());
		Point2D mlv = sub(m.getP1(), l.getP1());
		double a = cross(mlv, lv);
		double b = cross(lv, mv);
		if(Math.abs(a) < EPS && Math.abs(b) < EPS){
			if(l.getP1().distance(m.getP1()) < EPS) return l.getP1();
			if(l.getP1().distance(m.getP2()) < EPS) return l.getP1();
			return l.getP2();
		}
		double t = a / b;
		double x = m.getX1() + t * mv.getX();
		double y = m.getY1() + t * mv.getY();
		
		return new Point2D.Double(x, y);
	}

	private Point2D sub(Point2D p1, Point2D p2) {
		double x = p1.getX() - p2.getX();
		double y = p1.getY() - p2.getY(); 
		return new Point2D.Double(x, y);
	}

	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}

	private Point2D sub(Line2D l) {
		double x = l.getX1() - l.getX2();
		double y = l.getY1() - l.getY2();
		return new Point2D.Double(x,y);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}