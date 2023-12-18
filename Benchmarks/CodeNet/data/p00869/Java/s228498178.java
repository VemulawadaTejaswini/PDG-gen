import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class K {
		int i;
		int j;
		int v;
		String s;

		K(int i, int j, int v, String s) {
			this.i = i;
			this.j = j;
			this.v = v;
			this.s = s;
		}

		public boolean equals(Object arg) {
			if (!(arg instanceof K)) {
				return false;
			}
			K t = (K) arg;

			if (i == t.i && j == t.j && v == t.v && s.equals(t.s)) {
				return true;
			}
			return false;
		}
	}

	class S implements Comparable<S> {
		K k;
		int cost;

		S(K k, int c) {
			this.k = k;
			cost = c;
		}

		public int compareTo(S s) {
			return cost - s.cost - (Math.abs(k.i - li) + Math.abs(k.j - lj))
					+ (Math.abs(s.k.i - li) + Math.abs(s.k.j - lj));
		}
	}

	HashMap<String, String> hm = new HashMap<String, String>();

	String rot(String arg, int di, int dj) {
		if(hm.containsKey(arg+di+dj)){
		return hm.get(arg + di+dj);
		}
		char t = arg.charAt(0);
		char b = arg.charAt(1);
		char n = arg.charAt(2);
		char s = arg.charAt(3);
		char e = arg.charAt(4);
		char w = arg.charAt(5);

		if (di == 1) {
			char t2 = t;
			t = n;
			n = b;
			b = s;
			s = t2;
		}
		if (di == -1) {
			char t2 = t;
			t = s;
			s = b;
			b = n;
			n = t2;
		}
		if (dj == 1) {
			char t2 = t;
			t = w;
			w = b;
			b = e;
			e = t2;
		}
		if (dj == -1) {
			char t2 = t;
			t = e;
			e = b;
			b = w;
			w = t2;
		}

		hm.put(arg + di+dj , "" + t + b + n + s + e + w);
		return "" + t + b + n + s + e + w;
	}

	int li;
	int lj;

	void run() {

		for (;;) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if ((h | w) == 0) {
				break;
			}

			char[][] map = new char[h][w];
			int si = 0;
			int sj = 0;
			for (int i = 0; i < h; i++) {
				String buffer = sc.next();
				for (int j = 0; j < w; j++) {
					char ch = buffer.charAt(j);
					if (ch == '#') {
						si = i;
						sj = j;
						ch = 'w';
					}
					map[i][j] = ch;
				}
			}
			int order[] = new int[256];
			{
				String buffer = sc.next();
				for (int i = 0; i < 6; i++) {
					order[buffer.charAt(i)] = i;
				}
				order['w'] = -1;
				order['k'] = 9;

				char last = buffer.charAt(5);
				for (int i = 0; i < h; i++) {
					for (int j = 0; j < w; j++) {
						if (last == map[i][j]) {
							li = i;
							lj = j;
						}
					}
				}
			}

			String ss = "rcgmby";
			K k = new K(si, sj, 0, ss);
			PriorityQueue<S> q = new PriorityQueue<S>();
			q.add(new S(k, 0));
			LinkedList<K> used = new LinkedList<K>();

			for (;;) {
				if (q.isEmpty()) {
					System.out.println("unreachable");
					break;
				}
				S s = q.poll();
				// System.out.println(s.k.i + " " + s.k.j + " " + s.k.v + " " +
				// s.k.s + " " + s.cost);
				if (used.contains(s.k)) {
					continue;
				}
				used.add(s.k);

				if (s.k.v == 6) {
					System.out.println(s.cost);
					break;
				}

				int di[] = { 1, -1, 0, 0 };
				int dj[] = { 0, 0, 1, -1 };

				for (int i = 0; i < 4; i++) {
					int ni = s.k.i + di[i];
					int nj = s.k.j + dj[i];

					if (ni < 0 || ni >= h) {
						continue;
					}
					if (nj < 0 || nj >= w) {
						continue;
					}

					String ns = rot(s.k.s, di[i], dj[i]);

					int nv = s.k.v;
					if (map[ni][nj] == 'k') {
						continue;
					}
					if (map[ni][nj] != 'w') {
						if (order[map[ni][nj]] != s.k.v) {
							continue;
						}
						if (ns.charAt(0) != map[ni][nj]) {
							continue;
						}

						nv++;
					}
					if (!used.contains(new K(ni, nj, nv, ns))) {
						q.add(new S(new K(ni, nj, nv, ns), s.cost + 1));
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