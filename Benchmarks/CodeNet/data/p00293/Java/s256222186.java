import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		TreeSet<Time> ts = new TreeSet<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			ts.add(new Time(sc.nextInt(), sc.nextInt()));
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			ts.add(new Time(sc.nextInt(), sc.nextInt()));
		}

		out.print(ts.pollFirst());
		for (Time t : ts) {
			out.print(" " + t.toString());
		}
		out.println();
		out.flush();
	}

	static class Time implements Comparable<Time> {
		int h, m;

		public Time(int h, int m) {
			this.h = h;
			this.m = m;
		}

		@Override
		public int compareTo(Time t) {
			return (h * 60 + m) - (t.h * 60 + t.m);
		}

		@Override
		public String toString() {
			return String.format("%d:%02d", h, m);
		}
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
			if (buflen <= 0) { return false; }
		}
		return true;
	}

	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}

	private boolean isPrintableChar(int c) {
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

	public int nextInt() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		int n = 0;
		boolean minus = false;
		byte b = readByte();
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		if (b < '0' || '9' < b) { throw new NumberFormatException(); }
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