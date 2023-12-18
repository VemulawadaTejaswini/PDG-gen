import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	int[] X = new int[] { 1, 0 };
	int[] Y = new int[] { 0, 1 };

	private int DFS(int[][] board, Map<String, Integer> states, String currentState) {
		
		if (states.containsKey(currentState)) {
			return states.get(currentState);
		}
		
		
		int ans = 1;
		int n = board.length;
		int m = board[0].length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if (board[i][j] == 1) {
					
					for(int k=0; k<2; k++) {
						
						int nextI = i + X[k];
						int nextJ = j + Y[k];
						
						if (nextI >= 0 && nextI < n && nextJ >= 0 && nextJ < m && board[nextI][nextJ] == 0) {
							
							board[nextI][nextJ] = 1;
							board[i][j] = 0;
							
							StringBuilder nextState = new StringBuilder(currentState);
							nextState.setCharAt(nextI * n + nextJ, 'o');
							nextState.setCharAt(i*n + j, '.');
							ans = Math.max(ans, 1 + DFS(board, states, nextState.toString()));
							
							board[nextI][nextJ] = 0;
							board[i][j] = 1;
						}
					}
				}
			}
		}
		
		states.put(currentState, ans);
		return ans;
	}
	
	public void getNumberOfReachableCities(int input) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (input == 1) {
			br = new BufferedReader(new FileReader("test.txt"));
		}

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] board = new int[n][m];
		String state = "";
		
		for (int i = 0; i < n; i++) {
			
			String row = br.readLine();
			for (int j = 0; j < m; j++) {
				if (row.charAt(j) == '#') {
					board[i][j] = -1;
				} else if (row.charAt(j) != '.') {
					board[i][j] = 1;
				}
			}
			
			state += row.trim();
		}

		Map<String, Integer> states = new HashMap<String, Integer>();
		System.out.println(DFS(board, states, state) - 1);
	}

	public static void main(String[] args) throws Exception {

		Main a = new Main();

		a.getNumberOfReachableCities(0);

	}
}