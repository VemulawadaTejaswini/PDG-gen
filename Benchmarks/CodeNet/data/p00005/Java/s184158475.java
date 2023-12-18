import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	static FastScanner sc = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);

	static void solve() {
		while (true) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long A = max(a, b);
			long B = min(a, b);
			long ans1 = 1, ans2 = 1;
			long rr = A - B;
			A = max(B, rr);
			B = min(B, rr);
			long r = A - B;
			while (r > 0) {
				rr = r;
				A = max(B, rr);
				B = min(B, rr);
				r = A - B;
			}
			ans1 = rr;
			ans2 = (a * b) / ans1;

			out.println(ans1 + " " + ans2);
			out.flush();
		}
	}

	public static void main(String[] args) {
		solve();
	}

	static long max(long a, long b) {
		return a < b ? b : a;
	}

	static long min(long a, long b) {
		return a < b ? a : b;
	}

	static long abs(long a) {
		return a < 0 ? -a : a;
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