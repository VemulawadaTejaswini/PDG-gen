import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[][] adj = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				adj[i][j] = sc.nextInt();
			}
		}
		
		boolean[] visited = new boolean[n];
		int[] costs = new int[n];
		Arrays.fill(costs, Integer.MAX_VALUE);
		costs[0] = 0;
		
		int cost = 0;
		for(int tt = 0; tt < n; tt++){
			int min = Integer.MAX_VALUE;
			int min_pos = -1;
			
			for(int i = 0; i < n; i++){
				if(!visited[i] && costs[i] < min){
					min = costs[i];
					min_pos = i;
				}
			}
			
			visited[min_pos] = true;
			cost += costs[min_pos];
			
			for(int next = 0; next < n; next++){
				costs[next] = Math.min(costs[next], adj[min_pos][next] < 0 ? Integer.MAX_VALUE : adj[min_pos][next]);
			}
		}
		
		System.out.println(cost);
		
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