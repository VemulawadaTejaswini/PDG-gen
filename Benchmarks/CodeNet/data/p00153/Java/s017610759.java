import java.awt.geom.Line2D;
import java.io.IOException;

public class Main {
	/**
	 * @param args
	 */
	static class Shape {
		public	int	x = 0;
		public	int	y = 0;
		public	int	r = 0;

		public Shape(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Shape(int x, int y, int r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}
	}

	static class Line {
		public	Shape	ps = null;
		public	Shape	pe = null;
		public	int		a  = 0;
		public	int		b  = 0;
		public	int		c  = 0;

		public Line(Shape ps, Shape pe) {
			this.ps = ps;
			this.pe = pe;
			this.a  = pe.y-ps.y;
			this.b  = ps.x-pe.x;
			this.c  = -(this.a*ps.x+this.b*ps.y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[]	s = null;

		while((s = inp()) != null) {
			solve(s[0], s[1], s[2], s[3]);
		}
	}

	private static void solve(Shape p1, Shape p2, Shape p3, Shape c) {
		{
			int	rr = (c.r*c.r);
			int	d0 = distPow(c, p1);
			int	d1 = distPow(c, p2);
			int	d2 = distPow(c, p3);

			// 三角形が円の内部に含まれるか
			if (d0 <= rr && d1 <= rr && d2 <= rr) {
				System.out.println("b");
				return;
			}
		}

		{
			int		n1 = crossSign(p1, p2, c);
			int		n2 = crossSign(p2, p3, c);
			int		n3 = crossSign(p3, p1, c);
			Line	l1 = new Line(p1, p2);
			Line	l2 = new Line(p2, p3);
			Line	l3 = new Line(p3, p1);

			// 円の中心が三角形の内部に含まれるか
			if ((n1 == n2) && (n2 == n3)) {
				int	c1 = checkDist(l1, c);
				int	c2 = checkDist(l2, c);
				int	c3 = checkDist(l3, c);

				// 円が三角形内部に含まれるか
				if (c1 <= 0 && c2 <= 0 && c3 <= 0) {
					System.out.println("a");
					return;
				} else {
					System.out.println("c");
					return;
				}
			} else {
				// 円と線分が交わるか
				if (checkCross(l1, c)) {
					System.out.println("c");
					return;
				}

				if (checkCross(l2, c)) {
					System.out.println("c");
					return;
				}

				if (checkCross(l2, c)) {
					System.out.println("c");
					return;
				}
			}
		}

		System.out.println("d");
	}

	private static int distPow(Shape s1, Shape s2) {
		return (s1.x-s2.x)*(s1.x-s2.x)+(s1.y-s2.y)*(s1.y-s2.y);
	}

	private static boolean checkCross(Line l, Shape c) {
		Line2D.Double ld = new Line2D.Double(l.ps.x, l.ps.y, l.pe.x, l.pe.y);
		return (ld.ptSegDistSq(c.x, c.y) <= (double)(c.r*c.r))?true:false;
	}

	private static int checkDist(Line l, Shape p) {
		int	s = p.r*p.r*(l.a*l.a+l.b*l.b);
		int	t = (l.a*p.x+l.b*p.y+l.c)*(l.a*p.x+l.b*p.y+l.c);
		return (s==t)?0:((s<t)?-1:1);
	}

	private static int crossSign(Shape s1, Shape s2, Shape s3) {
		int[]	vab = { s2.x-s1.x, s2.y-s1.y };
		int[]	vap = { s3.x-s1.x, s3.y-s1.y };
		int		sgn = cross(vab, vap);
		return (sgn==0)?0:((sgn>0)?1:-1);
	}

	private static int cross(int[] va, int[] vb) {
		return va[0]*vb[1]-va[1]*vb[0];   // x1*x2 + y1*y2
	}

	private static Shape[] inp() {
		Shape[]	d = new Shape[4];

		for (int i = 0; i < 4; i++) {
			if (i < 3) {
				int[]	p = { parseNum(), parseNum() };
				if (p[0] == 0 && p[1] == 0) return null;
				d[i] = new Shape(p[0], p[1]);
			} else {
				int[]	p = { parseNum(), parseNum(), parseNum() };
				d[i] = new Shape(p[0], p[1], p[2]);
			}
		}

		return d;
	}

	private static int parseNum() {
		try {
			int	buf = 0;
			int	num = 0;
			int	mns = 0;
			int	skp = 1;

			// -,0〜9以外は読み飛ばす
			while (true) {
				buf = System.in.read();
				if (buf == '-') {
					mns = 1;
					skp = 0;
				} else if (buf >= '0' && buf <= '9') {
					num = num * 10 + (buf - '0');
					skp = 0;
				} else if ((skp == 0 || buf == -1) && buf != '.') {
					return (mns == 0)?num:num*(-1);
				}
			}
		} catch (IOException e) {}
		return -1;
	}
}