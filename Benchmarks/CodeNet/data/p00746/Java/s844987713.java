import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	static void solve() {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) {
				System.exit(0);
			} else {
				int[] x = new int[N];
				int[] y = new int[N];
				for (int i = 1; i < N; i++) {
					int n = sc.nextInt();
					int d = sc.nextInt();
					if (d == 0) {
						x[i] = x[n] - 1;
						y[i] = y[n];
					} else if (d == 1) {
						x[i] = x[n];
						y[i] = y[n] - 1;
					} else if (d == 2) {
						x[i] = x[n] + 1;
						y[i] = y[n];
					} else if (d == 3) {
						x[i] = x[n];
						y[i] = y[n] + 1;
					}
				}
				Arrays.sort(x);
				Arrays.sort(y);
				int width = x[N - 1] - x[0] + 1;
				int height = y[N - 1] - y[0] + 1;
				out.println(width + " " + height);
			}
			out.flush();
		}
	}

	public static void main(String[] args) {
		solve();
	}

	static int max(int a, int b) {
		return a < b ? b : a;
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private static boolean isPrintableChar(int c) {
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
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public int nextInt() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		int n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
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

	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
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

	public double nextDouble() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		double d = 0;
		boolean minus = false;
		int b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) {
			throw new NumberFormatException();
		}
		long t = 0;
		while (true) {
			if ('0' <= b && b <= '9') {
				d *= 10;
				d += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				if (t != 0) {
					d = d / t;
				}
				return minus ? -d : d;
			} else if (b == '.') {
				t = 1;
				b = readByte();
				continue;
			} else {
				throw new NumberFormatException();
			}
			t *= 10;
			b = readByte();
		}
	}
}