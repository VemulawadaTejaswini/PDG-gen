import java.util.ArrayList;
import java.util.Collections;
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
		ArrayList<Enemy> es = new ArrayList<Enemy>();
		long sum = 0;
		for (int i = 0; i < N; ++i) {
			int h = Integer.parseInt(sc.next());
			int a = Integer.parseInt(sc.next());
			int d = Integer.parseInt(sc.next());
			int s = Integer.parseInt(sc.next());
			int p = ma - d;
			int damage = Math.max(0, a - md);
			if (p <= 0) {
				if (damage != 0) return -1;
				continue;
			}
			sum += damage;
			Enemy e = new Enemy(h, a, d, s);
			es.add(e);
			e.turn = (h + p - 1) / p;
			e.dm = e.turn * (long) damage;
			if (ms > s) {
				e.dm -= damage;
			}
		}
		Collections.sort(es);
		for (int i = es.size() - 1; i >= 0; --i) {
			sum -= Math.max(0, es.get(i).a - md);
			cmh -= sum * es.get(i).turn;
			cmh -= es.get(i).dm;
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