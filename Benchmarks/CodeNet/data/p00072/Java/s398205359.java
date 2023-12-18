import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N,M;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			N=Integer.parseInt(cin.nextLine());
			if(N==0)break;
			M=Integer.parseInt(cin.nextLine());
			Edge[] e=new Edge[M];
			for(int i=0;i<M;i++){
				String[] s = cin.nextLine().split(",");
				int a=Integer.parseInt(s[0]);
				int b=Integer.parseInt(s[1]);
				int c=Integer.parseInt(s[2]);
				e[i]=new Edge(a,b,c);
			}
			Arrays.sort(e);
			UnionFind union=new UnionFind(N);
			int ans=0;
			for(int i=0;i<e.length;i++){
				if(!union.find(e[i].a, e[i].b)){
					union.union(e[i].a, e[i].b);
					ans+=(e[i].cost/100) - 1;
				}
			}
			System.out.println(ans);
		}
	}
	static class Edge implements Comparable<Edge>{
		int a,b;
		int cost;
		Edge(int x,int y,int z){
			a=x;b=y;cost=z;
		}
		public int compareTo(Edge e){
			return cost-e.cost;
		}
	}
	static class UnionFind{
		final int[] tree;
		int num;
		public UnionFind(int n){
			this.tree=new int[n];
			Arrays.fill(tree,-1);
			num=n;
		}
		
		void union(int x,int y){
			x=root(x);
			y=root(y);
			if(x!=y){
				if(tree[x]<tree[y]){
					x ^= y;
					y ^= x;
					x ^= y;
				}
				tree[x]+=tree[y];
				tree[y]=x;
				num--;
			}
		}
		boolean find(int x,int y){
			return root(x)==root(y);
		}
		int root(int x){
			return tree[x]<0?x:(tree[x]=root(tree[x]));
		}
		int size(int x){
			return -tree[root(x)];
		}
		int getNum(){
			return num;
		}
	}
}