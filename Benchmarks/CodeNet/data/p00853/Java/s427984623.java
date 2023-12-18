import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	Scanner sc;

	Main() {
		
		sc = new Scanner(System.in);
	}

	int n, m, k, a, b,
		t[][] = new int[50][49],
		c[][] = new int[50][49],
		l[] = new int[50];

	void run() {

		for (;;) {

			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			if ((n | m | k | a -- | b --) == 0) break;

			Arrays.fill(l, 0, n, 0);
			for (int i = 0; i < m; i++) {

				int x = sc.nextInt() - 1;
				t[x][l[x]] = sc.nextInt() - 1;
				c[x][l[x]] = sc.nextInt();
				l[x]++;
			}
			
			kd();
			if (q2.isEmpty()) System.out.println("None");
			else System.out.println(q2.element().p);
		}
	}

	class P implements Comparable<P> {

		int d;
		String p;
		int s;
		int c[][];
		P ds[];

		P(int a, String b) {

			d = a;
			p = b;
		}

		@Override
		public int compareTo(P t) {

			if (d != t.d) return d -t.d;
			return p.compareToIgnoreCase(t.p);
		}
	}

	static final int INF = Integer.MAX_VALUE >> 4;
	P d[] = new P[50];
	Queue<P> q = new PriorityQueue<P>(200 * 50 * 49, Collections.reverseOrder());
	Queue<P> q2 = new PriorityQueue<P>(200 * 50);
	int pi[] = new int[50];

	void kd() {

		q2.clear();
		Arrays.fill(d, 0, n, new P(INF, ""));
		d(a, 0, Integer.toString(a + 1), c);
		d[b].s = 0;
		d[b].c = c;
		d[b].ds = d.clone();
		q2.add(d[b]);

		for (int i = 1; i < k; i ++) {
			
			if (q2.isEmpty()) break;
			P p = q2.remove();
			String ps[] = p.p.split("-");
			for (int j = 0; j < ps.length; j ++)
				pi[j] = Integer.valueOf(ps[j]) - 1;
			for (int j = p.s; j < ps.length - 1; j ++) {
				
				Arrays.fill(d, 0, n, new P(INF, ""));
				P z = new P(0, "");
				int m;
				for (m = 0; m < j; m ++) d[pi[m]] = z;
				int nc[][] = new int[50][49];
				for (m = 0; m < n; m ++) nc[m] = p.c[m].clone();
				for (m = 0; t[pi[j]][m] != pi[j + 1]; m ++);
				nc[pi[j]][m] = INF;
				d(pi[j], p.ds[pi[j]].d, p.ds[pi[j]].p, nc);
				if (d[b].d < INF) {
					
					d[b].s = j;
					d[b].c = nc;
					d[b].ds = d.clone();
					q2.add(d[b]);
				}
			}
		}
	}

	void d(int s, int o, String os, int c[][]) {

		P sp = new P(o, os);
		d[s] = sp;
		q.add(sp);

		while (!q.isEmpty()) {

			P p = q.remove();
			int v = Integer.valueOf(p.p.substring(p.p.lastIndexOf("-") + 1)) - 1;
			if (p.compareTo(d[v]) > 0) continue;

			for (int i = 0; i < l[v]; i++) {

				int ti = t[v][i];
				P np = new P(p.d + c[v][i], p.p + "-" + (ti + 1));
				if (np.compareTo(d[ti]) < 0) {
					
					d[ti] = np;
					q.add(np);
				}
			}
		}
	}

	public static void main(String args[]) {
		
		Main m = new Main();
		m.run();
	}
}