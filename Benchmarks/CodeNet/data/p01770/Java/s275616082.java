import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	int n, m, s, t, r, e;
	List<Integer>[] edge;
	int[] from, to, map;

	class D implements Comparable<D> {
		int pos;
		int bit;
		int cnt;
		int min;
		D par;

		public D(int pos, int bit, int cnt, int min) {
			this.pos = pos;
			this.bit = bit;
			this.cnt = cnt;
			this.min = min;
		}

		public D(int pos, int bit, int cnt, int min, D par) {
			this.pos = pos;
			this.bit = bit;
			this.cnt = cnt;
			this.min = min;
			this.par = par;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min) {
				return this.min - o.min;
			}
			if (this.cnt != o.cnt) {
				return this.cnt - o.cnt;
			}
			if (this.pos != o.pos) {
				return this.pos - o.pos;
			}
			if (this.bit != o.bit) {
				return this.bit - o.bit;
			}
			return 0;
		}

		@Override
		public String toString() {
			return "(" + pos + ", " + Integer.toBinaryString(bit) + ", " + cnt + ", " + min + ")";
		}
	}

	int dijkstra() {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		boolean[][][] vis = new boolean[n][1 << e][r + 1];

		if (map[s] >= 0) {
			queue.add(new D(s, 1 << map[s], 0, 0));
		} else {
			queue.add(new D(s, 0, 0, 0));
		}
		while (!queue.isEmpty()) {
			D d = queue.poll();
			int pos = d.pos;
			int bit = d.bit;
			int cnt = d.cnt;
			int min = d.min;

			if (vis[pos][bit][cnt]) {
				continue;
			}
			vis[pos][bit][cnt] = true;
			if (pos == t) {
				return min;
			}
			// ---------------------------------------------
			// System.out.print(d);
			// System.out.println(" - " + d.par);

			queue.add(new D(s, bit, 0, min + 1, d));
			if (r <= cnt) {
				continue;
			}
			for (Integer npos : edge[pos]) {
				int nbit = bit;
				int nmin = min + 1;
				int ncnt = cnt + 1;
				if (map[npos] >= 0) {
					nbit |= (1 << map[npos]);
				}
				if (!vis[npos][nbit][ncnt]) {
					queue.add(new D(npos, nbit, ncnt, nmin, d));
				}
			}
			for (int i = 0; i < e; i++) {
				if ((bit & (1 << i)) == 0) {
					continue;
				}
				if (pos == from[i] || pos == to[i]) {
					int npos = from[i] + to[i] - pos;
					int nbit = bit;
					if (map[npos] >= 0) {
						nbit |= (1 << map[npos]);
					}
					int ncnt = cnt + 1;
					int nmin = min + 1;
					if (!vis[npos][nbit][ncnt]) {
						queue.add(new D(npos, nbit, ncnt, nmin, d));
					}
				}
			}
		}

		return -1;
	}

	@SuppressWarnings("unchecked")
	void run() {
		MyScanner sc = new MyScanner();

		n = sc.nextInt();
		m = sc.nextInt();
		e = sc.nextInt();
		s = sc.nextInt();
		t = sc.nextInt();
		r = sc.nextInt();

		edge = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			edge[i] = new LinkedList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			edge[a].add(b);
			edge[b].add(a);
		}
		from = new int[e];
		to = new int[e];
		map = new int[n];
		Arrays.fill(map, -1);
		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			from[i] = a;
			to[i] = b;
			map[c] = i;
		}

		System.out.println(dijkstra());
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}

	class MyScanner {
		int read() {
			try {
				return System.in.read();
			} catch (IOException e) {
				throw new InputMismatchException();
			}
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}