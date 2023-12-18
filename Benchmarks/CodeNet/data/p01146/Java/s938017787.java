import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
	int n, m, l, k, a, h;
	int[] f;
	int[][] g;
	List<Integer>[] e;

	class D implements Comparable<D>{
		int pos;
		int rem;
		int min;

		D(int p, int r, int m) {
			this.pos = p;
			this.rem = r;
			this.min = m;
		}

		@Override
		public int compareTo(D o) {
			if (this.min != o.min)
				return this.min - o.min;
			if (this.pos != o.pos)
				return this.pos - o.pos;
			return o.rem - this.rem;
		}

		@Override
		public String toString() {
			return "(" + pos + ", " + rem + ", " + min + ")";
		}
	}

	int dijkstra() {
		PriorityQueue<D> queue = new PriorityQueue<D>();
		queue.add(new D(a, m, 0));
		boolean[][] visit = new boolean[n][m + 1];

		while (!queue.isEmpty()) {
			D d = queue.poll();
			int pos = d.pos;
			int rem = d.rem;
			int min = d.min;
			//-----------------------------------------
			//			System.out.println(d);
			//-----------------------------------------

			if (pos == h) return min;
			if (visit[pos][rem]) continue;
			visit[pos][rem] = true;

			if (f[pos] == 1) {
				for (int i = 0; rem + i <= m; i++) {
					int nrem = rem + i;
					int nmin = min + i;
					if (visit[pos][nrem]) continue;
					queue.add(new D(pos, nrem, nmin));
				}
			}
			for (Integer I: e[pos]) {
				int nrem = rem - g[pos][I];
				int nmin = min + g[pos][I];
				if (nrem < 0) continue;
				if (visit[I][nrem]) continue;
				queue.add(new D(I, nrem, nmin));
			}
		}

		return -1;
	}

	void run() {
		MyScanner sc = new MyScanner();

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			l = sc.nextInt();
			k = sc.nextInt();
			a = sc.nextInt();
			h = sc.nextInt();
			if ((n | m | l | k | a | h) == 0) {
				break;
			}
			f = new int[n];
			for (int i = 0; i < l; i++) {
				f[sc.nextInt()] = 1;
			}
			g = new int[n][n];
			e = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				e[i] = new LinkedList<Integer>();
			}
			for (int i = 0; i < k; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int t = sc.nextInt();
				g[x][y] = g[y][x] = t;
				e[x].add(y);
				e[y].add(x);
			}

			int ans = dijkstra();
			if (ans < 0) {
				System.out.println("Help!");
			} else {
				System.out.println(ans);
			}
		}
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