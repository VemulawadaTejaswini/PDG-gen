import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int mod = 998244353;
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Pair[] moves = new Pair[k];
		for(int i = 0; i < k; i++)
			moves[i] = new Pair(sc.nextInt(), sc.nextInt());
		Arrays.sort(moves);
		
		int N = 1;
		while(N < n)
			N <<= 1;
		
		SegmentTree tree = new SegmentTree(new int[N + 1]);
		tree.update_point(n, 1);
		for(int i = n - 1; i > 0; i--) {
			int cnt = 0;
			for(int j = 0; j < k; j++) {
				if(i + moves[j].x <= n)
					cnt = (int)((1l * cnt + tree.query(i + moves[j].x, Math.min(n, i + moves[j].y))) % mod);
			}
			tree.update_point(i, cnt);
		}
		
		pw.println(tree.query(1, 1));
		pw.flush();
	}
	
	public static class Pair implements Comparable<Pair> {
		int x, y;
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int compareTo(Pair p) {
			return this.x - p.x;
		}
	}
	
	public static class SegmentTree {
		
		int N;
		int mod = 998244353;
		int[] in, sTree;
		
		public SegmentTree(int[] array) {
			in = array;
			N = array.length - 1;
			sTree = new int[N<<1];
			build(1, 1, N);
		}
		
		public void build(int node, int b, int e) {
			if(b == e) {
				sTree[node] = in[b];
				return;
			}
			
			int left = node<<1, right = node<<1|1;
			int mid = (b + e)>>1;
			
			build(left, b, mid);
			build(right, mid + 1, e);
			
			sTree[node] = (int)((1l * sTree[left] + sTree[right]) % mod);
		}
		
		public int query(int l, int r) {
			return query(1, 1, N, l, r);
		}
		
		public int query(int node, int b, int e, int l, int r) {
			if(r < b || l > e)
				return 0;
			if(b >= l && e <= r)
				return sTree[node];
			
			int left = node<<1, right = node<<1|1;
			int mid = (b + e)>>1;
						
			return (int)((1l * query(left, b, mid, l, r) + query(right, mid + 1, e, l, r)) % mod);
		}
		
		public void update_point(int n, int v) {
			n += N - 1;
			sTree[n] = v;
			while(n > 1) {
				n /= 2;
				sTree[n] = (int)((1l * sTree[n<<1] + sTree[n<<1|1]) % mod);
			}
		}
	}

	public static class Scanner {
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

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			int[] array = new int[n];
			for (int i = 0; i < n; i++)
				array[i] = nextInt();
			return array;
		}

		public Integer[] nextIntegerArray(int n) throws IOException {
			Integer[] array = new Integer[n];
			for (int i = 0; i < n; i++)
				array[i] = new Integer(nextInt());
			return array;
		}

		public long[] nextLongArray(int n) throws IOException {
			long[] array = new long[n];
			for (int i = 0; i < n; i++)
				array[i] = nextLong();
			return array;
		}

		public double[] nextDoubleArray(int n) throws IOException {
			double[] array = new double[n];
			for (int i = 0; i < n; i++)
				array[i] = nextDouble();
			return array;
		}

		public static int[] shuffle(int[] a) {
			int n = a.length;
			Random rand = new Random();
			for (int i = 0; i < n; i++) {
				int tmpIdx = rand.nextInt(n);
				int tmp = a[i];
				a[i] = a[tmpIdx];
				a[tmpIdx] = tmp;
			}
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
