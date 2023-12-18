import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;
class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		UnionFind uft=new UnionFind(N);
		for(int i=0; i<Q; i++) {
			int com=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(com==0) {
				uft.union(x,y);
			}
			else {
				if(uft.same(x,y)) {
					pl(1);
				}
				else {
					pl(0);
				}
			}
		}
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	public static class UnionFind{
		int[] par; //

		public UnionFind(int n){
			par = new int[n];
			for(int i = 0; i < n; i++){ par[i] = -1; }
		}

		public int find(int x){
			if(par[x] < 0){
				return x;
			}else{
				return par[x] = find(par[x]);
			}
		}

		public boolean union(int x, int y){
			x = find(x);
			y = find(y);

			if(x != y){
				if(par[y] < par[x]) {  // 多い方が根になるようにスワップする.
					int tmp = x; x = y; y = tmp;
				}
				par[x] += par[y];
				par[y] = x;
				return true;
			}else{
				return false;
			}
		}

		public boolean same(int x, int y){
			return find(x) == find(y);
		}

		public int size(int x){
			return -par[find(x)];
		}
	}
}
