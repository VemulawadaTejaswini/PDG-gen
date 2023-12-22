import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;



import java.io.BufferedReader;

public class Main{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int max = 0;
		int mi = 0;
		int second = 0;
		
		for (int i = 0; i < n; i++) {
			int cur = sc.nextInt();
			
			if (cur > max) {
				max = cur;
				mi = i;
			}
			else {
				if (cur > second) {
					second = cur;
					
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (i == mi) {
				out.println(second);
			}
			else {
				out.println(max);
			}
		}
		
		
		
		out.flush();
	}


}
	
// class st{
//	 
//	int N;
//	long[] val;
//	long[] tree;
//	long[] lazy;
//	
//	st(long[] v){
//		val = v;
//		tree = new long[2*(N = v.length-1)];
//		Arrays.fill(tree, (long) 1e18);
//		lazy = new long[2*N];
//		build(1, 1, N);
//	}
//	
//	void build(int i,int lt,int rt) {
//		if (lt == rt) {
//			tree[i] = val[lt]; 
//		}
//		
//		else {
//			int mid = (lt+rt)/2;
//			
//			build(2*i, lt,mid);
//			build(2*i+1, mid+1, rt);
//			
//			tree[i] = Math.min(tree[2*i] , tree[2*i+1]);  
//		}
//	}
//	
//	void update(int i,int v) {
//		i += N-1;
//		
//		tree[i] += v;
//		
//		while (i > 1) {
//			i>>=1;
//			
//			tree[i] = tree[2*i] + tree[2*i+1]; 
//		}
//	}
//	
//	void updateRange(int l,int r,int v) {
//		if (l > r) {
//			updateRange(1, l, N, 1, N, v);
//			updateRange(1, 1, r, 1, N, v);
//			return;
//		}
//		updateRange(1, l, r, 1, N, v);
//	}
//	void updateRange(int i, int l,int r,int tl,int tr,int v) {
//		
//		if (tr < l || tl > r) 
//			return;
//		
//		if (tl >= l && tr<= r) {
//			tree[i] += v;
//			lazy[i] += v; 
//			return;
//		}
//		
//		int mid = (tl+tr)/2;
//		
//		propagate(i, tl, mid, tr);
//		
//		updateRange(2*i, l, r, tl, mid, v);
//		updateRange(2*i+1, l, r, mid+1, tr, v);
//		
//		tree[i] = Math.min(tree[2*i], tree[2*i+1]); 
//		
//	}
//	
//	void propagate(int i,int tl,int mid, int tr) {
//		lazy[2*i] += lazy[i];
//		lazy[2*i+1] += lazy[i];
//		
//		tree[2*i] += lazy[i];
//		tree[2*i+1] += lazy[i];
//		
//		lazy[i] = 0; 
//	}
//	
//	
//	
//	
//	long query(int l,int r) {
//		if (l > r) {
//			return Math.min(query(l, N), query(1, r));
//		}
//		return query(1, l, r,1,N);
//		
//	}
//	long query(int i, int l,int r,int tl,int tr) {
//		
//		if (l > tr || r < tl) {
//			return (long) 1e18;
//		}
//		
//		if (r >= tr && l <= tl) {
//			return tree[i];
//		}
//		
//		int mid = (tl+tr)/2;
//		
//		propagate(i, tl, mid, tr);
//		
//		long q1 = query(2*i,l,r,tl,mid);
//		long q2 = query(2*i+1,l,r,mid+1,tr);
//		
//		return Math.min(q1,q2);
//		
//	}
//
//}
	
class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
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

	public boolean ready() throws IOException {
		return br.ready();
	}

	public void waitForInput() throws InterruptedException {
		Thread.sleep(3000);
	}


}

