import java.util.Arrays;
import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	Scanner sc;

	Main() {
		
		sc = new Scanner(System.in);
	}

	int n, m, k, a, b,
		c[][] = new int[50][50];

	void run() {

		for (;;) {

			n = sc.nextInt();
			m = sc.nextInt();
			k = sc.nextInt();
			a = sc.nextInt();
			b = sc.nextInt();
			if ((n | m | k | a -- | b --) == 0) break;

			for (int i = 0; i < n; i++) Arrays.fill(c[i], 0, n, INF);
			for (int i = 0; i < m; i++) {

				int x = sc.nextInt() - 1,
					y = sc.nextInt() - 1;
				c[x][y] = sc.nextInt();
			}
			
			d();
			System.out.println((u[b] == k && d[b].d < INF) ? d[b].p: "None");
		}
	}

	class P implements Comparable<P> {

		int d;
		String p;
		BitSet s;

		P(int a, String b, BitSet c) {

			d = a;
			p = b;
			s = c;
		}

		@Override
		public int compareTo(P t) {

			if (d != t.d) return d - t.d;
			return p.compareTo(t.p);
		}
	}

	static final int INF = Integer.MAX_VALUE >> 4;
	P d[] = new P[50];
	int u[] = new int[50];
	Queue<P> q = new PriorityQueue<P>(200 * 50 * 49);

	void d() {

		q.clear();
		Arrays.fill(d, 0, n, new P(INF, "", null));
		Arrays.fill(u, 0, n, 0);
		BitSet bs = new BitSet(n);
		bs.set(a);
		P s = new P(0, Integer.toString(a + 1), bs);
		q.add(s);

		while (!q.isEmpty()) {

			P p = q.remove();
			int v = Integer.valueOf(p.p.substring(p.p.lastIndexOf("-") + 1)) - 1;
			if (u[v] == k || p.compareTo(d[v]) == 0) continue;
			u[v] ++;
			d[v] = p;
			if (v == b && u[v] == k) break;

			for (int i = 0; i < n; i++) {

				if (p.s.get(i)) continue;
				BitSet nb = p.s.get(0, n);
				nb.set(i);
				q.add(new P(p.d + c[v][i], p.p + "-" + (i + 1), nb));
			}
		}
	}

	public static void main(String args[]) {
		
		Main m = new Main();
		m.run();
	}
}