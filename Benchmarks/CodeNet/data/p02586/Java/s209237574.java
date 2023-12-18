
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {

		try {
			//String S = sc.next().trim();
			int R = sc.nextInt();
			int C = sc.nextInt();
			int K = sc.nextInt();
			int[][] rcv = new int[R + 1][C + 1];

			for (int i = 0; i < K; i++) {
				int r = sc.nextInt();
				int c = sc.nextInt();
				int v = sc.nextInt();
				rcv[r][c] = v;
			}

			int[][] dp = new int[R + 1][C + 1];
			TreeSet<Integer> ts[] = new TreeSet[R + 1];
			for (int i = 1; i <= R; i++) {
				ts[i] = new TreeSet<>();
				for (int j = 1; j <= C; j++) {
					if (rcv[i][j] > 0) {
						if (ts[i].size() >= 3) {
							int first = ts[i].first();
							if (ts[i].first() < rcv[i][j]) {
								int ini = ts[i].pollFirst();
								ts[i].add(rcv[i][j]);
								dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + rcv[i][j] - ini;
							} else {
								dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
							}
						} else {
							dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + rcv[i][j];
							ts[i].add(rcv[i][j]);
						}
					} else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
					}
				}
			}

			//out.println(Arrays.toString(A));

			out.println(dp[R][C]);

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			out.flush();
			out.close();
		}

	}

	///////////////////////////////////////////////////////////
	//Ignore
	///////////////////////////////////////////////////////////
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
