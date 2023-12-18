import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	
	static int[] x = { -1, 0, 1, -1, 0, 1, -1, 0, 1 };
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		while (true) {
			char[] steps = sc.next().toCharArray();
			if (steps[0] == '#') break;
			
			if (steps.length <= 2) {
				out.println(0);
			} else {
				int step = 0, left = -1, right = 1, foot = 0;
				for (int i = 0; i < steps.length; i++) {
					int next = x[steps[i] - '1'];
					if (foot % 2 == 0) {
						if (next > right) {
							step++;
							right = next;
						} else {
							left = next;
							foot++;
						}
					} else {
						if (next < left) {
							step++;
							left = next;
						} else {
							right = next;
							foot++;
						}
					}
				}
				
				int min = step;
				
				step = 0;
				left = -1;
				right = 1;
				foot = 1;
				for (int i = 0; i < steps.length; i++) {
					int next = x[steps[i] - '1'];
					if (foot % 2 == 0) {
						if (next > right) {
							step++;
							right = next;
						} else {
							left = next;
							foot++;
						}
					} else {
						if (next < left) {
							step++;
							left = next;
						} else {
							right = next;
							foot++;
						}
					}
				}
				
				min = Math.min(min, step);
				
				out.println(min);
			}
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
	
	public String next() {
		if (!hasNext()) { throw new NoSuchElementException(); }
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
}