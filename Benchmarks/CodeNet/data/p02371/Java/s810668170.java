import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
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

	public static int maxIndex(int[] lst) {
		int tmpMax = 0;
		int maxIdx = -1;
		for(int i=0; i<lst.length; i++) {
			if(tmpMax < lst[i]) {
				tmpMax = lst[i];
				maxIdx = i;
			}
		}
		return maxIdx;
	}

	public static void main(String[] args) {
		FS r = new FS();
		int v = r.nextInt();
		int[][] matrix = new int[v][v];
		for(int i=0; i<v; i++) {
			Arrays.fill(matrix[i], Integer.MAX_VALUE);
		}

		for(int i=0; i<v-1; i++) {
			int s = r.nextInt();
			int t = r.nextInt();
			int d = r.nextInt();
			matrix[s][t] = d;
			matrix[t][s] = d;
		}

		int[] cost = dijkstra(v, maxIndex(dijkstra(v, 0, matrix)), matrix);
		System.out.println(cost[maxIndex(cost)]);
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