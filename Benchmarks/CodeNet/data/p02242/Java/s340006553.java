import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[][] adj = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				adj[i][j] = -1;
			}
		}
		
		for(int i = 0; i < n; i++){
			final int u = sc.nextInt();
			
			final int k = sc.nextInt();
			
			for(int j = 0; j < k; j++){
				final int v = sc.nextInt();
				final int c = sc.nextInt();
				
				adj[u][v] = c;
			}
		}
		
		boolean[] visited = new boolean[n];
		int[] costs = new int[n];
		Arrays.fill(costs, INF);

		costs[0] = 0;
		for(int tt = 0; tt < n; tt++){
			int min = INF;
			int min_pos = -1;
			
			for(int i = 0; i < n; i++){
				if(!visited[i] && costs[i] < min){
					min = costs[i];
					min_pos = i;
				}
			}
			
			visited[min_pos] = true;
			
			for(int next = 0; next < n; next++){
				if(adj[min_pos][next] < 0){ continue; }
				
				costs[next] = Math.min(costs[next], costs[min_pos] + adj[min_pos][next]);
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(i + " " + costs[i]);
		}
		
	}

	public static class Scanner {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			br.close();
		}
	}

}