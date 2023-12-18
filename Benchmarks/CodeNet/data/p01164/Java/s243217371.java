
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	Scanner sc;

	Main() {
		sc = new Scanner(System.in);
	}

	int encode(String a, int n) {
		int ret = 0;
		for (int i = 0; i < n; i++) {
			ret = ret << 1;

			if (a.charAt(i) == 'W') {
				ret += 1;
			}
		}
		return ret;
	}

	class S implements Comparable<S> {
		int s;
		int c;
		int p;

		S(int ss, int cc, int pp) {
			s = ss;
			c = cc;
			p = pp;
		}

		public int compareTo(S tar) {
			return c - tar.c;
		}

	}

	void run() {
		boolean used[][] = new boolean[(1 << 16)][16];
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			String a = sc.next();
			String b = sc.next();

			int s = encode(a, n);
			int g = encode(b, n);
			PriorityQueue<S> q = new PriorityQueue<S>();
			for (int sp = 0; sp < n; sp++) {
				if (((s ^ g) & (1 << sp)) != 0) {
					q.add(new S(s, 0, sp));
				}
			}
			for (int i = 0; i < (1 << n); i++) {
				Arrays.fill(used[i],false);
			}
			for (;;) {
				if (q.isEmpty()) {
					System.err.println("err");
				}
				S now = q.poll();
				if (used[now.s][now.p]) {
					continue;
				}

				// System.out.println(Integer.toBinaryString((1 << 10) + now.s)
				// + " " + now.p + " " + now.c);
				if ((now.s) == g) {
					System.out.println(now.c);
					break;
				}
				used[now.s][now.p] = true;
				for (int i = 0; i < n; i++) {
					int shi = 1 << i;
					if (((now.s & ~g) & shi) != 0) {
						for (int j = 0; j < n; j++) {
							int shj = 1 << j;
							if (((~now.s & g) & shj) != 0) {
								int cost = Math.abs(i - now.p);
								cost += Math.abs(j - i);
								int pos = j;
								int ns = now.s - shi + shj;
								if (!used[ns][pos])
									q.add(new S(ns, now.c + cost, pos));

								cost = Math.abs(j - now.p);
								cost += Math.abs(j - i);
								pos = i;
								ns = now.s - shi + shj;
								if (!used[ns][pos])
									q.add(new S(ns, now.c + cost, pos));
							}
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