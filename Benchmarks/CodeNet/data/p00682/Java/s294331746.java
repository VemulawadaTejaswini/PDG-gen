import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int cas=0;
		while (true) {
			cas++;
			int n = sc.nextInt();
			ArrayList<P> plist = new ArrayList<P>();
			for (int i :new Range(0,n)) {
				plist.add(new P(sc.nextDouble(),sc.nextDouble()));
			}
			ln(String.format("%d %.1f",cas,-P.getS(plist)));
		}
	}



	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}
class Range implements Iterable<Integer> {
	int s,e;
	Range(int _s,int _e){
		s=_s;e=_e;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new It(s,e);
	}
	class It implements Iterator<Integer> {
		private int s,e;
		It(int _s,int _e){
			s=_s;e=_e;
		}
		@Override
		public boolean hasNext() {
			return s<e;
		}
		@Override
		public Integer next() {
			return s++;
		}
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}

class P {
	double x, y;
	public static final double EPS = 1e-10;

	P(double _x, double _y) {
		x = _x;
		y = _y;
	}

	public static final P Xunit = new P(1, 0);
	public static final P Yunit = new P(0, 1);
	public static final P O = new P(0, 0);

	public static double dot(P a, P b) {
		return a.x * b.x + a.y * b.y;
	}

	public static double cross(P a, P b) {
		return a.x * b.y - a.y * b.x;
	}

	public static boolean isParallel(P a1, P a2, P b1, P b2) {
		return Math.abs(cross(a2.s(a1), b2.s(b1))) < Double.MIN_NORMAL;
	}

	public static boolean isVertical(P a1, P a2, P b1, P b2) {
		return Math.abs(dot(a2.s(a1), b2.s(b1))) < Double.MIN_NORMAL;
	}

	public P a(P a) {
		return new P(x + a.x, y + a.y);
	}

	public P s(P a) {
		return new P(x - a.x, y - a.y);
	}

	public P scale(double a) {
		return new P(x * a, y * a);
	}

	public P m(P a) {// 複素数積
		return new P(x * a.x - y * a.y, x * a.y + y * a.x);
	}

	public P d(P a) {
		return new P(x * a.x + y * a.y, y * a.x - x * a.y).scale(1 / dist2(
				this, O));
	}

	public static double norm(P a, P b) {
		return Math.sqrt(dist2(a, b));
	}

	public double norm() {
		return norm(this, O);
	}

	public double dist2(P a) {
		return dist2(this, a);
	}

	public static double dist2(P a, P b) {
		return (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
	}

	public double arg() {
		double s = Math.acos(x / norm());
		return y > 0 ? s : 2 * Math.PI - s;
	}

	public P rotate(double t) {
		return new P(Math.cos(t) * this.x - Math.sin(t) * this.y, Math.sin(t)
				* this.x + Math.cos(t) * this.y);
	}

	public static int ccw(P a, P b, P c) {
		if (P.cross(b.s(a), c.s(a)) > Double.MIN_NORMAL) {
			return 1;
		}
		if (P.cross(b.s(a), c.s(a)) < -Double.MIN_NORMAL) {
			return -1;
		}
		if (P.dot(b, c) < -Double.MIN_NORMAL)
			return 2;
		if (b.norm() < c.norm() - Double.MIN_NORMAL)
			return -2;
		return 0;
	}

	public static double getS(List<P> plist) {
		P o1 = plist.get(0);
		P prev = plist.get(1);
		double S = 0;
		for (P p : plist.subList(2, plist.size())) {
			S += getS(o1, prev, p);
			prev = p;
		}
		return S;
	}

	// 負値がかえることもあるので注意。
	public static double getS(P o, P a, P b) {
		return cross(a.s(o), b.s(o)) / 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof P) {
			P p = (P) obj;
			return x == p.x && y == p.y;
		}
		return false;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}