import java.io.*;
import java.util.*;

class MinCostFlow {
	public class WeightedCapEdge {
		private final int from, to;
		private long cap;
		private long cost;
		private final int rev;
		WeightedCapEdge(int from, int to, long cap, long cost, int rev) {
			this.from = from;
			this.to = to;
			this.cap = cap;
			this.cost = cost;
			this.rev = rev;
		}
		public int getFrom()  {return from;}
		public int getTo()    {return to;}
		public long getCap()  {return cap;}
		public long getCost() {return cost;}
		public long getFlow() {return g[to][rev].cap;}
	}
	
	private static final long INF = Long.MAX_VALUE;
	
	private final int n;
	private int m;
	private final java.util.ArrayList<WeightedCapEdge> edges;
	private final int[] count;
	private final WeightedCapEdge[][] g;
	private final long[] potential;
	
	private final long[] dist;
	private final WeightedCapEdge[] prev;
	
	public MinCostFlow(int n) {
		this.n = n;
		this.edges = new java.util.ArrayList<>();
		this.count = new int[n];
		this.g = new WeightedCapEdge[n][];
		this.potential = new long[n];
		this.dist = new long[n];
		this.prev = new WeightedCapEdge[n];
	}
	
	public int addEdge(int from, int to, long cap, long cost) {
		rangeCheck(from, 0, n);
		rangeCheck(to, 0, n);
		nonNegativeCheck(cap, "Capacity");
		nonNegativeCheck(cost, "Cost");
		WeightedCapEdge e = new WeightedCapEdge(from, to, cap, cost, count[to]);
		count[from]++; count[to]++;
		edges.add(e);
		return m++;
	}
	
	private void buildGraph() {
		for (int i = 0; i < n; i++) {
			g[i] = new WeightedCapEdge[count[i]];
		}
		int[] idx = new int[n];
		for (WeightedCapEdge e : edges) {
			g[e.to][idx[e.to]++] = new WeightedCapEdge(e.to, e.from, 0, -e.cost, idx[e.from]);
			g[e.from][idx[e.from]++] = e;
		}
	}
	
	private long addFlow;
	private long addCost;
	
	public long[] minCostMaxFlow(int s, int t) {
		return minCostFlow(s, t, INF);
	}
	
	public long[] minCostFlow(int s, int t, long flowLimit) {
		rangeCheck(s, 0, n);
		rangeCheck(t, 0, n);
		if (s == t) {
			throw new IllegalArgumentException(String.format("s = t = %d", s));
		}
		nonNegativeCheck(flowLimit, "Flow");
		buildGraph();
		long flow = 0;
		long cost = 0;
		while (true) {
			dijkstra(s, t, flowLimit - flow);
			if (addFlow == 0) break;
			flow += addFlow;
			cost += addFlow * addCost;
		}
		return new long[]{flow, cost};
	}
	
	public java.util.ArrayList<long[]> minCostSlope(int s, int t) {
		return minCostSlope(s, t, INF);
	}
	
	public java.util.ArrayList<long[]> minCostSlope(int s, int t, long flowLimit) {
		rangeCheck(s, 0, n);
		rangeCheck(t, 0, n);
		if (s == t) {
			throw new IllegalArgumentException(String.format("s = t = %d", s));
		}
		nonNegativeCheck(flowLimit, "Flow");
		buildGraph();
		java.util.ArrayList<long[]> slope = new java.util.ArrayList<>();
		long prevCost = -1;
		long flow = 0;
		long cost = 0;
		while (true) {
			slope.add(new long[]{flow, cost});
			dijkstra(s, t, flowLimit - flow);
			if (addFlow == 0) return slope;
			flow += addFlow;
			cost += addFlow * addCost;
			if (addCost == prevCost) {
				slope.remove(slope.size() - 1);
			}
			prevCost = addCost;
		}
	}
	
	private void dijkstra(int s, int t, long maxFlow) {
		final class State implements Comparable<State> {
			final int v;
			final long d;
			State(int v, long d) {this.v = v; this.d = d;}
			public int compareTo(State s) {return d == s.d ? v - s.v : d > s.d ? 1 : -1;}
		}
		java.util.Arrays.fill(dist, INF);
		dist[s] = 0;
		java.util.PriorityQueue<State> pq = new java.util.PriorityQueue<>();
		pq.add(new State(s, 0l));
		while (pq.size() > 0) {
			State st = pq.poll();
			int u = st.v;
			if (st.d != dist[u]) continue;
			for (WeightedCapEdge e : g[u]) {
				if (e.cap <= 0) continue;
				int v = e.to;
				long nextCost = dist[u] + e.cost + potential[u] - potential[v];
				if (nextCost < dist[v]) {
					dist[v] = nextCost;
					prev[v] = e;
					pq.add(new State(v, dist[v]));
				}
			}
		}
		if (dist[t] == INF) {
			addFlow = 0;
			addCost = INF;
			return;
		}
		for (int i = 0; i < n; i++) {
			potential[i] += dist[i];
		}
		addCost = 0;
		addFlow = maxFlow;
		for (int v = t; v != s;) {
			WeightedCapEdge e = prev[v];
			addCost += e.cost;
			addFlow = java.lang.Math.min(addFlow, e.cap);
			v = e.from;
		}
		for (int v = t; v != s;) {
			WeightedCapEdge e = prev[v];
			e.cap -= addFlow;
			g[v][e.rev].cap += addFlow;
			v = e.from;
		}
	}
	
