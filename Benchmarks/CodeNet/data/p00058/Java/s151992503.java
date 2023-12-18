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
	}

	/**
	 * s->txNg
	 * @author y-koashi
	 *
	 */
	public static class Vec{
		public P s;
		public P t;
		public double dx;
		public double dy;
		public Vec(P s, P t) {
			this.s = s;
			this.t = t;
			dx = t.x-s.x;
			dy = t.y-s.y;
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
		 * xNgoÆ¼ðµÄ¢é©
		 * ð_ðÁÄ¢éKvÍÈ¢
		 * @param o
		 * @return
		 */
		public boolean isOrthogonal(Vec o){
			return dotProduct(o)==0;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()){
				P p1 = new P(sc.nextDouble(), sc.nextDouble());
				P p2 = new P(sc.nextDouble(), sc.nextDouble());
				P p3 = new P(sc.nextDouble(), sc.nextDouble());
				P p4 = new P(sc.nextDouble(), sc.nextDouble());
				//Vec v1 = new Vec(p1, p2);
				//Vec v2 = new Vec(p3, p4);
				if(v1==null||v2==null)System.out.println("WRONG");else
				System.out.println(v1.isOrthogonal(v2)?"YES":"NO");
			}
		}
	}
}