import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Walk implements Comparable<Walk>{
		int cost;
		int pos;
		int use = 2;
		
		public Walk(int cost, int pos, int use) {
			super();
			this.cost = cost;
			this.pos = pos;
			this.use = use;
		}

		@Override
		public int compareTo(Walk o) {
			// TODO Auto-generated method stub
			return this.cost - o.cost;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[][] adj = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					adj[i][j] = -1;
				}
			}
			
			for(int i = 0; i < m; i++){
				final int from = sc.nextInt() - 1;
				final int to = sc.nextInt() - 1;
				final int cost = sc.nextInt();
				
				adj[from][to] = cost;
			}
			
			
			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			queue.add(new Walk(0,0,2));
			
			boolean[][] visited = new boolean[n][3];
			
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				if(walk.pos == n - 1){
					System.out.println(walk.cost);
					break;
				}
				
				//System.out.println(walk.pos + " " + walk.use);
				
				if(visited[walk.pos][walk.use]){
					continue;
				}else{
					visited[walk.pos][walk.use] = true;
				}
				
				for(int to = 0; to < n; to++){
					if(adj[walk.pos][to] != -1){
						if(walk.use == 1){
							if(!visited[to][0]){
								queue.add(new Walk(walk.cost, to, 0));
							}					
						}else{
							if(walk.use == 2 && to != n - 1){
								if(!visited[to][1]){
									queue.add(new Walk(walk.cost, to, 1));
								}
							}
							
							if(!visited[to][walk.use]){
								queue.add(new Walk(walk.cost + adj[walk.pos][to], to, walk.use));
							}
						}
					}
				}
			}
			
		}
	}
}