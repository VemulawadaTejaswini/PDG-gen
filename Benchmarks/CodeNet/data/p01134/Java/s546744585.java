import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	/*
	public static class UnionFind{
		int[] dat;
		
		public UnionFind(int n){
			dat = new int[n];
			for(int i = 0; i < n; i++){
				dat[i] = i;
			}
		}
		
		public int find(int x){
			if(dat[x] == x){
				return x;
			}else{
				return dat[x] = find(dat[x]);
			}
		}
		
		public void union(int x, int y){
			if(find(x) == find(y)){
				return;
			}else{
				dat[find(x)] = find(y);
			}
		}
		
		public boolean same(int x, int y){
			return find(x) == find(y);
		}
	}
	*/
	
	public static int segment_arangement(Point2D[][] segments, Set<Point2D> points){
		for(int i = 0; i < segments.length; i++){
			points.add(segments[i][0]);
			points.add(segments[i][1]);
			
			//System.out.println(segments[i][0].compareTo(segments[i][1]));
			
			//System.out.println("1: " + points);
			
			for(int j = i + 1; j < segments.length; j++){
				if(Point2D.intersect_s(segments[i][0], segments[i][1], segments[j][0], segments[j][1])){
					points.add(Point2D.interpoint_s(segments[i][0], segments[i][1], segments[j][0], segments[j][1]));
				}
			}
			
			//System.out.println("2 : " + points);
		}
		
		int count = 0;
		for(int i = 0; i < segments.length; i++){
			int co = 0;
			for(Point2D point : points){
				if(point.pos(segments[i][0], segments[i][1])){
					co++;
				}
			}
			
			count += co - 1;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Point2D ul = new Point2D(-100, -100);
		Point2D ur = new Point2D( 100, -100);
		Point2D dr = new Point2D( 100,  100);
		Point2D dl = new Point2D(-100,  100);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			Point2D[][] segs = new Point2D[n+4][2];
			segs[0][0] = ul;
			segs[0][1] = ur;
			segs[1][0] = ur;
			segs[1][1] = dr;
			segs[2][0] = dr;
			segs[2][1] = dl;
			segs[3][0] = dl;
			segs[3][1] = ul;
			
			for(int i = 0; i < n; i++){
				segs[i + 4][0] = new Point2D(sc.nextInt(), sc.nextInt());
				segs[i + 4][1] = new Point2D(sc.nextInt(), sc.nextInt());
			}
			
			TreeSet<Point2D> points = new TreeSet<Point2D>();
			int edges = segment_arangement(segs, points);
			
			//System.out.println(points);
			
			final int diff = edges - (points.size() - 1);
			
			System.out.println(diff);
		}

	}
}

class Point2D implements Comparable<Point2D>{
	public double x;
	public double y;

	public static final double EPS = 1e-13;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point2D(Point2D point) {
		this.x = point.x;
		this.y = point.y;
	}

	public String toString() {
		return "<" + x + " ," + y + ">";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Point2D) {
			Point2D another = (Point2D) o;
			
			if(Point2D.eq(this.x, another.x) && Point2D.eq(this.y, another.y)){
				return true;
			}
			
			return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Point2D arg0) {
		if(this.equals(arg0)){
			return 0;
		}else if(Point2D.eq(this.x, arg0.x)){
			return Point2D.signum(this.y - arg0.y);
		}else {
			return Point2D.signum(this.x - arg0.x);
		}
	}

	public Point2D add(double x, double y) {
		return new Point2D(this.x + x, this.y + y);
	}

	public Point2D sub(double x, double y) {
		return add(-x, -y);
	}

	public Point2D add(Point2D another) {
		return add(another.x, another.y);
	}

	public Point2D sub(Point2D another) {
		return sub(another.x, another.y);
	}

	public Point2D mul(double d) {
		return new Point2D(this.x * d, this.y * d);
	}

	public Point2D div(double d) {
		return new Point2D(this.x / d, this.y / d);
	}

	public double dot(double x, double y) {
		return this.x * x + this.y * y;
	}

	public double dot(Point2D another) {
		return dot(another.x, another.y);
	}

	public double cross(double x, double y) {
		return this.x * y - this.y * x;
	}

	public double cross(Point2D another) {
		return cross(another.x, another.y);
	}

