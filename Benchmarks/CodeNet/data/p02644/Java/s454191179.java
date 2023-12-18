import java.io.*;
import java.util.*;

public class Main{
	static Scanner sc;
	static PrintWriter pw;
	static final int INF = (int) 1e9; // don't increase, avoid overflow
	static ArrayList<Edge>[] adjList;
	static int V, n, m, k;
	static char c[][];
	static TreeSet<Integer>[] row, col;
	/*
	 * 1. Dijkstra's Algorithm for SSSP on weighted graphs
	 */

	static boolean ch(Integer mid, int x, int i) {
		return (mid != null && ((mid >= x && mid <= i) || (mid <= x && mid >= i)));
	}

	static int dijkstra(int is, int js, int it, int jt) // O(E log E)
	{
		int[][] dist = new int[n][m];
		for (int i = 0; i < dist.length; i++) {
			Arrays.fill(dist[i], INF);

		}
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		dist[is][js] = 0;
		pq.add(new Edge(new pair(is, js), 0)); // may add more in case of MSSP (Mult-Source)
		while (!pq.isEmpty()) {
			Edge cur = pq.remove();
			if (cur.node.x == it && cur.node.y == jt) {
				// for (int i = 0; i < dist.length; i++) {
				// System.out.println(Arrays.toString(dist[i]));
				// } // remove if all computations are needed
				return dist[it][jt];
			}
			if (cur.cost > dist[cur.node.x][cur.node.y]) // lazy deletion
				continue;
			for (int i = 0; i < n; i++) {
				if (ch(col[cur.node.y].ceiling(i), i, cur.node.x) || ch(col[cur.node.y].floor(i), i, cur.node.x)) {
					continue;
				}

				if (Math.abs(i - cur.node.x) <= k) {
					if (cur.cost + 1 < dist[i][cur.node.y])
						pq.add(new Edge(new pair(i, cur.node.y), dist[i][cur.node.y] = cur.cost + 1));
				}
			}

			for (int j = 0; j < m; j++) {
				if (ch(row[cur.node.x].ceiling(j), j, cur.node.y) || ch(row[cur.node.x].floor(j), j, cur.node.y)) {
//					System.out.println(col[j].ceiling(j) + " " + j + " " + cur.node.y);
					continue;

				}

				if (Math.abs(j - cur.node.y) <= k) {
					if (cur.cost + 1 < dist[cur.node.x][j])
						pq.add(new Edge(new pair(cur.node.x, j), dist[cur.node.x][j] = cur.cost + 1));
					// System.out.println(cur.node+" "+j);
				}
			}

		}
		return -1;
	}

	static class Edge implements Comparable<Edge> {
		pair node;
		int cost;

		Edge(pair a, int b) {
			node = a;
			cost = b;
		}

		public int compareTo(Edge e) {
			return cost - e.cost;
		}
	}

	static boolean valid(int i, int j) {
		return (i < n && i >= 0 && j >= 0 && j < n);
	}

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		pw = new PrintWriter(System.out);
		n = sc.nextInt();
		m = sc.nextInt();
		V = n * m;
		k = sc.nextInt();
		int is = sc.nextInt() - 1;
		int js = sc.nextInt() - 1;
		int it = sc.nextInt() - 1;
		int jt = sc.nextInt() - 1;
		c = new char[n][m];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.next().toCharArray();
		}
		row = new TreeSet[n];
		col = new TreeSet[m];
		for (int i = 0; i < n; i++) {
			row[i] = new TreeSet<>();
			for (int j = 0; j < m; j++) {
				if (c[i][j] == '@')
					row[i].add(j);
			}
		}

		for (int i = 0; i < m; i++) {
			col[i] = new TreeSet<>();
			for (int j = 0; j < n; j++) {
				if (c[j][i] == '@')
					col[i].add(j);
			}
		}

		pw.print(dijkstra(is, js, it, jt));
		pw.flush();
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////
	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static long lcm(long a, long b) {
		return (a * b) / gcd(a, b);
	}

	public static int log(int n, int base) {
		int ans = 0;
		while (n + 1 > base) {
			ans++;
			n /= base;
		}
		return ans;
	}

	static int pow(int b, long e) {
		int ans = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				ans = (int) ((ans * 1l * b));
			e >>= 1;
			{

			}
			b = (int) ((b * 1l * b));
		}
		return ans;
	}

	static int powmod(int b, long e, int mod) {
		int ans = 1;
		b %= mod;
		while (e > 0) {
			if ((e & 1) == 1)
				ans = (int) ((ans * 1l * b) % mod);
			e >>= 1;
			b = (int) ((b * 1l * b) % mod);
		}
		return ans;
	}

	static class pair implements Comparable<pair> {
		int x, y;

		pair(int s, int d) {
			x = s;
			y = d;
		}

		@Override
		public int compareTo(pair p) {
			return (x == p.x && y == p.y) ? 0 : 1;
		}

		@Override
		public String toString() {
			return x + " " + y;

		}
	}

	static int ceil(int a, int b) {
		int ans = a / b;
		return a % b == 0 ? ans : ans + 1;
	}

	static long ceil(long a, long b) {
		long ans = a / b;
		return a % b == 0 ? ans : ans + 1;
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public int[] intArr(int n) throws IOException {
			int a[] = new int[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = nextInt();
			}
			return a;
		}

		public long[] longArr(int n) throws IOException {
			long a[] = new long[n];
			for (int i = 0; i < a.length; i++) {
				a[i] = nextLong();
			}
			return a;
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}

	public static void shuffle(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			int tmp = a[i];
			a[i] = a[r];
			a[r] = tmp;
		}
	}

}