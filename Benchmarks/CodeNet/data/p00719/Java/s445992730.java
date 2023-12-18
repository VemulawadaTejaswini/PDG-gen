
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	int n, m, p, a, b;
	int[] t;
	E[] G;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			p = sc.nextInt();
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;

			if ((n|m) == 0) break;

			t = new int[n];
			G = new E[m];
			for (int i = 0; i < m; i++) G[i] = new E();

			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
			}

			for (int i = 0; i < p; i++) {
				int x = sc.nextInt() - 1, y = sc.nextInt() - 1, z = sc.nextInt();
				G[x].add(new V(y, z));
				G[y].add(new V(x, z));
			}

			System.out.println(dijkstra());
		}
	}

	String dijkstra() {
		double[][] d = new double[1 << n][m];
		for (double[] a : d) fill(a, INF);
		d[0][a] = 0;
		PriorityQueue<S> q = new PriorityQueue<S>();
		q.add(new S(0, a, 0));
//		debug(q);
		for (;!q.isEmpty();) {
			S cur = q.remove();
//			debug(cur);
			if (d[cur.s][cur.p] != cur.d) continue;
			if (cur.p == b) return "" + cur.d;

			for (V v : G[cur.p]) {
				for (int i = 0; i < n; i++) if (((cur.s>>i)&1) == 0) {
					if (d[cur.s|(1<<i)][v.t] > cur.d + 1.0 * v.c / t[i]) {
						d[cur.s|(1<<i)][v.t] = cur.d + 1.0 * v.c / t[i];
						q.add(new S(cur.s|(1<<i), v.t, d[cur.s|(1<<i)][v.t]));
					}
				}
			}
		}

		return "Impossible";
	}

	class E extends ArrayList<V>{}
	class V {
		int t, c;
		V(int t, int c) {
			this.t = t;
			this.c = c;
		}
	}

	class S implements Comparable<S>{
		int s, p;
		double d;
		S(int s, int p, double d) {
			this.s = s;
			this.p = p;
			this.d = d;
		}
		@Override
		public int compareTo(S o) {
			// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
			return d - o.d > EPS ? 1 : -1;
		}

		public String toString() {
			return "[" + Integer.toString(s, 2) + ", " + p + ", " + d + "]";
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}