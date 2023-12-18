import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int edges = sc.nextInt(), nodes = sc.nextInt();
			
			if(edges == 0 && nodes == 0){
				break;
			}
			
			int[][] cost_adj = new int[nodes][nodes];
			int[][] time_adj = new int[nodes][nodes];
			
			for(int i = 0; i < nodes; i++){
				for(int j = 0; j < nodes; j++){
					cost_adj[i][j] = time_adj[i][j] = Integer.MAX_VALUE / 4;
				}
			}
			
			for(int i = 0; i < edges; i++){
				int start = sc.nextInt() - 1, end = sc.nextInt() - 1;
				
				cost_adj[start][end] = cost_adj[end][start] = sc.nextInt();
				time_adj[start][end] = time_adj[end][start] = sc.nextInt();
			}
			
			for(int k = 0; k < nodes; k++){
				for(int i = 0; i < nodes; i++){
					for(int j = 0; j < nodes; j++){
						cost_adj[i][j] = Math.min(cost_adj[i][j], cost_adj[i][k] + cost_adj[k][j]);
						time_adj[i][j] = Math.min(time_adj[i][j], time_adj[i][k] + time_adj[k][j]);
					}
				}
			}
			/*
			for(int i = 0; i < nodes; i++){
				for(int j = 0; j < nodes; j++){
					System.out.print(time_adj[i][j] + " ");
				}
				System.out.println();
			}
			*/
			
			final int nums = sc.nextInt();
			for(int i = 0; i < nums; i++){
				int start = sc.nextInt() - 1, end = sc.nextInt() - 1, r = sc.nextInt();
				
				System.out.println(r == 1 ? time_adj[start][end] : cost_adj[start][end]);
			}
			
		}

	}

}