
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;

	class App implements Comparable<App> {
		int from;
		int to;
		int w;

		App(int from, int to, int w) {
			this.from = from;
			this.to = to;
			this.w = w;
		}

		public int compareTo(App s) {
			if (from != s.from) return from - s.from;
			if (to != s.to) return to - s.to;
			return w - s.w;
		}

		public String toString() {
			return getClass().getName() + " : " + from + " " + to + " " + w;
		}
	}
	
	int MAX = 400;
	int[][][] dp = new int[2][MAX][MAX];
	
	public void solve() {
		while (true) {
			int n = in.nextInt();
			if (n == 0) break;

			App[] app = new App[n];
			for (int i = 0; i < n; i++) {
				app[i] = new App(in.nextInt(), in.nextInt(), in.nextInt());
			}
			Arrays.sort(app);
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < MAX; j++) {
					Arrays.fill(dp[i][j], 0);
				}
			}
			
			for (int i = 0; i < n; i++) {
				int to = app[i].to;
				int cur = i % 2, next = (i + 1) % 2;
				for (int f2 = 0; f2 < MAX; f2++) {
					for (int f1 = 0; f1 < MAX; f1++) {
						if (f1 <= app[i].from) {
							dp[next][to+1][f2] = Math.max(dp[next][to+1][f2], dp[cur][f1][f2] + app[i].w);
							dp[next][f2][to+1] = Math.max(dp[next][f2][to+1], dp[cur][f2][f1] + app[i].w);
						}
						dp[next][f1][f2] = Math.max(dp[next][f1][f2], dp[cur][f1][f2]);
					}
				}
				
			}
			
			int res = 0;
			for (int i = 0; i < MAX; i++) {
				for (int j = 0; j < MAX; j++) {
					res = Math.max(res, dp[n%2][i][j]);
				}
			}
			System.out.println(res);
			
			/*
			Arrays.fill(dp, 0);
			Arrays.fill(prev, -1);
			Arrays.fill(id, -1);
			Arrays.fill(used, false);
			
			for (int i = 0; i < n; i++) {
				for (int f = 0; f <= app[i].from; f++) {
					for (int t = app[i].to + 1; t <= 365; t++) {
						if (dp[t] < dp[f] + app[i].w) {
							dp[t] = dp[f] + app[i].w;
							prev[t] = f;
							id[t] = i;
						}
					}
				}
			}
			
			int idx = -1, max = 0;
			for (int i = 0; i < dp.length; i++) {
				if (max < dp[i]) {
					max = dp[i];
					idx = i;
				}
			}
			
			int res = dp[idx];
			while (id[idx] != -1) {
				used[id[idx]] = true;
				idx = prev[idx];
			}

			Arrays.fill(dp, 0);
			for (int i = 0; i < n; i++) {
				if (used[i]) continue;
				for (int f = 0; f <= app[i].from; f++) {
					for (int t = app[i].to + 1; t <= 365; t++) {
						dp[t] = Math.max(dp[f] + app[i].w, dp[t]);
					}
				}
			}
			
			max = 0;
			for (int i = 0; i < dp.length; i++) {
				max = Math.max(max, dp[i]);
			}
			res += max;
			System.out.println(res);
			*/
		}
	}
	
	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
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

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
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

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
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

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
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

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
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