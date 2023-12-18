import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

@SuppressWarnings("unchecked")
public class Main {
	private static class Task {
		int INF = (int) 1e9;
		ArrayList<Integer>[] graph;

		void bfs(int[] dist, ArrayDeque<Integer> deque) {
			while (!deque.isEmpty()) {
				int v = deque.poll();
				for (int u : graph[v]) {
					if (dist[u] != INF)
						continue;
					dist[u] = dist[v] + 1;
					deque.add(u);
				}
			}
		}

		int bfs(int s, int[] dist) {
			ArrayDeque<Integer> deque = new ArrayDeque<>();
			deque.add(s);
			dist[s] = 0;
			while (!deque.isEmpty()) {
				int p = deque.poll();
				for (int u : graph[p]) {
					if (dist[u] != INF)
						continue;
					dist[u] = dist[p] + 1;
					deque.add(u);
				}
			}
			int v = 0;
			for (int i = 0; i < dist.length; i++) {
				if (dist[i] > dist[v])
					v = i;
			}
			return v;
		}

		void solve(FastScanner in, PrintWriter out) {
			int N = in.nextInt();
			graph = new ArrayList[N];
			for (int i = 0; i < graph.length; i++) {
				graph[i] = new ArrayList<>();
			}

			for (int i = 0; i < N - 1; i++) {
				int u = in.nextInt() - 1;
				int v = in.nextInt() - 1;

				graph[u].add(v);
				graph[v].add(u);
			}

			int[] dist = new int[N];
			Arrays.fill(dist, INF);
			int v = bfs(0, dist);
			Arrays.fill(dist, INF);
			int u = bfs(v, dist);

			int diameter = dist[u];
			if (diameter % 2 == 1) {
				int x = 0, y = 0;
				for (int i = 0; i < dist.length; i++) {
					if (dist[i] == diameter / 2)
						x = i;
					if (dist[i] == diameter / 2 + 1)
						y = i;
				}
				// center is edge x-y
				Arrays.fill(dist, INF);
				ArrayDeque<Integer> deque = new ArrayDeque<>();
				deque.add(x);
				deque.add(y);
				dist[x] = 0;
				dist[y] = 0;
				bfs(dist, deque);

				int[] ans = new int[N];
				for (int i = 0; i < ans.length; i++) {
					ans[i] = diameter / 2 + dist[i] + 1;
					out.println(2 * (N - 1) - ans[i]);
				}

			} else {
				int x = 0;
				for (int i = 0; i < dist.length; i++) {
					if (dist[i] == diameter / 2)
						x = i;
				}
				// center is x
				Arrays.fill(dist, INF);
				ArrayDeque<Integer> deque = new ArrayDeque<>();
				deque.add(x);
				dist[x] = 0;
				bfs(dist, deque);
				int[] ans = new int[N];
				for (int i = 0; i < ans.length; i++) {
					ans[i] = diameter / 2 + dist[i];
					out.println(2 * (N - 1) - ans[i]);
				}

			}

		}
	}

	/**
	 * ?????????????????????????????¬????????§??????
	 */
	public static void main(String[] args) {
		OutputStream outputStream = System.out;
		FastScanner in = new FastScanner();
		PrintWriter out = new PrintWriter(outputStream);
		Task solver = new Task();
		solver.solve(in, out);
		out.close();
	}

	private static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int bufferLength = 0;

		private boolean hasNextByte() {
			if (ptr < bufferLength) {
				return true;
			} else {
				ptr = 0;
				try {
					bufferLength = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (bufferLength <= 0) {
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

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		boolean hasNext() {
			skipUnprintable();
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

		long nextLong() {
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

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++) {
				array[i] = nextDouble();
			}
			return array;
		}

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][];
			for (int i = 0; i < n; i++) {
				map[i] = nextDoubleArray(m);
			}
			return map;
		}

		public int nextInt() {
			return (int) nextLong();
		}

		public int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		public long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		public String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();
			return array;
		}

		public char[][] nextCharMap(int n) {
			char[][] array = new char[n][];
			for (int i = 0; i < n; i++)
				array[i] = next().toCharArray();
			return array;
		}

		public int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][];
			for (int i = 0; i < n; i++) {
				map[i] = nextIntArray(m);
			}
			return map;
		}
	}
}