	public double dist(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));
	}

	public double dist(Point2D another) {
		return dist(another.x, another.y);
	}

	public double dist_o() {
		return dist(0, 0);
	}

	public Point2D unit() {
		return div(dist_o());
	}

	public boolean pol(Point2D start, Point2D end) {
		return end.sub(start).cross(this.sub(start)) < EPS;
	}

	public boolean pos(Point2D start, Point2D end) {
		return (start.dist(this) + this.dist(end) < start.dist(end) + EPS);
	}

	public double pld(Point2D start, Point2D end) {
		return Math.abs((end.sub(start).cross(this.sub(start)))
				/ end.sub(start).dist_o());
	}

	public double psd(Point2D start, Point2D end) {
		if (end.sub(start).dot(this.sub(start)) < EPS) {
			return this.dist(start);
		} else if (start.sub(end).dot(this.sub(end)) < EPS) {
			return this.dist(end);
		} else {
			return Math.abs(end.sub(start).cross(this.sub(start)) / end.dist(start));
		}
	}
	
	public static int signum(double x){
		return Math.abs(x) < EPS ? 0 : x > 0 ? 1 : -1;
	}
	
	public static boolean eq(double x, double y){
		return signum(x - y) == 0;
	}
	
	public static int ccw(Point2D p, Point2D r, Point2D s){
		Point2D a = r.sub(p);
		Point2D b = s.sub(p);
		
		final int sgn = Point2D.signum(a.cross(b));
		if(sgn != 0){
			return sgn;
		}else if(a.x * b.x < -EPS && a.y * b.y < -EPS){
			return -1;
		}else if(a.dist_o() < b.dist_o() - EPS){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static boolean intersect_s(Point2D a1, Point2D a2, Point2D b1,
			Point2D b2) {
		return (Point2D.ccw(a1, a2, b1) * Point2D.ccw(a1, a2, b2) <= 0)
				&& (Point2D.ccw(b1, b2, a1) * Point2D.ccw(b1, b2, a2) <= 0);
	}

	public static boolean insersect_l(Point2D a1, Point2D a2, Point2D b1,
			Point2D b2) {
		return a1.sub(a2).cross(b1.sub(b2)) < EPS;
	}

	public static Point2D interpoint_s(Point2D a1, Point2D a2, Point2D b1,
			Point2D b2) {
		Point2D b = b2.sub(b1);
		double d1 = Math.abs(b.cross(a1.sub(b1)));
		double d2 = Math.abs(b.cross(a2.sub(b1)));
		double t = d1 / (d1 + d2);
		Point2D a = a2.sub(a1), v = a.mul(t);
		return a1.add(v);
	}

	public static Point2D interpoint_l(Point2D a1, Point2D a2, Point2D b1,
			Point2D b2) {
		Point2D a = a2.sub(a1);
		Point2D b = b2.sub(b1);
		double t = b.cross(b1.sub(a1)) / b.cross(a);
		Point2D v = a.mul(t);
		return a1.add(v);
	}

	public static Point2D[] cross_ss(Point2D p1, double r1, Point2D p2,
			double r2) {
		double dis = p1.dist(p2);

		if (r1 + EPS > r2 && r1 - EPS < r2 && dis < EPS) {
			return new Point2D[0]; // same
		}

		if (dis - EPS < r1 + r2 && dis + EPS > r1 + r2) {
			Point2D tmp = p2.sub(p1);
			tmp = tmp.mul(r1 / tmp.dist_o());
			Point2D ret[] = new Point2D[1];
			ret[0] = p1.add(tmp);
			return ret;
		} else if (dis + EPS > r1 + r2) {
			return new Point2D[0]; // out
		}

		double dis_m = Math.abs(r1 - r2);

		if (dis_m + EPS > dis && dis_m - EPS < dis) {
			Point2D tmp = null;
			if (r1 > r2) {
				tmp = p2.sub(p1);
			} else {
				tmp = p1.sub(p2);
			}

			double min = Math.min(r1, r2);

			tmp = tmp.mul((min + tmp.dist_o()) / tmp.dist_o());

			Point2D ret[] = new Point2D[1];
			ret[0] = p1.add(tmp);
			return ret;
		} else if (dis_m + EPS > dis) {
			return new Point2D[0]; // inner
		} else {
			Point2D ret[] = new Point2D[2];

			double theta = Math.acos((dis * dis + r1 * r1 - r2 * r2)
					/ (2 * dis * r1));
			double a = Math.atan2(p2.y - p1.y, p2.x - p1.x);

			ret[0] = new Point2D(r1 * Math.cos(a + theta) + p1.x, r1
					* Math.sin(a + theta) + p1.y);
			ret[1] = new Point2D(r1 * Math.cos(a - theta) + p1.x, r1
					* Math.sin(a - theta) + p1.y);
			return ret;
		}
	}
	
	public static double ss_dist(Point2D start1, Point2D end1, Point2D start2, Point2D end2){
		if(Point2D.intersect_s(start1, end1, start2, end2)){
			return 0;
		}else{
			return Math.min(Math.min(Math.min(start1.psd(start2, end2), end1.psd(start2, end2)), start2.psd(start1, end1)), end2.psd(start1, end1));
		}
	}
	
	public void interpoint_lc(Point2D start, Point2D end, Point2D c, double r,
			Point2D ans[]) {
		if (c.pld(start, end) > r + EPS)
			return;
		Point2D v = end.sub(start).unit();
		double delta = v.dot(start.sub(c)) * v.dot(start.sub(c))
				- start.dist(c) * start.dist(c) + r * r;
		double t = -v.dot(start.sub(c));
		double s = Math.sqrt(delta);
		ans[0] = start.add(v.mul(t + s));
		ans[1] = start.add(v.mul(t + s));
	}

	public Point2D normal_vector(Point2D p, Point2D a, Point2D b) {
		Point2D v = b.sub(a).unit();
		v = v.cross(p.sub(a)) > 0 ? new Point2D(v.y, (-1) * v.x) : new Point2D(
				(-1) * v.y, v.x);
		return v.mul(p.pld(a, b));
	}

	public double area(Point2D a, Point2D b, Point2D c) {
		return Math.abs((c.sub(a).cross(b.sub(a))) * 0.5);
	}
}