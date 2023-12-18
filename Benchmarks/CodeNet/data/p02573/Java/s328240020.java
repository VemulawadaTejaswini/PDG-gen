import java.util.*;

public class Main {
	static class UnionFind {
		int[] param;
		int[] rank;
		int N;
		int xlen;
		
		public UnionFind(int n) {
			N=n;
			param = new int[N];
			rank = new int[N];
			for(int i=0; i<N; i++)
				param[i] = i;
		}
		
		public void init() {
			for(int i=0; i<N; i++)
				param[i] = i;
			Arrays.fill(rank, 0);
		}
		
		public UnionFind(int x, int y) {
			this(x*y);
			xlen=y;
		}
		
		public boolean same(int a, int b) {
			return getRoot(a)==getRoot(b);
		}
		
		public boolean same(int x1, int y1, int x2, int y2) {
			return same(x1*xlen+y1, x2*xlen+y2);
		}
		
		public int getRoot(int a) {
			if(param[a]==a) return a;
			else return (param[a] = getRoot(param[a]));
		}
		
		public void unite(int a, int b) {
			a = getRoot(a);
			b = getRoot(b);
			if(a==b)
				return;
			
			if(rank[a] < rank[b]) {
				param[a] = b;
			} else {
				param[b] = a;
				if(rank[a]==rank[b])
					rank[a]++;
			}
		}
		
		public void unite(int x1, int y1, int x2, int y2) {
			unite(x1*xlen+y1, x2*xlen+y2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		UnionFind uf = new UnionFind(N);
		for(int i=0; i<M; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			uf.unite(A, B);
		}

		int[] g = new int[N];
		for(int i=0; i<N; i++)
			g[i] = uf.getRoot(i);
		
		Arrays.sort(g);
		int max = 0;
		int size = 1;
		for(int i=0; i<N; i++) {
			if(i==N-1 || g[i]!=g[i+1]) {
				max = Math.max(max, size);
				size = 1;
			} else {
				size++;
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}
