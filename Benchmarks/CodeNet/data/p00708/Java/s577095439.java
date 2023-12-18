import java.util.Arrays; 
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static class Edge implements Comparable<Edge>{
		double cost;
		int start, end;
		
		public Edge(double cost, int start, int end) {
			super();
			this.cost = cost;
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Edge o) {
			if(this.cost < o.cost){
				return -1;
			}else if(this.cost > o.cost){
				return 1;
			}else{
				return 0;
			}
		}
	}
	
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			double[] x_pos = new double[n];
			double[] y_pos = new double[n];
			double[] z_pos = new double[n];
			double[] rad = new double[n];
			
			for(int i = 0; i < n; i++){
				x_pos[i] = sc.nextDouble();
				y_pos[i] = sc.nextDouble();
				z_pos[i] = sc.nextDouble();
				rad[i] = sc.nextDouble();
			}
			
			PriorityQueue<Edge> queue = new PriorityQueue<Edge>();
			
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					queue.add(new Edge(Math.max(0, Math.sqrt((x_pos[i] - x_pos[j])*(x_pos[i] - x_pos[j]) + 
													(y_pos[i] - y_pos[j])*(y_pos[i] - y_pos[j]) +
													(z_pos[i] - z_pos[j])*(z_pos[i] - z_pos[j])) - (rad[i] + rad[j])), i, j));
				}
			}
			
			UnionFind union = new UnionFind(n);
			
			int count = 0;
			double sum = 0;
			while(count < (n - 1)){
				Edge edge = queue.poll();
				
				if(union.same(edge.start, edge.end)){
					continue;
				}else{
					union.unite(edge.start, edge.end);
					sum += edge.cost;
				}
				
				count++;
			}
			
			System.out.printf("%.3f\n", sum);
		}
		
	}
}