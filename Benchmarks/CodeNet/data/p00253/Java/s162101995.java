import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	static void solve() {
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] h = new int[n];
			int[] dh = new int[3];
			h[0] = sc.nextInt();
			for (int i = 0; i < 3; i++) {
				h[i + 1] = sc.nextInt();
				dh[i] = h[i + 1] - h[i];
			}
			if (dh[0] != dh[1]) {
				for (int i = 3; i < n; i++)
					sc.nextInt();
				if (dh[1] == dh[2]) {
					out.println(h[0]);
				} else {
					out.println(h[1]);
				}
			} else if (dh[1] != dh[2]) {
				for (int i = 3; i < n; i++)
					sc.nextInt();
				out.println(h[3]);
			} else {
				int ans = 0;
				for (int i = 3; i < n; i++) {
					h[i] = sc.nextInt();
					if ((h[i] - h[i - 1]) != dh[0]) {
						ans = h[i];
					}
				}
				out.println(ans);
			}
		}
		out.flush();
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