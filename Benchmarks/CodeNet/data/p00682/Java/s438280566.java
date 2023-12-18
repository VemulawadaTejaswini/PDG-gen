import java.util.Scanner;

public class Main{

	public static final double EPS = 1e-8;

	public static class P implements Comparable<P>{
		public double x;
		public double y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		//ÀWª¶ºÉ éÙÇ\[gñÉ¨¢ÄOÉé
		public int compareTo(P o) {
			if(equals(o))return 0;
			if(Math.abs(x-o.x)<EPS){
				return y-o.y<0?1:y-o.y>0?-1:0;
			}
			return x-o.x<0?1:x-o.x>0?-1:0;
		}
		public boolean equals(P o){
			return Math.abs(x-o.x)<EPS && Math.abs(y-o.y)<EPS;
		}
		@Override
		public String toString() {
			return "("+x+","+y+")";
		}
	}

	/**
	 * s->txNg
	 */
	public static class Vec{
		public P s;
		public P t;
		public double dx;
		public double dy;
		public Vec(P t){
			this.s = new P(0, 0);
			this.t = t;
			dx = t.x-s.x;
			dy = t.y-s.y;
		}
		public Vec(P s, P t) {
			this.s = s;
			this.t = t;
			dx = t.x-s.x;
			dy = t.y-s.y;
		}
		public Vec reverse(){
			return new Vec(t, s);
		}
		/**
		 * xNgÌå«³
		 */
		public double norm(){
			return Math.sqrt(dx*dx+dy*dy);
		}
		/**
		 * àÏ
		 */
		public double dotProduct(Vec o){
			return dx*o.dx + dy*o.dy;
		}
		/**
		 * OÏ
		 */
		public double crossProduct(Vec o){
			return dx*o.dy - dy*o.dx;
		}
		/**
		 * xNg o Æ¼ðµÄ¢é©
		 * ð_ðÁÄ¢éKvÍÈ¢
		 * Verify: AOJ0058
		 */
		public boolean isOrthogonal(Vec o){
			return dotProduct(o)==0;
		}
		/**
		 * xNg o Æ½s©
		 */
		public boolean isParallel(Vec o){
			return crossProduct(o)==0;
		}
		/**
		 * CCW
		 */
		public int ccw_(P p){
			return ccw(s, t, p);
		}
		/**
		 * xNg o Æðíé©
		 */
		public boolean isCross(Vec o){
			return ccw_(o.s)*ccw_(o.t) < EPS && o.ccw_(s)*o.ccw_(t) < EPS ||
			ccw_(o.s)*ccw_(o.t) < EPS && o.ccw_(s)*o.ccw_(t) < EPS;
		}
		/**
		 * _p ©çxNg·üãÖüðø¢½Æ«Ì·³
		 */
		public double distanceFromPoint(P p){
			Vec o = new Vec(s, p);
			return Math.abs(crossProduct(o))/norm();
		}
		@Override
		public String toString() {
			return s+"->"+t;
		}
	}

	/**
	 * CCW: counter clock wise
	 * 1 : clock wise
	 * -1: counter clock wise
	 * 2 : c--a--b on line
	 * -2: a--b--c on line
	 * 0 : a--c--b or a--c=b on line
	 */
	public static int ccw(P p1, P p2, P p3){
		Vec a = new Vec(p1, p2);
		Vec b = new Vec(p1, p3);
		if(a.crossProduct(b)<0)return 1;
		if(a.crossProduct(b)>0)return -1;
		//if program run here, three points on line because AxB = 0 shows parallel
		if(a.dotProduct(b)<0)return 2;
		if(a.norm() < b.norm())return -2;
		return 0;
	}

	public static double area(P[] p){
		int n = p.length;
		double a = 0;
		for(int i=0;i<n;i++){
			a += p[i].x*p[(i+1)%n].y-p[i].y*p[(i+1)%n].x;
		}
		return Math.abs(a/2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = 1;
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			P[] p = new P[n];
			for(int i=0;i<n;i++)p[i]=new P(sc.nextDouble(), sc.nextDouble());
			System.out.println(t++ + " " + area(p));
		}
	}
}