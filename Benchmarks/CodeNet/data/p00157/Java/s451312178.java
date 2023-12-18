import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int depth(int cur, int[] visited, boolean visiting[], boolean[][] adj){
		if(visited[cur] != -1){
			return visited[cur];
		}
		
		if(visiting[cur]){
			return Integer.MIN_VALUE;
		}
		visiting[cur] = true;
		
		int deep = 0;
		for(int i = 0; i < adj[cur].length; i++){
			if(!adj[cur][i]){
				continue;
			}
			
			deep = Math.max(deep, depth(i, visited, visiting, adj));
		}
		
		visiting[cur] = false;
		
		//System.out.println(cur + " => " + (deep + 1));
		
		return visited[cur] = deep + 1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] h_1 = new int[n];
			int[] r_1 = new int[n];
			
			for(int i = 0; i < n; i++){
				h_1[i] = sc.nextInt();
				r_1[i] = sc.nextInt();
			}
			
			final int m = sc.nextInt();
			
			int[] h_2 = new int[m];
			int[] r_2 = new int[m];

			for(int i = 0; i < m; i++){
				h_2[i] = sc.nextInt();
				r_2[i] = sc.nextInt();
			}
			
			final int size = n + m;
			
			int[] h_c = new int[size];
			int[] r_c = new int[size];
			
			boolean[][] adj = new boolean[size][size];
			
			for(int i = 0; i < size; i++){
				h_c[i] = i < n ? h_1[i] : h_2[i - n];
				r_c[i] = i < n ? r_1[i] : r_2[i - n];
			}
			
			//outer
			for(int i = 0; i < size; i++){
				//inner
				for(int j = 0; j < size; j++){
					if(h_c[i] > h_c[j] && r_c[i] > r_c[j]){
						adj[i][j] = true;
					}
				}
			}
			
			int[] visited = new int[size];
			Arrays.fill(visited, -1);
			int max = Integer.MIN_VALUE;
			boolean[] visiting = new boolean[size];
			for(int i = 0; i < size; i++){
				if(visited[i] >= 0){
					continue;
				}
				
				max = Math.max(max, depth(i, visited, visiting, adj));
			}
			
			System.out.println(max);
		}
		
	}

}