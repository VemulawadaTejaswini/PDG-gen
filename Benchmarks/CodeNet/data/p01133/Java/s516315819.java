import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 20 + 2;
	public static final double INF = Double.MAX_VALUE;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] dp = new double[1 << (MAX - 1)][(MAX - 1)];
		long[][] points = new long[MAX][2];
		double[][] adj = new double[MAX ][MAX];
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			final int h_x = sc.nextInt();
			final int h_y = sc.nextInt();
			final int g_x = sc.nextInt();
			final int g_y = sc.nextInt();
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 1; j++){
					points[i+1][j] = sc.nextInt();
				}
			}
			points[0][0] = h_x;
			points[0][1] = h_y;
			points[n + 1][0] = g_x;
			points[n + 1][1] = g_y;
			
			final int size = n + 1;
			final int limit = 1 << size;
			
			for(int i = 0; i <= size; i++){
				for(int j = i + 1; j <= size; j++){
					long sum = 0;
					for(int k = 0; k < 2; k++){
						sum += (points[i][k] - points[j][k]) * (points[i][k] - points[j][k]);
					}
					
					adj[i][j] = adj[j][i] = Math.sqrt(sum);
					//System.out.println(adj[i][j]);
				}
			}
			
			for(int S = 0; S < limit; S++){
				for(int i = 0; i < size; i++){
					dp[S][i] = INF;
				}
			}
			dp[1][0] = 0;
			
			for(int S = 0; S < limit; S++){
				for(int i = 0; i < size; i++){
					if((S & (1 << i)) == 0){
						continue;
					}else if(dp[S][i] == INF){
						continue;
					}
					
					for(int j = 0; j < size; j++){
						if((S & (1 << j)) != 0){
							continue;
						}
						
						final double cost = dp[S][i] + adj[i][j];
						
						if(adj[size][j] > cost){
							dp[S | (1 << j)][j] = Math.min(dp[S | (1 << j)][j], cost);
						}
					}
				}
			}
			
			double min = INF;
			for(int i = 0; i < size; i++){
				//System.out.print(dp[limit - 1][i] + " ");
				min = Math.min(min, dp[limit - 1][i]);
			}
			
			//System.out.println(min);
			
			System.out.println(min == INF ? "NO" : "YES");
		}
	}

}