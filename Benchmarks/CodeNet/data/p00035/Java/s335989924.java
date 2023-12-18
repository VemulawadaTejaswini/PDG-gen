import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String s = sc.next();
			String[] pos = s.split(",");
			Vec2dD[] p = new Vec2dD[4];
			for(int i=0;i<4;i++) {
				p[i] = new Vec2dD(Double.valueOf(pos[i*2]), Double.valueOf(pos[i*2+1]));
			}
			System.out.println(Vec2dD.intersect(p[0],p[2],p[1],p[3]) ? "YES" : "NO");
		}
	}
}

class Vec2dD {
	public static double EPS = 1e-08;
	double x = 0;
	double y = 0;
	public Vec2dD(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double dot(Vec2dD v) {
		return this.x*v.x+this.y*v.y;
	}
	public double cross(Vec2dD v) {
		return this.x*v.y-this.y*v.x;
	}
	public Vec2dD add(Vec2dD v) {
		return new Vec2dD(this.x+v.x,this.y+v.y);
	}
	public Vec2dD subtract(Vec2dD v) {
		return new Vec2dD(this.x-v.x,this.y-v.y);
	}
	public Vec2dD multiply(double k) {
		return new Vec2dD(k*this.x,k*this.y);
	}
	public static boolean intersect(Vec2dD p0,Vec2dD p1,Vec2dD p2,Vec2dD p3) {
		Vec2dD v1 = p1.subtract(p0);
		Vec2dD v2 = p3.subtract(p2);
		Vec2dD v = p2.subtract(p0);
		Vec2dD v_ = p1.subtract(p0);
		double a = v1.cross(v2);
		if(a<=EPS) {
			return v.cross(v_) <= EPS && v.dot(v_) <= EPS;
		}else{
			double a1 = -v1.cross(v);
			double a2 = -v2.cross(v);
			return (-EPS<=a1&&a1<=a+EPS&&-EPS<=a2&&a2<=a+EPS);
		}
	}
	public String toString() {
		return this.x + " " + this.y;
	}
}