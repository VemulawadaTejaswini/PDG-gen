import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;
 
public class Main {
	
	public static boolean[][] mul(final int n, final boolean[][] mat1, final boolean[][] mat2){
		boolean[][] ret = new boolean[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				for(int k = 0; k < n; k++){
					ret[i][j] |= mat1[i][k] && mat2[k][j];
				}
			}
		}
		
		return ret;
	}
	
	public static boolean[][] pow(final int n, final boolean[][] adj, final int a){
		if(a == 1){
			boolean[][] ret = new boolean[n][n];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					ret[i][j] = adj[i][j];
				}
			}
			return ret;
		}else if(a % 2 == 0){
			boolean[][] ret = pow(n, adj, a / 2);
			return mul(n, ret, ret);
		}else{
			return mul(n, adj, pow(n, adj, a - 1));
		}
	}
	
	public static int[][] warshallFroyd(final int n, int[][] adj){
		int[][] ret = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				ret[i][j] = adj[i][j];
			}
		}
		
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					ret[i][j] = Math.min(ret[i][j], Math.min(ret[i][k] + ret[k][j], INF));
				}
			}
		}
		
		return ret;
	}
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		int[] hops = new int[3];
		for(int i = 0; i < 3; i++){
			hops[i] = sc.nextInt();
		}
		
		boolean[][] adj = new boolean[n][n];
		for(int i = 0; i < m; i++){
			final int u = sc.nextInt() - 1;
			final int v = sc.nextInt() - 1;
			
			adj[u][v] = true;
		}
		
		boolean[][][] hop_adjs = new boolean[3][n][n];
		boolean[][] all_adj = new boolean[n][n];
		for(int i = 0; i < n; i++){ Arrays.fill(all_adj[i], true); }
		
		for(int index = 0; index < 3; index++){
			hop_adjs[index] = pow(n, adj, hops[index]);
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					all_adj[i][j] &= hop_adjs[index][i][j];
				}
			}
		}
		
		int[][] distances = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				distances[i][j] = (i == j ? 0 : all_adj[i][j] ? 1 : INF);
			}
		}
		
		distances = warshallFroyd(n, distances);
		int max_cost = distances[0][n - 1];
		for(int i = 0; i < n; i++){
			if(distances[i][n - 1] >= INF){ continue; }
			
			for(int j = 0; j < 3; j++){
				if(!hop_adjs[j][0][i]){ continue; }
				
				max_cost = Math.max(max_cost, distances[i][n - 1] + 1);
			}
		}
		
		System.out.println(max_cost >= INF ? "IMPOSSIBLE" : max_cost);
		
	}
}