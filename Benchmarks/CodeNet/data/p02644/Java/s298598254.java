import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br;
	static PrintWriter pw;
	static int inf = (int) 1e9;
	static long mod = (long) 1e9 + 7;
	static long[] memo;
	static int neg_inf = Integer.MIN_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken()) - 1;
		int y1 = Integer.parseInt(st.nextToken()) - 1;
		int x2 = Integer.parseInt(st.nextToken()) - 1;
		int y2 = Integer.parseInt(st.nextToken()) - 1;
		a = new char[n][m];
		for (int i = 0; i < a.length; i++) {
			a[i] = br.readLine().toCharArray();
		}
		pw.println(dijkstra(new pair(x1, y1), new pair(x2, y2)));

		pw.flush();
	}

	static final int INF = (int) 1e9; // don't increase, avoid overflow
	static ArrayList<Edge>[] adjList;
	static int V, n, m, k;

	/*
	 * 1. Dijkstra's Algorithm for SSSP on weighted graphs
	 */
	static int dijkstra(pair S, pair T) // O(E log E)
	{
		int[][] dist = new int[n][m];
		for (int i = 0; i < n; i++) {
			Arrays.fill(dist[i], INF);
		}
		PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
		dist[S.x][S.y] = 0;
		pq.add(new Edge(S, 0, 0, -1)); // may add more in case of MSSP (Mult-Source)
		while (!pq.isEmpty()) {
			Edge cur = pq.remove();
			if (cur.node.equals(T)) // remove if all computations are needed
				return cur.cost;

			if (cur.cost > dist[cur.node.x][cur.node.y]) // lazy deletion
				continue;
			for (int i = 0; i < 4; i++) {
				int x = cur.node.x + dx[i];
				int y = cur.node.y + dy[i];
				if (valid(x, y)) {
					if (cur.w == i && cur.c < k) {
						if (cur.cost < dist[x][y])
							pq.add(new Edge(new pair(x, y), dist[x][y] = cur.cost, cur.c + 1, i));
					} else {
						if (cur.cost + 1 < dist[x][y])
							pq.add(new Edge(new pair(x, y), dist[x][y] = cur.cost + 1, 1, i));
					}
				}
			}

		}
		return -1;
	}

	static char[][] a;

	static int[] dx = new int[] { -1, 0, 1, 0 };
	static int[] dy = new int[] { 0, 1, 0, -1 };

	static boolean valid(int x, int y) {
		return x > -1 && x < n && y > -1 && y < m && a[x][y] != '@';
	}

	static class Edge implements Comparable<Edge> {
		pair node;
		int cost;
		int c;
		int w;

		Edge(pair a, int b, int c, int d) {
			node = a;
			cost = b;
			this.c = c;
			this.w = d;
		}

		public int compareTo(Edge e) {
			return cost - e.cost;
		}
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		public int compareTo(pair o) {
			return o.y - y;
		}

		public boolean equals(Object o) {
			// TODO Auto-generated method stub
			pair obj = (pair) o;
			return obj.x == x && obj.y == y;
		}

	}

	static class triple implements Comparable<triple> {
		int x;
		int y;
		int z;
		int w;

		public triple(int a, int b, int c) {
			x = a;
			y = b;
			z = c;
		}

		public triple(int a, int b, int c, int d) {
			x = a;
			y = b;
			z = c;
			w = d;
		}

		public int compareTo(triple o) {
			return x - o.x;
		}
	}

	static int[] nxtarr() throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] a = new int[st.countTokens()];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		return a;
	}

	static long pow(long a, long e) // O(log e)
	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res *= a;
			a *= a;
			e >>= 1;
		}
		return res;
	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
