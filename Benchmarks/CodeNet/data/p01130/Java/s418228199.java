import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int s = sc.nextInt() - 1;
			final int g1 = sc.nextInt() - 1;
			final int g2 = sc.nextInt() - 1;
			
			if(n == 0 && m == 0 && s == -1 && g1 == -1 && g2 == -1){
				break;
			}
			
			
			int[][] adj = new int[n][n];
			boolean[] visited = new boolean[n];
			int[] cost = new int[n];
			Arrays.fill(cost, Integer.MAX_VALUE);
			int[] prev = new int[n];
			Arrays.fill(prev, -1);
			
			for(int i = 0; i < m; i++){
				final int b1 = sc.nextInt() - 1;
				final int b2 = sc.nextInt() - 1;
				final int c = sc.nextInt();
				
				adj[b1][b2] = c;
			}
			
			cost[s] = 0;
			for(int i = 0; i < n; i++){
				int min = Integer.MAX_VALUE;
				int min_pos = 0;
				
				for(int j = 0; j < n; j++){
					if(!visited[j] && min > cost[j]){
						min_pos = j;
						min = cost[j];
					}
				}
				
				visited[min_pos] = true;
				
				for(int j = 0; j < n; j++){
					if(visited[j]){
						continue;
					}else if(adj[min_pos][j] == 0){
						continue;
					}
					
					if(cost[j] > adj[min_pos][j]){
						cost[j] = adj[min_pos][j];
						prev[j] = min_pos;
					}
				}
			}
			
			int sum = 0;
			{
				int pos = g1;
				while(prev[pos] != -1){
					sum += adj[prev[pos]][pos];
					adj[prev[pos]][pos] = 0;
					pos = prev[pos];
				}
				
				pos = g2;
				while(prev[pos] != -1){
					sum += adj[prev[pos]][pos];
					adj[prev[pos]][pos] = 0;
					pos = prev[pos];
				}
			}
			
			System.out.println(sum);
		}
	}
}