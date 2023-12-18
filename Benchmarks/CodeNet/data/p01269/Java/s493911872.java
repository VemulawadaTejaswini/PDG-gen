import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	int INF = 1 << 28;

	int n, m, bMax;
	int[] us, vs, ws, xs;

	void run() {
		for (;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			bMax = sc.nextInt();
			if (n == 0 && m == 0 && bMax == 0) {
				break;
			}
			us = new int[m];
			vs = new int[m];
			ws = new int[m];
			xs = new int[m];
			for (int i = 0; i < m; i++) {
				us[i] = sc.nextInt() - 1;
				vs[i] = sc.nextInt() - 1;
				ws[i] = sc.nextInt();
				xs[i] = sc.nextInt();
			}
			solve();
		}
	}

	void solve() {
		@SuppressWarnings("unchecked")
		ArrayList<E>[] es = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			es[i] = new ArrayList<E>();
		}
		for (int i = 0; i < m; i++) {
			es[us[i]].add(new E(vs[i], ws[i], xs[i]));
			es[vs[i]].add(new E(us[i], ws[i], xs[i]));
		}

		PriorityQueue<P> que = new PriorityQueue<P>();
		que.offer(new P(0, bMax, 0));
		int[][] d = new int[n][bMax + 1];
		for (int i = 0; i < n; i++) {
			fill(d[i], INF);
		}

		for (; !que.isEmpty();) {			
			P p = que.poll();
			if (p.cost > d[p.v][p.b]) {
				continue;
			}
			// debug(p.v,p.b,p.cost);
			for (E e : es[p.v]) {
				if (p.b - e.w >= 0) {
					P q = new P(e.to, p.b - e.w, p.cost);
					if (q.cost < d[q.v][q.b]) {
						que.offer(q);
						d[q.v][q.b]=q.cost;
					}
				}
				{
					P q = new P(e.to, p.b, p.cost + e.x);
					if (q.cost < d[q.v][q.b]) {
						que.offer(q);
						d[q.v][q.b]=q.cost;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			// debug(i, d[i]);
		}
		int min = INF;
		for (int i = 0; i <= bMax; i++) {
			min = min(min, d[n - 1][i]);
		}
//		debug(min);
		println(min+"");
	}

	class E {
		int to, w, x;

		E(int to, int w, int x) {
			this.to = to;
			this.w = w;
			this.x = x;
		}
	}

	class P implements Comparable<P> {
		int v, b, cost;

		P(int v, int b, int cost) {
			this.v = v;
			this.b = b;
			this.cost = cost;
		}

		@Override
		public int compareTo(P p) {
			return cost - p.cost;
		}
	}

	void debug(Object... os) {
		System.err.println(deepToString(os));
	}

	void println(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}