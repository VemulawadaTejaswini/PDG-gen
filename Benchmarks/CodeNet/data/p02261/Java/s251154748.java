

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	public static void main(String[] args) {
		// 入力の受け取り
		FastScanner sc = new FastScanner();
		// 解法
		int N = sc.nextInt();
		String[] card = new String[N];
		int[] number = new int[N];
		for (int i = 0; i < N; i++) {
			card[i] = sc.next();
			number[i] = Integer.parseInt(card[i].substring(1));
		}

		// Bubble sort
		String[] cardB = card.clone();
		int[] numberB = number.clone();
		for (int i = 1; i < N; i++) {
			for (int j = N - 1; j >= i; j--) {
				if (numberB[j] < numberB[j - 1]) {
					int w1 = numberB[j];
					numberB[j] = numberB[j - 1];
					numberB[j - 1] = w1;
					String w2 = cardB[j];
					cardB[j] = cardB[j - 1];
					cardB[j - 1] = w2;
				}
			}
		}

		// Selection sort
		String[] cardS = card.clone();
		int[] numberS = number.clone();
		for (int i = 0; i < N - 1; i++) {
			int minId = i;
			for (int j = i; j < N; j++) {
				if (numberS[minId] > numberS[j]) {
					minId = j;
				}
			}
			if (minId != i) {
				int w1 = numberS[i];
				numberS[i] = numberS[minId];
				numberS[minId] = w1;
				String w2 = cardS[i];
				cardS[i] = cardS[minId];
				cardS[minId] = w2;
			}
		}

		for (int i = 0; i < numberB.length; i++) {
			System.out.print(cardB[i] + (i!=numberB.length-1?" ":"\n"));
		}
		System.out.println("Stable");

		for (int i = 0; i < numberS.length; i++) {
			System.out.print(cardS[i] + (i!=numberS.length-1?" ":"\n"));
		}
		if (Arrays.deepEquals(cardS, cardB)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
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
			if (buflen <= 0) {
				return false;
			}
		}
		return true;
	}

	private int readByte() {
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}

	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}

	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
	}

	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}

	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		int n = (int)nextLong();
		return n;
	}
}


