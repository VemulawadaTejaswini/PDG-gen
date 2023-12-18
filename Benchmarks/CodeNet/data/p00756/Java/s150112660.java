import java.util.*;
import java.io.*;
import java.awt.geom.*;
import java.math.*;

public class Main {

	static final Scanner in = new Scanner(System.in);
	static final PrintWriter out = new PrintWriter(System.out,false);
	static boolean debug = false;

	static BitSet cleared = new BitSet();
	static PriorityQueue<double[]>[] pQ;
	static double[][] c;

	static int isIntersection(double x1, double y1, double r1, double x2, double y2, double r2) {
		double d = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);
		double rr = r1 + r2;
		return Math.abs(d - rr*rr) < 1e-10 ? 1 : (d < rr*rr ? 2 : 0);
	}

	static boolean isOk(int idx) {
		double[] t = c[idx];
		for (int i=0; i<idx; i++) {
			if (cleared.get(i)) continue;
			if (isIntersection(t[0], t[1], t[2], c[i][0], c[i][1], c[i][2]) > 1) {
				return false;
			}
		}
		return true;
	}

	static boolean clear() {
		for (int i=0; i<4; i++) {
			double[] tmp = null;
			for (double[] p : pQ[i]) {
				if (isOk((int)p[3])) {
					if (tmp == null) {
						tmp = p;
					} else {
						cleared.set((int)tmp[3]);
						cleared.set((int)p[3]);
						pQ[i].remove(tmp);
						pQ[i].remove(p);
						return true;
					}
				}
			}
		}

		return false;
	}

	@SuppressWarnings("unchecked")
	static boolean solve() {
		int n = in.nextInt();
		if (n == 0) return false;

		pQ = new PriorityQueue[4];
		for (int i=0; i<4; i++) {
			pQ[i] = new PriorityQueue<double[]>(new Comparator<double[]>(){
				public int compare(double[] a, double[] b) {
					return (int)(a[3] - b[3]);
				}
			});
		}

		c = new double[n][4];

		for (int i=0; i<n; i++) {
			c[i][0] = in.nextInt();
			c[i][1] = in.nextInt();
			c[i][2] = in.nextInt();
			int color = in.nextInt() - 1;
			c[i][3] = i;
			pQ[color].add(c[i]);
		}

		int cnt = 0;

		while (clear()) {
			cnt += 2;
		}

		out.println(cnt);
		cleared.clear();

		return true;
	}

	public static void main(String[] args) {
		debug = args.length > 0;
		long start = System.currentTimeMillis();

		while(solve());
		out.flush();

		long end = System.currentTimeMillis();
		dump((end-start) + "ms");
		in.close();
		out.close();
	}

	static void dump(Object... o) { if (debug) System.err.println(Arrays.deepToString(o)); }
}