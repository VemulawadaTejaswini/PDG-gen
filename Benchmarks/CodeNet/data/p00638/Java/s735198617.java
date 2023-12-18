import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			
			Bridge[] bridge = new Bridge[n];
			for (int i = 0; i < n; i++) {
				bridge[i] = new Bridge(sc.nextInt(), sc.nextInt());
			}
			Arrays.sort(bridge);
			
			boolean flag = true;
			int bag = 0;
			for (int i = 0; i < n; i++) {
				bag += bridge[i].tre;
				if (bag > bridge[i].max) {
					flag = false;
					break;
				}
			}
			if (flag) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}
		out.flush();
	}
	
	static class Bridge implements Comparable<Bridge> {
		int tre, max;
		
		public Bridge(int tre, int max) {
			this.tre = tre;
			this.max = max;
		}
		
		@Override
		public int compareTo(Bridge b) {
			return this.max - b.max;
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
			if (buflen <= 0) return false;
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