	public void clearFlow() {
		java.util.Arrays.fill(potential, 0);
		for (WeightedCapEdge e : edges) {
			long flow = e.getFlow();
			e.cap += flow;
			g[e.to][e.rev].cap -= flow;
		}
	}
	
	public WeightedCapEdge getEdge(int i) {
		rangeCheck(i, 0, m);
		return edges.get(i);
	}
	
	public java.util.ArrayList<WeightedCapEdge> getEdges() {
		return edges;
	}
	
	private void rangeCheck(int i, int minInlusive, int maxExclusive) {
		if (i < 0 || i >= maxExclusive) {
			throw new IndexOutOfBoundsException(
					String.format("Index %d out of bounds for length %d", i, maxExclusive)
					);
		}
	}
	
	private void nonNegativeCheck(long cap, java.lang.String attribute) {
		if (cap < 0) {
			throw new IllegalArgumentException(
					String.format("%s %d is negative.", attribute, cap)
					);
		}
	}
}

public class Main {
	static long big = 100000000;
	static void solve() {
		int n = ni(), m = ni();
		var flow = new MinCostFlow(n*m + 2);
		int s = n*m, t = s + 1;
		var f = nm(n, m);
		long maxCost = 0;
		for(int i=0;i<n;i++) for(int j=0;j<m;j++) {
			int v = i * m + j;
			if(f[i][j] == '#') {
				continue;
			}
			if(f[i][j] == 'o') {
				flow.addEdge(s, v, 1, 0);
				maxCost += big - (i + j);
			}
			
			//right
			if(j+1 < m && f[i][j+1] != '#') {
				flow.addEdge(v, i * m + (j+1), big, 0);
			}
			//bottom
			if(i+1 < n && f[i+1][j] != '#') {
				flow.addEdge(v, (i+1) * m + j, big, 0);
			}
			//t
			flow.addEdge(v, t, 1, big - (i + j));
		}
		long ans = maxCost - flow.minCostMaxFlow(s, t)[1];
		out.println(ans);
	}	
	
	//constants
	static final int inf = Integer.MAX_VALUE / 2;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final long mod = (long) 1e9 + 7;
	static final int[] dx = { -1, 0, 1, 0 }, dy = { 0, -1, 0, 1 }, dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final double eps = 1e-10;
	
	//libraries
	static long[] cum(int a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static long[] cum(long a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static void reverse(int ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(long ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(double ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(char ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static String getReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	static <T> void reverse(T[] ar) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			T t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char x, char arr[]) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char arr[], char x) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static int max(int x, int y) {
		return Math.max(x, y);
	}
	static int min(int x, int y) {
		return Math.min(x, y);
	}
	static int max(int x, int y, int z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static int min(int x, int y, int z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static long max(long x, long y) {
		return Math.max(x, y);
	}
	static long min(long x, long y) {
		return Math.min(x, y);
	}
	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static double max(double x, double y) {
		return Math.max(x, y);
	}
	static double min(double x, double y) {
		return Math.min(x, y);
	}
	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static void sort(int[] ar) {
		Arrays.sort(ar);
	}
	static void sort(long[] ar) {
		Arrays.sort(ar);
	}
	static void sort(double[] ar) {
		Arrays.sort(ar);
	}
	static void sort(char[] ar) {
		Arrays.sort(ar);
	}
	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(double[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(char[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}
	static void fill(long arr[], long x) {
		Arrays.fill(arr, x);
	}
	static void fill(boolean arr[], boolean x) {
		Arrays.fill(arr, x);
	}
	static void fill(double arr[], double x) {
		Arrays.fill(arr, x);
	}
	static void fill(int arr[][], int x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(long arr[][], long x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(double arr[][], double x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(boolean arr[][], boolean x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}
	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}
	//input
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}
	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}
	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}
	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	@SuppressWarnings("unused")
	private static long[] nla(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
	@SuppressWarnings("unused")
	private static int[][] na(int n, int m){
		int[][] res = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = ni();
			}
		}
		return res;
	}
	@SuppressWarnings("unused")
	private static long[][] nla(int n, int m){
		long[][] res = new long[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = nl();
			}
		}
		return res;
	}
	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}
