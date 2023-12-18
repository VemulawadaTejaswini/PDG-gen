
import java.awt.Point;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

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
			int H = sc.nextInt();
			int W = sc.nextInt();
			int ch = sc.nextInt();
			int cw = sc.nextInt();
			int dh = sc.nextInt();
			int dw = sc.nextInt();
			char[][] s = new char[H][W];
			for (int i = 0; i < H; i++) {
				String S = sc.next().trim();
				for (int j = 0; j < W; j++) {
					s[i][j] = S.charAt(j);
				}
			}
			//out.println(Arrays.toString(A));

			ArrayDeque<Point> deq = new ArrayDeque<>();
			deq.add(new Point(ch - 1, cw - 1));
			boolean goal = false;
			int[][] d = new int[H][W];
			boolean[][] visit = new boolean[H][W];
			int INF = Integer.MAX_VALUE;
			for (int h = 0; h < H; h++) {
				Arrays.fill(d[h], INF);//初期化
			}

			int[] dx1 = { 1, 0, -1, 0 }, dy1 = { 0, 1, 0, -1 }; //4 directions
			int[] dx2 = { -2, 2, 0, 0, -1, 1, -1, 1, -1, -1, 1, 1, -2, -2, -2, -2, 2, 2, 2, 2 },
					dy2 = { 0, 0, 2, -2, -1, -1, 1, 1, 2, -2, -2, 2, -2, 2, -1, 1, -2, 2, 1, -1 }; //20 directions
			d[ch - 1][cw - 1] = 0;
			while (deq.size() > 0 && !goal) {
				Point p = deq.pollFirst();
				visit[p.x][p.y] = true;

				for (int i = 0; i < 4; i++) {
					int nx = p.x + dx1[i], ny = p.y + dy1[i];
					if (nx >= 0 && nx < H && ny >= 0 && ny < W && s[nx][ny] != '#' && visit[nx][ny] == false) {
						deq.addFirst(new Point(nx, ny));
						d[nx][ny] = d[p.x][p.y] + 0;
					}
				}

				for (int i = 0; i < 20; i++) {
					int nx = p.x + dx2[i], ny = p.y + dy2[i];
					if (nx >= 0 && nx < H && ny >= 0 && ny < W && s[nx][ny] != '#' && visit[nx][ny] == false
							&& d[nx][ny] >= d[p.x][p.y] + 1) {
						deq.addLast(new Point(nx, ny));
						d[nx][ny] = d[p.x][p.y] + 1;
					}
				}
			}

			if (d[dh - 1][dw - 1] == Integer.MAX_VALUE) {
				out.println(-1);
			} else {
				out.println(d[dh - 1][dw - 1]);
			}

		} catch (ArithmeticException ae) {
			//ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			//e.printStackTrace();
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
