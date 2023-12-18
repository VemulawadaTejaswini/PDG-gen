import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			
			if(n == 0 && k == 0){
				break;
			}
			
			int[][] adj = new int[n][n];
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					adj[i][j] = Integer.MAX_VALUE / 4;
				}
			}
			
			for(int i = 0; i < k; i++){
				final int op = sc.nextInt();
				if(op == 0){
					final int a = sc.nextInt() - 1;
					final int b = sc.nextInt() - 1;
					
					System.out.println(adj[a][b] == Integer.MAX_VALUE / 4 ? -1 : adj[a][b]);
				}else{
					final int c = sc.nextInt() - 1;
					final int d = sc.nextInt() - 1;
					final int e = sc.nextInt();
					
					int old = adj[c][d];
					
					if(old <= e){
						continue;
					}
					adj[c][d] = e;
					adj[d][c] = e;
					
					final int min = Math.min(c, d);
					final int max = Math.max(c, d);
					
					for(int ii = 0; ii < n; ii++){
						for(int j = 0; j < n; j++){
							adj[ii][j] = Math.min(adj[ii][j], adj[ii][min] + adj[min][j]);
						}
					}
					
					for(int ii = 0; ii < n; ii++){
						for(int j = 0; j < n; j++){
							adj[ii][j] = Math.min(adj[ii][j], adj[ii][max] + adj[max][j]);
						}
					}
				}
			}
			
		}
	}

}