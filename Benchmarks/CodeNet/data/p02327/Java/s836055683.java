import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
	public static class Point {
		int i,h;
		public Point(int i, int h) {
			this.i = i;
			this.h = h;
		}
	}

	public static void main(String[] args) {
		FS r = new FS();
		int H = r.nextInt();
		int W = r.nextInt();
		boolean[][] map = new boolean[H][W];
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				map[i][j] = (r.nextInt() == 0);
			}
		}
		int[][] height = new int[H][W];
		for(int i=0; i<W; i++) {
			if(map[0][i]) height[0][i] = 1;
			else height[0][i] = 0;
		}
		for(int i=1; i<H; i++) {
			for(int j=0; j<W; j++) {
				if(!map[i][j]) height[i][j] = 0;
				else height[i][j] = height[i-1][j]+1;
			}
		}
		int maxRect = 0;
		for(int i=0; i<H; i++) {
			Deque<Point> q = new ArrayDeque<Point>();
			for(int j=0; j<W; j++) {
				if(q.isEmpty() || q.getLast().h < height[i][j]) {
					q.addLast(new Point(j, height[i][j]));
				} else if(q.getLast().h == height[i][j]) {
					continue;
				} else {
					while(true) {
						Point p = q.pollLast();
						maxRect = Math.max(maxRect, p.h * (j - p.i));
						if(q.isEmpty()) {
							q.addLast(new Point(p.i, height[i][j]));
							break;
						}
						if(q.getLast().h == height[i][j]) break;
						if(q.getLast().h < height[i][j]) {
							q.addLast(new Point(p.i, height[i][j]));
							break;
						}
					}
				}
			}
			while(!q.isEmpty()) {
				Point p = q.pollLast();
				maxRect = Math.max(maxRect, p.h * (W - p.i));
			}
		}
		System.out.println(maxRect);
	}
	
	// Read Class
	static class FS {
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
	
		private int readByte() { return hasNextByte() ? buffer[ptr++] : -1;}
		private boolean isPrintableChar(int c) {return 33 <= c && c <= 126;}
		private void skipUnprintable() {while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	
		public boolean hasNext() { skipUnprintable(); return hasNextByte();}
		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while(isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		public int nextInt() {
			return (int)nextLong();
		}
		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
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
			while(true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if(b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}
	}
}