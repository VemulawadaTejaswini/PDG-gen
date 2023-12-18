import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 20;
	public static final double INF = Double.MAX_VALUE;
	
	
	public static boolean can_all(final int n, int cur, int bit, double time, double[][] adj){
		if(bit == (1 << n) - 1){
			return true;
		}
		
		for(int next = 0; next < n; next++){
			if((bit & (1 << next)) != 0){
				continue;
			}
			
			final double g_time = adj[next][n];
			final double next_time = time + adj[cur][next];
			
			if(g_time <= next_time){
				return false;
			}else if(can_all(n, next, bit | (1 << next), next_time, adj)){
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[][] points = new long[MAX + 2][2];
		double[][] adj = new double[MAX + 2][MAX + 2];
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			final long h_x = sc.nextInt();
			final long h_y = sc.nextInt();
			final long g_x = sc.nextInt();
			final long g_y = sc.nextInt();
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 2; j++){
					points[i + 1][j] = sc.nextInt();
				}
			}
			points[0][0] = h_x;
			points[0][1] = h_y;
			points[n + 1][0] = g_x;
			points[n + 1][1] = g_y;
			
			final int size = n + 1;
			
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
			//System.out.println(min);
			
			System.out.println(can_all(size, 0, 1, 0, adj) ? "YES" : "NO");
		}
	}

}