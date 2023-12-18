
import java.util.*;
import java.awt.geom.*;
public class Main {

	class Point extends Point2D.Double implements Comparable<Point2D.Double>{
		Point(double x, double y){
			super(x,y);
		}
		@Override
		public int compareTo(Point2D.Double o) {
			if(super.x < o.x) return -1;
			if(super.x > o.x) return 1;
			if(super.y < o.y) return -1;
			if(super.y > o.y) return 1;
			return 0;
		}
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			Point []  plist = new Point[n];
			for(int i = 0; i < n; i++){
				String [] a = sc.next().split(",");
				double x = Double.parseDouble(a[0]);
				double y = Double.parseDouble(a[1]);
				plist[i] = new Point(x, y);
			}
			Arrays.sort(plist);
			
			ArrayList<Point2D> res = convexHull(plist);
			System.out.println(n - res.size());
		}
	}

	private ArrayList<Point2D> convexHull(Point2D [] plist) {
		int n = plist.length;
		int k = 0;
		Point2D [] qs = new Point2D[n * 2];
		
		for(int i = 0; i < n; i++){
			while(k > 1 && cross(sub(qs[k-1], qs[k-2]), (sub(plist[i],qs[k-1]))) <= 0){
				k--;
			}
			qs[k++] = plist[i];
		}
		
		for(int i = n - 2, t = k; i >= 0; i--){
			while(k > t && cross(sub(qs[k-1],qs[k-2]), (sub(plist[i],qs[k-1]))) <= 0){
				k--;
			}
			qs[k++] = plist[i];
		}
		ArrayList<Point2D> res = new ArrayList<Point2D>();
		for(int i = 0; i < k - 1;i++){
			res.add(qs[i]);
		}
		
		return res;
	}

	private double cross(Point2D p1, Point2D p2) {
		double res = p1.getX() * p2.getY() - p1.getY() * p2.getX();
		return res;
	}

	private Point2D sub(Point2D p1, Point2D p2) {
		double x = p1.getX() - p2.getX();
		double y = p1.getY() - p2.getY();
		return new Point2D.Double(x, y);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}