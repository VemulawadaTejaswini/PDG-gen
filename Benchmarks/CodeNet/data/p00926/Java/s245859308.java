
import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		if (m == 0) {
			System.out.println(n+1);
			return;
		}
		P[] ps = new P[m];
		for (int i=0;i<m;i++) {
			ps[i] = new P(sc.nextInt(), sc.nextInt());
		}
		sort(ps);
//		for (P p : ps) debug(p.f, p.t);
		int s = ps[0].f, e = ps[0].t;
		ArrayList<P> l = new ArrayList<P>();
		for (int i=1;;i++) {
//			debug(s, e, ps[i].f, ps[i].t);
			while (i < m && e >= ps[i].f) {
				e = max(e, ps[i].t);
//				debug(s, e, ps[i].f, ps[i].t);
				i++;
			}
			l.add(new P(s, e));
			if (i == m) break;
			s = ps[i].f; e = ps[i].t;
		}
		int len = 0, c = 0;
		for (P p: l) {
			len += p.f - c;
			len += 3 * (p.t - p.f);
			c = p.t;
//			debug(p.f, p.t);
		}
		len += n+1 - c;
		System.out.println(len);
	}

	class P implements Comparable<P>{
		int f, t;
		P(int f, int t) {
			this.f = f;
			this.t = t;
		}
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			if (f == o.f) {
				return o.t - t;
			}
			return f - o.f;
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}