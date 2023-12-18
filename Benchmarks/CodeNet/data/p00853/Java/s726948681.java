import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	Scanner sc;

	Main() {
		
		sc = new Scanner(System.in);
		for (int i = 0; i < 50; i ++) d.add(new ArrayList<P>());
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
			
			d();
			List<P> db = d.get(b);
			if (d.get(b).size() < k) System.out.println("None");
			else System.out.println(db.get(k - 1).p.substring(1));
		}
	}

	class P implements Comparable<P> {

		int d;
		String p;

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
	List<List<P>> d = new ArrayList<List<P>>(50);
	PriorityQueue<P> q = new PriorityQueue<P>(200 * 50 * 49, Collections.reverseOrder());

	void d() {

		for (int i = 0; i < n; i++) d.get(i).clear();
		P s = new P(0, "-" + (a + 1));
		d.get(a).add(s);
		q.add(s);

		while (!q.isEmpty()) {

			P p = q.remove();
			int v = Integer.valueOf(p.p.substring(p.p.lastIndexOf("-") + 1)) - 1;
			List<P> dv = d.get(v);
			if (dv.size() >= k && p.compareTo(dv.get(k - 1)) > 0) continue;

			for (int i = 0; i < l[v]; i++) {

				if (p.p.indexOf("-" + (t[v][i] + 1) + "-") >= 0) continue;
				P np = new P(p.d + c[v][i], p.p + "-" + (t[v][i] + 1));
				List<P> dt = d.get(t[v][i]);
				int ip = - Collections.binarySearch(dt, np) - 1;
				if (0 <= ip && ip < k) {
					
					dt.add(ip, np);
					if (dt.size() > k) dt.remove(k);
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