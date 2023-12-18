import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), q = sc.nextInt();
		FenwickTree ft = new FenwickTree(n);
//		int size = 1;
//		while (size < n)
//			size *= 2;
//		int[] arr = new int[size + 1];
		for (int i = 1; i <= n; i++)
			ft.point_update(i, sc.nextInt());
//		SegmentTree st = new SegmentTree(arr);
		
		while (q-- > 0) {
			int l = sc.nextInt(), r = sc.nextInt();
//			out.println(st.query(l, r));
			out.println(ft.rsq(l, r));
		}
		out.close();
	}

	static class SegmentTree { // 1-based DS, OOP

		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array;
		HashSet<Integer> sTree[];

		SegmentTree(int[] in) {
			array = in;
			N = in.length - 1;
			sTree = new HashSet[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero
//			lazy = new int[N << 1];
			build(1, 1, N);
		}

		void build(int node, int b, int e) // O(n)
		{
			if (b == e) {
				sTree[node] = new HashSet<Integer>();
				sTree[node].add(array[b]);
			} else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				sTree[node] = new HashSet<Integer>();
				for (int x : sTree[node << 1])
					sTree[node].add(x);
				for (int x : sTree[node << 1 | 1])
					sTree[node].add(x);
			}
		}

		int query(int i, int j) {
			return query(1, 1, N, i, j).size();
		}

		HashSet<Integer> query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return new HashSet<Integer>();
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;

//			propagate(node, b, mid, e);

			HashSet<Integer> hs = new HashSet<Integer>(query(node << 1, b, mid, i, j));
			HashSet<Integer> q2 = query(node << 1 | 1, mid + 1, e, i, j);
			hs.addAll(q2);
			return hs;

		}
	}

	static class FenwickTree { // one-based DS

		int n;
		HashMap<Integer, Integer>[] ft;

		FenwickTree(int size) {
			n = size;
			ft = new HashMap[n + 1];
			for(int i=0;i<=n;i++)
				ft[i] =new HashMap<Integer, Integer>();
		}

		HashMap<Integer, Integer> rsq(int b) // O(log n)
		{

			HashMap<Integer, Integer> cum = new HashMap<Integer, Integer>(ft[b]);
			b -= b & -b;
			while (b > 0) {
				for(Map.Entry<Integer, Integer> en: ft[b].entrySet())
					cum.put(en.getKey(), cum.getOrDefault(en.getKey(), 0) + en.getValue());
				b -= b & -b;
			} // min?
			return cum;
		}

		int rsq(int a, int b) {
			
			HashMap<Integer, Integer> hm1 = rsq(b);
			HashMap<Integer, Integer> hm2 = rsq(a-1);
			int cnt = hm1.size();
			for(Map.Entry<Integer, Integer> en: hm2.entrySet())
				if(hm1.get(en.getKey()) == en.getValue())
					cnt--;
			return cnt;
		}

		void point_update(int k, int val) // O(log n), update = increment
		{
			while (k <= n) {
				ft[k].put(val, ft[k].getOrDefault(val, 0) + 1);
				k += k & -k;
			} // min?
		}

	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
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

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}
