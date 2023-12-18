import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		char[] s = sc.next().toCharArray();
		int max = 0;
		
		loop: for (int i = 0; i < s.length; i++) {
			if (s[i] == 'J') {
				int countJ = 1, countO = 0, countI = 0;
				for (int j = i; j < s.length; j++, i++) {
					if (s[i] == 'J') countJ++;
					else if (s[i] == 'O') break;
					else continue loop;
				}
				for (int j = i; j < s.length; j++, i++) {
					if (s[i] == 'O') countO++;
					else if (s[i] == 'I') break;
					else {
						i--;
						continue loop;
					}
				}
				for (int j = i; j < s.length; j++, i++) {
					if (s[i] == 'I') countI++;
					else {
						i--;
						break;
					}
				}
				if (countO <= countJ && countO <= countI) {
					max = max(max, countO);
				}
			}
		}
		
		out.println(max);
		out.flush();
	}
	
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	static int max(int a, int b) {
		return a < b ? b : a;
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