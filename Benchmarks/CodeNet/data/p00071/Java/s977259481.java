import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			char[][] board = new char[8][8];
			for (int y = 0; y < 8; y++) {
				board[y] = sc.next().toCharArray();
			}
			
			int sx = sc.nextInt() - 1;
			int sy = sc.nextInt() - 1;
			
			bomb(board, sx, sy);
			
			out.println("Data " + (i + 1) + ":");
			for (int y = 0; y < 8; y++) {
				for (int x = 0; x < 8; x++) {
					out.print(board[y][x]);
				}
				out.println();
			}
		}
		out.flush();
	}
	
	static void bomb(char[][] board, int bx, int by) {
		if (board[by][bx] == '1') {
			board[by][bx] = '0';
			for (int x = max(0, bx - 3); x <= min(7, bx + 3); x++) {
				bomb(board, x, by);
			}
			for (int y = max(0, by - 3); y <= min(7, by + 3); y++) {
				bomb(board, bx, y);
			}
		}
	}
	
	static int max(int a, int b) {
		return a < b ? b : a;
	}
	
	static int min(int a, int b) {
		return a < b ? a : b;
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