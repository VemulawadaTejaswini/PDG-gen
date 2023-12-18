import java.io.*;
import java.util.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int n, m, k;
	static long mod = 998244353;
	static Boolean[][] memo;
	static String s;
	static ArrayList<Integer>[] ad;
	static long inf = Long.MAX_VALUE;
	static int[] color;
	static ArrayList<Integer> o;
	static char[][] g;
	static boolean[] vis, vis1;
	static long[] f;
	static long[] a, dest;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		long ans = 0;
		int N = 1;
		int n = sc.nextInt();
		if(n==1) {
			System.out.println(1);
			return;
		}
		while (N < n)
			N <<= 1;
		ad=new ArrayList[n+1];
		for(int i=0;i<=n;i++)
			ad[i]=new ArrayList<>();
		for(int i=0;i<n-1;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			ad[Math.max(a, b)].add(Math.min(a, b));
		}
		SegmentTree st = new SegmentTree(new long[N+1]);
		for(int i=1;i<=n;i++) {
			st.update_range(1, i, 1);
		//	System.err.println(Arrays.toString(st.sTree)+" "+1+" "+i);
			for(int v:ad[i])
				st.update_range(1, v, -1);
	//		System.err.println(Arrays.toString(st.sTree)+" "+2+" "+i);
		//	System.out.println(st.query(1, n));
			
			ans+=st.query(1, i);
		}
		System.out.println(ans);
		out.flush();
	}

	public static class SegmentTree { // 1-based DS, OOP

		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		long[] array, sTree, lazy;

		SegmentTree(long[] in) {
			array = in;
			N = in.length - 1;
			sTree = new long[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new long[N << 1];
			build(1, 1, N);
		}

		void build(int node, int b, int e) // O(n)
		{
			if (b == e)
				sTree[node] = array[b];
			else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
			}
		}

		void update_point(int index, int val) // O(log n)
		{
			index += N - 1;
			sTree[index] += val;
			while (index > 1) {
				index >>= 1;
				sTree[index] = sTree[index << 1] + sTree[index << 1 | 1];
			}
		}

		void update_range(int i, int j, int val) // O(log n)
		{
			update_range(1, 1, N, i, j, val);
		}

		void update_range(int node, int b, int e, int i, int j, int val) {
			if (i > e || j < b)
				return;
			if (b >= i && e <= j) {
				sTree[node] += (e - b + 1) * val;
				lazy[node] += val;
			} else {
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node << 1, b, mid, i, j, val);
				update_range(node << 1 | 1, mid + 1, e, i, j, val);
				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
			}

		}

		void propagate(int node, int b, int mid, int e) {
			lazy[node << 1] += lazy[node];
			lazy[node << 1 | 1] += lazy[node];
			sTree[node << 1] += (mid - b + 1) * lazy[node];
			sTree[node << 1 | 1] += (e - mid) * lazy[node];
			lazy[node] = 0;
		}

		long query(int i, int j) {
			return query(1, 1, N, i, j);
		}

		long query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return 0;
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			propagate(node, b, mid, e);
			long q1 = query(node << 1, b, mid, i, j);
			long q2 = query(node << 1 | 1, mid + 1, e, i, j);
			return q1 + q2;

		}

	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return x + " " + y;
		}

		@Override
		public int compareTo(pair o) {
			return 0;
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextArrInt(int n) throws IOException {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextArrLong(int n) throws IOException {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}