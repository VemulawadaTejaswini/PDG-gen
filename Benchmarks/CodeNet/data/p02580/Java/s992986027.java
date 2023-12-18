import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();
		Map<Long, Boolean> S = new HashMap<Long, Boolean>();
		Map<Integer, Integer> mapH = new HashMap<Integer, Integer>();
		Map<Integer, Integer> mapW = new HashMap<Integer, Integer>();
		for (int i = 0; i < M; i++) {
			int h = sc.nextInt() - 1;
			int w = sc.nextInt() - 1;
			S.put((long)h * 1000000L + w, true);
			mapH.put(h, mapH.getOrDefault(h, 0) + 1);
			mapW.put(w, mapW.getOrDefault(w, 0) + 1);
		}
		int maxH = 0;
		for (Entry<Integer, Integer> entry : mapH.entrySet()) {
			if (maxH < entry.getValue()) {
				maxH = entry.getValue();
			}
		}
		int maxW = 0;
		for (Entry<Integer, Integer> entry : mapW.entrySet()) {
			if (maxW < entry.getValue()) {
				maxW = entry.getValue();
			}
		}
		List<Integer> listMaxHKeys = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : mapH.entrySet()) {
			if (entry.getValue() == maxH) {
				listMaxHKeys.add(entry.getKey());
			}
		}
		List<Integer> listMaxWKeys = new ArrayList<Integer>();
		for (Entry<Integer, Integer> entry : mapW.entrySet()) {
			if (entry.getValue() == maxW) {
				listMaxWKeys.add(entry.getKey());
			}
		}
		int ans = maxH + maxW;
		Set<Long> bomb = S.keySet();
		for (int h : listMaxHKeys) {
			for (int w : listMaxWKeys) {
				if (!bomb.contains((long)h * 1000000L + w)) {
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println(ans - 1);
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

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
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
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}