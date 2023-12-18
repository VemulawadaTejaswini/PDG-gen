import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static class UnionFind{
		int[] par;
		UnionFind(int n){
			par=new int[n];
			for(int i=0;i<n;i++)par[i]=i;
		}
		public int find(int x){
			if(par[x]==x)return x;
			return par[x]=find(par[x]);
		}
		public Boolean same(int x,int y){
			return find(x)==find(y);
		}
		public void unite(int x,int y){
			if(find(x)==find(y))return;
			par[find(x)]=find(y);
		}
	}
	
	public static class Edge implements Comparable<Edge>{
		int start;
		int end;
		int cost;
		
		public Edge(int start, int end, int cost) {
			super();
			this.start = start;
			this.end = end;
			this.cost = cost;
		}

		@Override
		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int nodes, edges;
			
			nodes = sc.nextInt();
			edges = sc.nextInt();
			
			if(nodes == 0 && edges == 0){
				break;
			}
			
			Edge[] array = new Edge[edges];
			for(int i = 0; i < edges; i++){
				array[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			
			Arrays.sort(array);
			
			int count = 0;
			List<Edge> list = new LinkedList<Edge>();
			UnionFind uf = new UnionFind(nodes);
			for(Edge e : array){
				if(count >= nodes){
					break;
				}
				
				if(!uf.same(e.start, e.end)){
					list.add(e);
					count++;
					uf.unite(e.start, e.end);
				}
			}
			
			int sum = 0;
			for(Edge e : list){
				sum += e.cost;
			}
			
			System.out.println(sum);
		}

	}

}