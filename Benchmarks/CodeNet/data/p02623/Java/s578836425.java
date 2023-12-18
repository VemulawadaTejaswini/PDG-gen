import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class Main {

	static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		ArrayDeque<Long> a = input(n);
		ArrayDeque<Long> b = input(m);

		long sum = 0L, cnt = 0L;
		while (true) {
			ArrayDeque<Long> t = null;
			if (!a.isEmpty() && !b.isEmpty()) {
				t = (a.getFirst() < b.getFirst()) ? a : b;
			} else if (!a.isEmpty()) {
				t = a;
			} else if (!b.isEmpty()) {
				t = b;
			} else {
				System.out.println(cnt);
				return;
			}

			if (sum + t.getFirst() > k) {
				System.out.println(cnt);
				return;
			}

			sum += t.removeFirst();
			++cnt;
		}

	}

	static ArrayDeque<Long> input(int size) {
		ArrayDeque<Long> r = new ArrayDeque<Long>();
		for (int i = 0; i < size; ++i) {
			r.addLast(sc.nextLong());
		}
		return r;
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
		}

		ptr = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return buflen > 0;
	}

	private int readByte() {
		return hasNextByte() ? buffer[ptr++] : -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
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

	public String nextLine() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b) || b == ' ') {
			sb.appendCodePoint(b);
			b = readByte();
		}

		while (b != '\n') {
			b = readByte();
		}
		return sb.toString();
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

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}