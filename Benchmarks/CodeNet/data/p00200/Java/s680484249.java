import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		FS reader = new FS();
		// write reader
		while(true) {
			int n = reader.nextInt();
			int m = reader.nextInt();
			if (n==0 && m==0) break;
			int[][] cost = new int[m][m];
			int[][] time = new int[m][m];
			for(int i=0; i<m; i++) {
				for(int j=0; j<m; j++) {
					cost[i][j] = Integer.MAX_VALUE;
					time[i][j] = Integer.MAX_VALUE;
				}
			}
			for(int i=0; i<n; i++) {
				int a = reader.nextInt();
				int b = reader.nextInt();
				int c = reader.nextInt();
				int t = reader.nextInt();
				cost[a-1][b-1] = c;
				cost[b-1][a-1] = c;
				time[a-1][b-1] = t;
				time[b-1][a-1] = t;
			}
			int k = reader.nextInt();
			for(int i=0; i<k; i++) {
				int p = reader.nextInt();
				int q = reader.nextInt();
				int r = reader.nextInt();
				solver(p, q, r, m, cost, time);
			}
		}
	}

	public static void solver(int p, int q, int r, int n, int[][] cost, int[][] time) {
		// write logic
		switch(r) {
			case 0:
				System.out.println(dijkstra(n, p-1, cost)[q-1]);
				break;
			case 1:
				System.out.println(dijkstra(n, p-1, time)[q-1]);
				break;
		}
	}

	public static int[] dijkstra(int n, int start, int[][] matrix) {
		boolean[] defnode = new boolean[n];
		int[] cost = new int[n];
		for(int i=0; i<n; i++) {
			defnode[i] = false;
			cost[i] = Integer.MAX_VALUE;
		}
		cost[start] = 0;
		int node = start;
		int counter = 0;
		while(true) {
			counter++;
			if(counter == n || node == Integer.MAX_VALUE) return cost;
			defnode[node] = true;
			for(int i=0; i<n; i++) {
				if(defnode[i]) continue;
				if(matrix[node][i] == Integer.MAX_VALUE) continue;
				cost[i] = Math.min(cost[i], cost[node]+matrix[node][i]);
			}
			int minnode = Integer.MAX_VALUE;
			int mincost = Integer.MAX_VALUE;
			for(int i=0; i<n; i++) {
				if(defnode[i]) continue;
				if(cost[i] < mincost) {
					minnode = i;
					mincost = cost[i];
				}
			}
			node = minnode;
		}
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