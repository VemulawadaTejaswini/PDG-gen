import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main{
	static BufferedReader br;
	static PrintWriter pw;
	static int inf = (int) 1e9;
	static int[][] memo;
	static int[] a;

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		a = nxtarr();
		memo = new int[n][m + 1];
		for (int i = 0; i < memo.length; i++) {
			Arrays.fill(memo[i], -1);
		}
		ans = 0;
		System.out.println(dp(0, m));
		pw.flush();
	}

	static int ans;

	static int dp(int idx, int r) {
		if (idx == a.length && r == 0)
			return 1;
		if (r < 0 || idx == a.length)
			return 0;
		if (memo[idx][r] != -1) {
			return memo[idx][r];
		}
		int t = dp(idx + 1, r - a[idx]);
		int l = dp(idx + 1, r);
		return memo[idx][r] = (int) ((t + 2 *1l* l) % 998244353);
	}

	static int n, m;

	static boolean valid(int x, int y) {
		return x > -1 && x < n && y > -1 && y < m;
	}

	static boolean[][] vis;

	static ArrayList<Edge> edgeList;
	static ArrayList<edge1>[] adj;
	static int V;

	static int kruskal() // O(E log E)
	{
		int mst = 0;
		Collections.sort(edgeList);
		UnionFind uf = new UnionFind(n);
		for (Edge e : edgeList)
			if (uf.union(e.u, e.v))
				mst += e.w;
		return mst;
	}

	static class Edge implements Comparable<Edge> {
		int u, v, w;

		Edge(int a, int b, int c) {
			u = a;
			v = b;
			w = c;
		}

		public int compareTo(Edge e) {
			return w - e.w;
		}
	}

	static class edge1 implements Comparable<edge1> {
		int v, w;

		edge1(int b, int c) {
			v = b;
			w = c;
		}

		public int compareTo(edge1 e) {
			return w - e.w;
		}
	}

	static class UnionFind {
		int[] p, rank;

		UnionFind(int N) {
			p = new int[N];
			rank = new int[N];
			for (int i = 0; i < N; i++)
				p[i] = i;
		}

		int findSet(int x) {
			return p[x] == x ? x : (p[x] = findSet(p[x]));
		}

		boolean union(int x, int y) {
			x = findSet(x);
			y = findSet(y);
			if (x == y)
				return false;

			if (rank[x] > rank[y])
				p[y] = x;
			else {
				p[x] = y;
				if (rank[x] == rank[y])
					++rank[y];
			}
			return true;
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
			return x - o.x;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return x + " " + y;
		}

	}

	static class triple implements Comparable<triple> {
		int x;
		int y;
		int z;

		public triple(int a, int b, int c) {
			x = a;
			y = b;
			z = c;
		}

		public int compareTo(triple o) {
			return x - o.x;
		}

		public String toString() {
			// TODO Auto-generated method stub
			return x + " " + y + " " + z;
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

	static long pow(long a, long e, int mod) // O(log e)
	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				res *= a;
				res %= mod;
			}
			a *= a;
			e >>= 1;
		}
		return res;
	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
