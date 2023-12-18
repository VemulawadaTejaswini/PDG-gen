import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt(), q = sc.nextInt();
		int size = 1;
		while (size < n)
			size *= 2;
		int[] arr = new int[size+1];
		for(int i=1;i<=n;i++)
			arr[i] =sc.nextInt();
		SegmentTree st =new SegmentTree(arr);
		while(q-->0) {
			int l=sc.nextInt(), r=sc.nextInt();
			out.println(st.query(l, r));
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
			}
			else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				sTree[node] = new HashSet<Integer>(); 
				for(int x: sTree[node << 1])
					sTree[node].add(x);
				for(int x: sTree[node << 1 |1])
					sTree[node].add(x);
			}
		}

//		void update_point(int index, int val) // O(log n)
//		{
//			index += N - 1;
//			sTree[index] = val;
//			while (index > 1) {
//				index >>= 1;
//				sTree[index] = sTree[index << 1] + sTree[index << 1 | 1];
//			}
//		}

//		void update_range(int i, int j, int val) // O(log n)
//		{
//			update_range(1, 1, N, i, j, val);
//		}
//
//		void update_range(int node, int b, int e, int i, int j, int val) {
//			if (i > e || j < b)
//				return;
//			if (b >= i && e <= j) {
//				sTree[node] = (e - b + 1) * val;
//				lazy[node] = val;
//			} else {
//				int mid = b + e >> 1;
//				if (lazy[node] > -1)
//					propagate(node, b, mid, e);
//				update_range(node << 1, b, mid, i, j, val);
//				update_range(node << 1 | 1, mid + 1, e, i, j, val);
//				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
//			}
//
//		}
//
//		void propagate(int node, int b, int mid, int e) {
//			lazy[node << 1] = lazy[node];
//			lazy[node << 1 | 1] = lazy[node];
//			sTree[node << 1] = (mid - b + 1) * lazy[node];
//			sTree[node << 1 | 1] = (e - mid) * lazy[node];
//			lazy[node] = -1;
//		}

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
