import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		MyScanner sc = new MyScanner();
		int n = sc.nextInt();
		int r = sc.nextInt();
		int l = sc.nextInt();
		int d, t, x, time = 0, max = 0;
		int[] tv = new int[n];
		int[] score = new int[n];
		for (int i = 0; i < r; i++) {
			d = sc.nextInt() - 1;
			t = sc.nextInt();
			x = sc.nextInt();
			tv[max] += t - time;
			score[d] += x;
			if (x > 0) {
				if (score[max] < score[d]) {
					max = d;
				} else if (score[max] == score[d]) {
					max = min(max, d);
				}
			} else if (max == d) {
				max = 0;
				for (int j = 1; j < n; j++) {
					if (score[max] < score[j]) {
						max = j;
					}
				}
			}
			time = t;
		}
		tv[max] += l - time;
		int ans = 0;
		for (int i = 1; i < n; i++) {
			if (tv[ans] < tv[i]) {
				ans = i;
			}
		}
		System.out.println(ans + 1);
	}

	static int min(int a, int b) {
		return a < b ? a : b;
	}
}

class MyScanner {
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
}