import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static PriorityQueue<Edge> pq=new PriorityQueue<>();
	static int n, m;
	static int[] par;
	
	static class Edge implements Comparable<Edge>{
		int u, v, cost;
		Edge(int u, int v, int cost){
			this.u=u;
			this.v=v;
			this.cost=cost;
		}
		public int compareTo(Edge e) {
			return this.cost-e.cost;
		}
	}
	
	static void init(int N) {//初期化
		for(int i=0; i<N; i++) {
			par[i]=i;
		}
	}
	
	static int root(int x) {//親を求める
		if(par[x]==x) {
			return x;
		}
		return par[x]=root(par[x]);
	}
	
	static boolean same(int x, int y) {//判定(同グループかどうか)
		return (root(x)==root(y));
	}
	
	static void unite(int x, int y) {//まとめる
		par[root(x)]=root(y);
	}
	
	static int kraskal() {
		init(n);
		int res=0;
		for(int i=0; i<m; i++) {
			Edge e=pq.poll();
			if(!same(e.u, e.v)) {
				unite(e.u, e.v);
				res+=e.cost;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				n=sc.nextInt();
				m=sc.nextInt();
				if(n+m==0) break;
				par=new int[m];
				for(int i=0; i<m; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					int w=sc.nextInt();
					pq.add(new Edge(a, b, w));
				}
				System.out.println(kraskal());
			}

		}
	}
}
