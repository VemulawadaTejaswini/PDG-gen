
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	InputStream is;

	int __t__ = 1;
	int __f__ = 0;
	int __FILE_DEBUG_FLAG__ = __f__;
	String __DEBUG_FILE_NAME__ = "src/T";

	FastScanner in;
	PrintWriter out;

	class Edge {
		int to;
		int c;

		Edge(int to, int c) {
			this.to = to;
			this.c = c;
		}
		
		public String toString() {
			return "(" + to + " " + c + ")";
		}
	}
	
	int[] dijkstra(ArrayList<Edge>[] g, int from) {
		int n = g.length;
		final int[] res = new int[n];
		Arrays.fill(res, INF);
		res[from] = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return res[a] - res[b];
			}
		});
		pq.add(from);
		
		while (!pq.isEmpty()) {
			int u = pq.poll();
			
			for (Edge e : g[u]) {
				if (res[u] + e.c < res[e.to]) {
					res[e.to] = res[u] + e.c;
					pq.add(e.to);
				}
			}
		}
		
		return res;
	}
	
	int INF = 100000000;
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	@SuppressWarnings("unchecked")
	public void solve() {
		while (true) {
			int N = in.nextInt(), M = in.nextInt(), cap = in.nextInt() * 10;
			if (N == 0) break;
			
			map.clear();
			int size = 0;
			String src = in.next(), dst = in.next();
			map.put(src, size++);
			map.put(dst, size++);
			
			int[] u = new int[N];
			int[] v = new int[N];
			int[] d = new int[N];
			for (int i = 0; i < N; i++) {
				String from = in.next(), to = in.next();
				d[i] = in.nextInt();
				
				if (map.containsKey(from)) {
					u[i] = map.get(from);
				} else {
					u[i] = size;
					map.put(from, size++);
				}
				
				if (map.containsKey(to)) {
					v[i] = map.get(to);
				} else {
					v[i] = size;
					map.put(to, size++);
				}				
			}
			
			ArrayList<Edge>[] g = new ArrayList[size];
			for (int i = 0; i < size; i++)
				g[i] = new ArrayList<Edge>();
			
			for (int i = 0; i < N; i++) {
				g[u[i]].add(new Edge(v[i], d[i]));
				g[v[i]].add(new Edge(u[i], d[i]));
			}
			
			int[] s = new int[M + 2];
			for (int i = 1; i <= M; i++) {
				String name = in.next();
				s[i] = map.get(name);
			}
			int S = map.get(src), T = map.get(dst);
			s[0] = S;
			s[M+1] = T;

			ArrayList<Edge>[] minCost = new ArrayList[M+2];
			for (int i = 0; i < M + 2; i++) {
				minCost[i] = new ArrayList<Edge>();
			}

			for (int i = 0; i < M + 2; i++) {
				int[] cost = dijkstra(g, s[i]);
				for (int j = 0; j < M + 2; j++) {
					minCost[i].add(new Edge(j, (cost[s[j]] <= cap) ? cost[s[j]] : INF));
				}
			}

			int[] res = dijkstra(minCost, 0);
			System.out.println(res[M+1] == INF ? -1 : res[M+1]);
		}
	}

	public void run() {
		if (__FILE_DEBUG_FLAG__ == __t__) {
			try {
				is = new FileInputStream(__DEBUG_FILE_NAME__);
			} catch (FileNotFoundException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			System.out.println("FILE_INPUT!");
		} else {
			is = System.in;
		}
		in = new FastScanner(is);
		out = new PrintWriter(System.out);

		solve();
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void mapDebug(int[][] a) {
		System.out.println("--------map display---------");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("----------------------------");
		System.out.println();
	}

	public void debug(Object... obj) {
		System.out.println(Arrays.deepToString(obj));
	}

	class FastScanner {
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;

		public FastScanner(InputStream stream) {
			this.stream = stream;
			//stream = new FileInputStream(new File("dec.in"));

		}

		int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		boolean isEndline(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArray(int n) {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();

			return array;
		}

		int[][] nextIntMap(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextIntArray(m);
			}
			return map;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		long[] nextLongArray(int n) {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();

			return array;
		}

		long[][] nextLongMap(int n, int m) {
			long[][] map = new long[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextLongArray(m);
			}
			return map;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		double[] nextDoubleArray(int n) {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();

			return array;
		}

		double[][] nextDoubleMap(int n, int m) {
			double[][] map = new double[n][m];
			for (int i = 0; i < n; i++) {
				map[i] = in.nextDoubleArray(m);
			}
			return map;
		}

		String next() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		String[] nextStringArray(int n) {
			String[] array = new String[n];
			for (int i = 0; i < n; i++)
				array[i] = next();

			return array;
		}

		String nextLine() {
			int c = read();
			while (isEndline(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndline(c));
			return res.toString();
		}
	}
}