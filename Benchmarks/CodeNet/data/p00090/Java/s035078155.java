import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	void solve() {
		int n = sc.nextInt();
		if (n == 0) return;
		C[] cs = new C[n];
		for (int i = 0; i < n; i++) {
			String[] ss = sc.next().split(",");
			double x = Double.parseDouble(ss[0]);
			double y = Double.parseDouble(ss[1]);
			cs[i] = new C(new P(x, y), 1.0);
		}

		int res = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				C c1 = cs[i];
				C c2 = cs[j];
				P[] ps = intersectionCC(c1, c2);
				for (P p : ps) {
					int here = 0;
					for (int k = 0; k < n; k++) {
						if (cs[k].dist(p) < 1.0 + EPS) {
							here++;
						}
					}
					res = Math.max(res, here);
				}
			}
		}


		System.out.println(res);
	}

	final double EPS = 1e-10;

	static class P implements Comparable<P> {
		double x, y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public int compareTo(P o) {
			return x != o.x ? Double.compare(x, o.x) : Double.compare(y, o.y);
		}
		public String toString() {
			return "(" + x + "," + y + ")";
		}
		public double abs() {return sqrt(x * x + y * y); }
		public double abs2() {return (x * x + y * y); }
		public double arg() { return atan2(y, x); } // (-pi 〜 pi)
		public double dist(P o) {return this.sub(o).abs(); }
		public P mul(double k) {return new P(x * k, y * k);}
		public P div(double k) {return new P(x / k, y / k);}
		public P add(P o) {return new P(x + o.x, y + o.y);}
		public P sub(P o) {return new P(x - o.x, y - o.y);}
		public P mul(P o) {return new P(x * o.x - y * o.y,  x * o.y + y * o.x); }
		public P div(P o) {return new P(x * o.x + y * o.y, -x * o.y + y * o.x).div(o.abs2()); }
		public double dot(P o) {return x * o.x + y * o.y;} // a b sin(t)
		public double det(P o) {return x * o.y - y * o.x;} // a b cos(t)
		public P normal() { return this.div(this.abs()); }
		public P rot90() { return new P(-y, x); }
		public static P polar(double d, double rad) {return new P(d * Math.cos(rad), d * Math.sin(rad));}
	}
	class C extends P {
		double r;
		public C(P p, double r) {
			super(p.x, p.y);
			this.r = r;
		}
	}

	// 2円の交点
	P[] intersectionCC(C c1, C c2) {
		P[] ret = new P[0];
		double d = (c2.sub(c1)).abs();
		P diff = (c2.sub(c1)).div(d);
		if (c1.r + c2.r < d - EPS) { // 離れていて交点0
		} else if (abs(c1.r - c2.r) > d + EPS) { // 内側に含む。交点0
		} else if (d < EPS && abs(c1.r - c2.r) < EPS) { // 2円が重なる
		} else if (abs(c1.r + c2.r - d) < EPS) { // 外側で1点で接する
			ret = new P[] { c1.add(diff.mul(c1.r)) };
		} else if (abs(abs(c1.r - c2.r) - d) < EPS) { // 内側で1点で接する
			ret = new P[] { c1.add(diff.mul(c1.r * (c1.r > c2.r ? 1 : -1))) };
		} else { // 2点で交わる
		// assert( d < c1.r + c2.r );
			double rc = (d * d + c1.r * c1.r - c2.r * c2.r) / (2 * d);
			double rs = sqrt(c1.r * c1.r - rc * rc);
			ret = new P[2];
			ret[0] = c1.add(diff.mul(new P(rc, -rs)));
			ret[1] = c1.add(diff.mul(new P(rc, rs)));
		}
		return ret;
	}
	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	MyScanner sc = null;
	PrintWriter out = null;
	public void run() throws Exception {
		sc = new MyScanner(System.in);
		out = new PrintWriter(System.out);
		for (;sc.hasNext();) {
			solve();
			out.flush();
		}
		out.close();
	}

	class MyScanner {
		String line;
		BufferedReader reader;
		StringTokenizer tokenizer;

		public MyScanner(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream));
			tokenizer = null;
		}
		public void eat() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					line = reader.readLine();
					if (line == null) {
						tokenizer = null;
						return;
					}
					tokenizer = new StringTokenizer(line);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		public String next() {
			eat();
			return tokenizer.nextToken();
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		public boolean hasNext() {
			eat();
			return (tokenizer != null && tokenizer.hasMoreElements());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}
	}
}