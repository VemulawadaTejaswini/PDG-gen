import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static int dfs(final int n, int cur, int prev, boolean[] visited, int[][] adj){
		
		int connect_count = 0;
		visited[cur] = true;
		for(int i = 0; i < n; i++){
			if(!visited[i] && adj[cur][i] != 0){
				connect_count++;
			}
		}
		
		if(connect_count == 0){
			visited[cur] = false;
			if(prev == -1){
				return 0;
			}else{
				return -adj[prev][cur];
			}
		}else if(connect_count == 1){
			int cost = 0;
			
			for(int i = 0; i < n; i++){
				if(!visited[i] && adj[cur][i] != 0){
					cost = dfs(n, i, cur, visited, adj) + adj[cur][i];
				}
			}
			
			visited[cur] = false;
			if(prev == -1){
				return cost;
			}else{
				return 2 * cost;
			}
		}else{
			int costs = 0;
			int max_cost = 0;
			int count = 0;
			
			for(int i = 0; i < n; i++){
				if(!visited[i] && adj[cur][i] != 0){
					int cur_cost = dfs(n, i, cur, visited, adj) + adj[cur][i];
					
					if(cur_cost != 0){
						count++;
					}
					
					max_cost = Math.max(max_cost, cur_cost);
					costs += cur_cost;
				}
			}
			
			//System.out.println((cur + 1) + " " + costs);
			
			visited[cur] = false;
			
			if(count == 0){
				return 0;
			}else if(count == 1){
				return costs;
			}else{
				return 2 * costs - max_cost;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int N = sc.nextInt();
			
			if(N == 0){
				break;
			}
			
			int[][] adj = new int[N][N];
			for(int i = 0; i < N - 1; i++){
				final int from = sc.nextInt() - 1;
				final int to = sc.nextInt() - 1;
				final int cost = sc.nextInt();
				
				adj[from][to] = adj[to][from] = cost;
			}
			
			System.out.println(dfs(N, 0, -1, new boolean[N], adj));
			
		}
	}

}