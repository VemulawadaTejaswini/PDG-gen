import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;

public class Main {
	public static ArrayList<HashMap<Integer, Integer>> path = new ArrayList<HashMap<Integer, Integer>>();
	public static void bitDP(int v) {
		int[][] dist = new int[(int)Math.pow(2, v)][v];
		for(int i=0; i<dist.length; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		dist[1][0] = 0;
		// O(2^v * v^2)
		for(int i=1; i<(int)Math.pow(2, v); i++) {
			for(int j=0; j<v; j++) {
				if((i & (1<<j)) != 0) {
					for(int k=0; k<v; k++) {
						if((i & (1<<k)) != 0 && j != k && path.get(k).containsKey(j) && dist[i-(1<<j)][k] != Integer.MAX_VALUE) {
							dist[i][j] = Math.min(dist[i][j], dist[i-(1<<j)][k] + path.get(k).get(j));
						}
					}
				}
			}
		}
		int minDist = Integer.MAX_VALUE;
		for(int i=1; i<v; i++) {
			if(path.get(i).containsKey(0) && dist[dist.length-1][i] != Integer.MAX_VALUE) {
				minDist = Math.min(minDist, dist[dist.length-1][i] + path.get(i).get(0));
			}
		}
		if(minDist == Integer.MAX_VALUE) minDist = -1;
		System.out.println(minDist);
	}

	public static void main(String[] args) {
		FS r = new FS();
		int v = r.nextInt();
		int e = r.nextInt();
		for(int i=0; i<v; i++) {
			path.add(new HashMap<Integer, Integer>());
		}
		for(int i=0; i<e; i++) {
			int s = r.nextInt();
			int t = r.nextInt();
			int d = r.nextInt();
			path.get(s).put(t, d);
		}
		bitDP(v);
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