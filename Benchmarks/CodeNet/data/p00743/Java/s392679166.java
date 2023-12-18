
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, m, s, g;
	E[] G;
	int MAX = 30;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n|m) == 0) break;

			s = sc.nextInt() - 1;
			g = sc.nextInt() - 1;
			if ((n|m|s|g) == 0) break;

			G = new E[n];
			for (int i = 0; i < n; i++) G[i] = new E();

			for (int i = 0; i < m; i++) {
				int x = sc.nextInt() - 1, y = sc.nextInt() - 1, d = sc.nextInt(), c = sc.nextInt();
				G[x].add(new V(y, d, c));
				G[y].add(new V(x, d, c));
			}

			System.out.println(dijkstra());
		}
	}

	String dijkstra() {
		double[][][] d = new double[MAX + 1][n][n];
		for(double[][] a : d) for (double[] b : a) fill(b, INF);
		d[0][s][s] = 0;
		PriorityQueue<S> q = new PriorityQueue<S>();
		q.add(new S(0, s, s, 0));

		for (;!q.isEmpty();) {
			S cur = q.remove();
//			debug(cur);
			if (d[cur.v][cur.p][cur.f] != cur.c) continue;
			if (cur.p == g && cur.v == 1) return "" + cur.c;

			for (V v : G[cur.p]) if (v.t != cur.f) {
				for (int i = -1; i <= 1; i++) {
					int nv = cur.v + i;
					if (nv <= 0 || nv > v.c) continue;
					double nc = cur.c + 1.0 * v.d / nv;
					if (d[nv][v.t][cur.p] > nc) {
						d[nv][v.t][cur.p] = nc;
						q.add(new S(nv, v.t, cur.p, nc));
					}
				}
			}
		}


		return "unreachable";
	}

	class S implements Comparable<S>{
		int v, p, f;
		double c;
		S(int v, int p, int f, double c) {
			this.v = v;
			this.p = p;
			this.f = f;
			this.c = c;
		}
		@Override
		public int compareTo(S o) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			return c - o.c > 0 ? 1 : -1;
		}

		public String toString() {
			return "[" + v + ", " + p + ", " + f + ", " + c + "]";
		}
	}


	class E extends ArrayList<V>{};
	class V {
		int t, d, c;
		V(int t, int d, int c) {
			this.t = t;
			this.d = d;
			this.c = c;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}