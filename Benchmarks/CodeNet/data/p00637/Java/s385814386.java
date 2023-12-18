import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n, a, b = 0;
		int[] page;
		boolean flag = false;
		
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			
			StringBuilder sb = new StringBuilder();
			
			page = new int[n + 1];
			for (int i = 0; i < n; i++) {
				page[i] = sc.nextInt();
			}
			
			flag = false;
			for (int i = 0; i < n; i++) {
				a = page[i];
				flag = false;
				for (int j = i + 1; j < n; j++) {
					if (page[j] - page[j - 1] == 1) {
						flag = true;
						b = page[j];
					} else {
						break;
					}
					i++;
				}
				if (flag) {
					sb.append(a);
					sb.append("-");
					sb.append(b);
				} else {
					sb.append(a);
				}
				
				if (i < n - 1) {
					sb.append(" ");
				}
			}
			
			out.println(sb.toString());
		}
		
		out.flush();
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