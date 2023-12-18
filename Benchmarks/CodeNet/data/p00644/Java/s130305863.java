import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static class Walk implements Comparable<Walk>{
		int pos;
		int cost;
		Walk prev;
		
		public Walk(int pos, int cost, Walk prev) {
			super();
			this.pos = pos;
			this.cost = cost;
			this.prev = prev;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.cost - arg0.cost;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int p = sc.nextInt();
			
			if(n == 0 && m == 0 && p == 0){
				break;
			}
			
			int[][] adj = new int[n][n];
			int[] min_cost = new int[n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					adj[i][j] = -1;
				}
				min_cost[i] = -1;
			}
			
			for(int i = 0; i < m; i++){
				final int from = sc.nextInt();
				final int to = sc.nextInt();
				final int cost = sc.nextInt();
				
				adj[from][to] = adj[to][from] = cost;
			}
			
			PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
			queue.add(new Walk(0,0,null));
			
			int count = 0;
			LinkedList<Walk> shortest_paths = new LinkedList<Walk>();
			
			while(!queue.isEmpty()){
				Walk walk = queue.poll();
				
				if(min_cost[walk.pos] == -1){
					min_cost[walk.pos] = walk.cost;
				}else if(min_cost[walk.pos] < walk.cost){
					continue;
				}
				
				if(walk.pos == n-1){
					shortest_paths.add(walk);
					count++;	
					continue;
				}
				
				for(int i = 0; i < n; i++){
					if(adj[walk.pos][i] > 0 && (min_cost[i] == -1 || min_cost[i] >= walk.cost + adj[walk.pos][i])){
						queue.add(new Walk(i, walk.cost + adj[walk.pos][i], walk));
					}
				}
			}
			double inc = 1.0 / count;
			double[] array = new double[n];
			for(Walk w : shortest_paths){
				while(w != null){
					array[w.pos] += inc;
					w = w.prev;
				}
			}
			
			for(int i = 0; i < p; i++){
				System.out.println(array[sc.nextInt()]);
			}
			System.out.println();
		}
	}

}