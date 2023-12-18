
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
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
			int M = sc.nextInt();

			Info[] counth = new Info[H];
			for (int i = 0; i < H; i++) {
				Info hi = new Info(i, 0);
				counth[i] = hi;
			}
			Info[] countw = new Info[W];
			for (int i = 0; i < W; i++) {
				Info wi = new Info(i, 0);
				countw[i] = wi;
			}

			Bombs[] bomb = new Bombs[M];
			HashSet<Long> bombs = new HashSet<Long>();
			for (int i = 0; i < M; i++) {
				int h = sc.nextInt() - 1;
				int w = sc.nextInt() - 1;
				Bombs b = new Bombs(h, w);
				bomb[i] = b;
				bombs.add(hash(h, w));

				counth[h].count++;
				countw[w].count++;
			}

			Arrays.parallelSort(counth);
			Arrays.parallelSort(countw);

			int maxh = counth[0].count;
			int maxw = countw[0].count;

			ArrayList<Integer> tsh = new ArrayList<>();
			ArrayList<Integer> tsw = new ArrayList<>();
			for (int i = 0; i < H; i++) {
				if (counth[i].count == maxh) {
					tsh.add(counth[i].a);
				}
			}
			for (int i = 0; i < W; i++) {
				if (countw[i].count == maxw) {
					tsw.add(countw[i].a);
				}
			}

			boolean find = false;
			out: for (int i = 0; i < tsh.size(); i++) {
				in: for (int j = 0; j < tsw.size(); j++) {
					int hn = tsh.get(i);
					int wn = tsw.get(j);
					if (!bombs.contains(hash(hn, wn))) {
						find = true;
						break out;
					}
				}
			}

			if (find) {
				out.println(maxh + maxw);
			} else {
				out.println(maxh + maxw - 1);
			}

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

	static long hash(int r, int c) {
		return r * (long) 10e6 + c;
	}

	class Info implements Comparable<Info> {
		public int a;
		public int count;

		public Info(int a, int b) {
			this.a = a;
			this.count = b;
		}

		@Override
		public int compareTo(Info o) {
			return Integer.compare(o.count, this.count);
		}
	}

	class Bombs {
		public int a;
		public int b;

		public Bombs(int a, int b) {
			this.a = a;
			this.b = b;
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
