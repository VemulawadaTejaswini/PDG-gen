import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(solve());
	}

	static int solve() {
		int N = Integer.parseInt(sc.next());
		int mh = Integer.parseInt(sc.next());
		int ma = Integer.parseInt(sc.next());
		int md = Integer.parseInt(sc.next());
		int ms = Integer.parseInt(sc.next());
		long cmh = mh;
		Enemy[] es = new Enemy[N];
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			int h = Integer.parseInt(sc.next());
			int a = Integer.parseInt(sc.next());
			int d = Integer.parseInt(sc.next());
			int s = Integer.parseInt(sc.next());
			int p = ma - d;
			if (p <= 0) return -1;
			int damage = Math.max(0, a - md);
			sum += damage;
			es[i] = new Enemy(h, a, d, s);
			es[i].turn = (h + p - 1) / p;
			es[i].dm = es[i].turn * (long) damage;
			if (ms > s) {
				es[i].dm -= damage;
			}
		}
		Arrays.sort(es);
		for (int i = N - 1; i >= 0; --i) {
			sum -= Math.max(0, es[i].a - md);
			cmh -= sum * es[i].turn;
			cmh -= es[i].dm;
			if (cmh <= 0) return -1;
		}
		return (int) (mh - cmh);
	}

	static class Enemy implements Comparable<Enemy> {
		int h, a, d, s;
		int turn;
		long dm;

		public Enemy(int h, int a, int d, int s) {
			this.h = h;
			this.a = a;
			this.d = d;
			this.s = s;
		}

		public int compareTo(Enemy o) {
			if (this.dm != o.dm) return this.dm < o.dm ? -1 : 1;
			return 0;
		}
	}
}