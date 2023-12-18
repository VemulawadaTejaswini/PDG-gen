import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static class UFO implements Comparable<UFO>{
		Point2D pos;
		int radius;
		int speed;
		int R;
		
		public UFO(Point2D pos, int radius, int speed, int R) {
			super();
			this.pos = pos;
			this.radius = radius;
			this.speed = speed;
			this.R = R;
		}
		
		public double arrival_minute(){
			return (pos.dist_o() - R + Point2D.EPS) / speed;
		}
		
		public void move(){
			Point2D old = pos;
			pos = pos.sub(pos.unit().mul(speed));
			
			if(old.dot(pos) < 0){
				pos = new Point2D(0, 0);
			}
		}
		
		public boolean is_in(){
			return ((pos.dist_o() - R) + Point2D.EPS) <= 0;
		}
		
		public boolean is_hit(Point2D start, Point2D end){
			if(end.sub(start).dot(pos) + Point2D.EPS <= 0){
				return false;
			}
			
			return pos.pld(start, end) <= (radius + Point2D.EPS);
		}

		@Override
		public int compareTo(UFO arg0) {
			double t = this.pos.dist_o();
			double u = arg0.pos.dist_o();
			
			if(t < u){
				return -1;
			}else if(t > u){
				return 1;
			}else{
				return 0;
			}
		}
		
		public String toString(){
			return "<x = " + (int)(pos.x) + " , y = " + (int)(pos.y) + " , dist = " + (int)(pos.dist_o()) + " minute = " + (int)(arrival_minute()) + " >";
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int R = sc.nextInt();
			final int N = sc.nextInt();
			
			if(R == 0 && N == 0){
				break;
			}
			
			ArrayList<UFO> ufos = new ArrayList<UFO>(N);
			
			for(int i = 0; i < N; i++){
				final int x = sc.nextInt();
				final int y = sc.nextInt();
				final int r = sc.nextInt();
				final int v = sc.nextInt();
				
				ufos.add(new UFO(new Point2D(x, y), r, v, R));
			}
			Collections.sort(ufos);
			
			int count = 0;
			while(!ufos.isEmpty()){
				for(UFO ufo : ufos){
					ufo.move();
				}

				//System.out.println(ufos);
				
				for(ListIterator<UFO> iter = ufos.listIterator(); iter.hasNext(); ){
					UFO ufo = iter.next();
					if(ufo.is_in()){
						iter.remove();
						count++;
					}
				}
				
				if(ufos.isEmpty()){
					break;
				}
				Collections.sort(ufos);
				
				UFO shoted = ufos.get(0);
				Point2D start = new Point2D(0, 0);
				Point2D end = shoted.pos;
				
				for(ListIterator<UFO> iter = ufos.listIterator(); iter.hasNext(); ){
					UFO ufo = iter.next();
					if(ufo.is_hit(start, end)){
						iter.remove();
					}
				}
			}
			
			System.out.println(count);
		}
		
	}

}

class Point2D {
	public double x;
	public double y;

	public static final double EPS = 1e-9;

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point2D(Point2D point) {
		this.x = point.x;
		this.y = point.y;
	}

	public String toString() {
		return x + "," + y;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Point2D) {
			Point2D another = (Point2D) o;
			if (this.x - EPS < another.x && this.x + EPS > another.x
					&& this.y - EPS < another.y && this.y + EPS > another.y) {
				return true;
			}
			
			return false;

			// return this.x == another.x && this.y == another.y;
		}
		return false;
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
			return end.sub(start).cross(this.sub(start)) / end.dist(start);
		}
	}

	public static boolean intersect_s(Point2D a1, Point2D a2, Point2D b1,
			Point2D b2) {
		return (a2.sub(a1).cross(b1.sub(a1)) * a2.sub(a1).cross(b2.sub(a1)) < EPS)
				&& (b2.sub(b1).cross(a1.sub(b1)) * b2.sub(b1).cross(a2.sub(b1)) < EPS);
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