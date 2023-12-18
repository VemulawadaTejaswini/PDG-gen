import java.awt.geom.*;
import java.util.*;

public class Main {
	final double EPS = 1.0e-08;
	Point2D [] plist;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			plist = new Point2D[n];
			for(int i=0; i < n; i++){
				double x = sc.nextDouble(), y = sc.nextDouble();
				plist[i] = new Point2D.Double(x, y);
			}
			int ans = 1;
			for(int i=0; i < n; i++){
				for(int j=i+1; j < n; j++){					
					Point2D [] cpList = centerPoint(plist[i], plist[j]);
					if(cpList == null) continue;
					int res1 = distanceWithin1Radius(cpList[0]);
					int res2 = distanceWithin1Radius(cpList[1]);
					ans = Math.max(ans, Math.max(res1, res2));
				}
			}
			System.out.println(ans);
		}
	}

	private Point2D[] centerPoint(Point2D p1, Point2D p2) {
		double r = 1.0;
		double midx = (p1.getX() + p2.getX()) / 2.0;
		double midy = (p1.getY() + p2.getY()) / 2.0;
		Point2D midP = new Point2D.Double(midx, midy);
		Point2D p2p1 = sub(p2,p1);
		Point2D normalV1 = normalVector1(p2p1);
		Point2D normalV2 = normalVector2(p2p1);
		double halfdis = p1.distance(p2) / 2.0;
		if(halfdis > r + EPS) return null;
		double tocenterDis = Math.sqrt(r - halfdis * halfdis);
		Point2D [] res = new Point2D[2];
		res[0] = add(mul(normalV1, tocenterDis / norm(normalV1)), midP);
		res[1] = add(mul(normalV2, tocenterDis / norm(normalV1)), midP);
		return res;
	}
	private Point2D add(Point2D p1, Point2D p2) {
		double x = p2.getX() + p1.getX();
		double y = p2.getY() + p1.getY();
		return new Point2D.Double(x, y);
	}
	
	private Point2D sub(Point2D p2, Point2D p1) {
		double x = p2.getX() - p1.getX();
		double y = p2.getY() - p1.getY();
		return new Point2D.Double(x, y);
	}
	
	private Point2D mul(Point2D p,double value) {
		return new Point2D.Double(p.getX() * value, p.getY() * value);
	}
	
	private double norm(Point2D p){
		return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
	}
	
	private Point2D normalVector1(Point2D p) {
		return new Point2D.Double(-p.getY(), p.getX());
	}
	
	private Point2D normalVector2(Point2D p) {
		return new Point2D.Double(p.getY(), -p.getX());
	}

	private int distanceWithin1Radius(Point2D p) {
		int count = 0;
		for(int i=0; i < plist.length;i++){
			double res = p.distance(plist[i]);
			if(res<= 1.0 + EPS) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}