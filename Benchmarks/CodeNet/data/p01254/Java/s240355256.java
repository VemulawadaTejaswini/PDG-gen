import java.util.BitSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	class st implements Comparable<st> {
		int cost;
		int pos;
		int omit;

		st(int cost, int pos, int omit) {
			this.cost = cost;
			this.pos = pos;
			this.omit = omit;
		}

		public int compareTo(st tar) {
			return cost - tar.cost;
		}
	}

	@SuppressWarnings("unchecked")
	void run() {
		for (;;) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}
			n++;
			int s = sc.nextInt();
			int t = sc.nextInt();
			int m = sc.nextInt();

			LinkedList<Integer>[] dir = new LinkedList[n];
			LinkedList<Integer>[] rev = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				dir[i] = new LinkedList<Integer>();
				rev[i] = new LinkedList<Integer>();
			}

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				dir[a].add(b);
				rev[b].add(a + (i + 1) * n);
			}

			BitSet u = new BitSet(n * (m + 1));
			PriorityQueue<st> q = new PriorityQueue<st>();
			q.add(new st(0, s, 0));
			for (;;) {
				if (q.isEmpty()) {
					throw new OutOfMemoryError();
				}

				st now = q.poll();
				int v = now.pos + now.omit * n;
				if (u.get(v)) {
					continue;
				}
				if (now.pos == t) {
					int cost1 = now.cost;
					int omit1 = now.omit;
					for(st o :q){
						if(cost1 < o.cost){
							break;
						}
						if(o.pos == t){
							omit1 = Math.min(o.omit, omit1);
						}
					}
					System.out.println(now.cost + " " + omit1);
					break;
				}
				u.set(v);

				for (int next : dir[now.pos]) {
					if (!u.get(next + now.omit * n)) {
						q.add(new st(now.cost + 1, next, now.omit));
					}
				}
				if (now.omit == 0) {
					for (int next : rev[now.pos]) {
						int a = next % n;
						int b = next / n;
						if (!u.get(a + b * n)) {
							q.add(new st(now.cost + 1, a, b));
						}
					}
				}
			}

		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}