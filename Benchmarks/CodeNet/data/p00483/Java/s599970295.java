import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Task5 solver = new Task5();
		solver.solve(1, in, out);
		out.close();
	}

	static class Task5 {
		public void solve(int testNumber, Scanner sc, PrintWriter out) {

			int m = sc.nextInt();
			int n = sc.nextInt();
			int k = sc.nextInt();
			char[][] map = new char[m][];
			for (int i = 0; i < m; i++) {
				map[i] = sc.next().toCharArray();
			}

			int[][] sj = new int[m + 1][n + 1];
			int[][] so = new int[m + 1][n + 1];
			int[][] si = new int[m + 1][n + 1];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					sj[i + 1][j + 1] = sj[i][j + 1] + sj[i + 1][j] - sj[i][j] + (map[i][j] == 'J' ? 1 : 0);
					so[i + 1][j + 1] = so[i][j + 1] + so[i + 1][j] - so[i][j] + (map[i][j] == 'O' ? 1 : 0);
					si[i + 1][j + 1] = si[i][j + 1] + si[i + 1][j] - si[i][j] + (map[i][j] == 'I' ? 1 : 0);
				}
			}

			for (int i = 0; i < k; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				int rj = sj[c][d] - sj[a - 1][d] - sj[c][b - 1] + sj[a - 1][b - 1];
				int ro = so[c][d] - so[a - 1][d] - so[c][b - 1] + so[a - 1][b - 1];
				int ri = si[c][d] - si[a - 1][d] - si[c][b - 1] + si[a - 1][b - 1];
				out.println(rj + " " + ro + " " + ri);
			}
		}

	}

	static class Scanner {
		private final InputStream in;
		private final byte[] buffer;
		private int ptr;
		private int buflen;

		public Scanner(InputStream in) {
			this.in = in;
			this.buffer = new byte[1024];
			this.ptr = 0;
			this.buflen = 0;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) return true;
			else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) return false;
			}
			return true;
		}

		private byte readByte() {
			if (hasNextByte()) return buffer[ptr++];
			return -1;
		}

		private boolean isPrintableChar(byte c) {
			return '!' <= c && c <= '~';
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
				ptr++;
			}
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			byte b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			byte b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) throw new NumberFormatException();
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

	}
}


