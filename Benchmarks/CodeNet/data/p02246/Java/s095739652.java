import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static final int SIZE = 4;
	
	public static int[][] answer = new int[][]{
		{ 1,  2,  3,  4},
		{ 5,  6,  7,  8},
		{ 9, 10, 11, 12},
		{13, 14, 15,  0}
	};
	
	public static int dfs(final int deep, final int limit, int[][] matrix){
		if(deep >= limit){
			return -1;
		}
		
		boolean same = true;
		LOOP:
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				if(answer[i][j] != matrix[i][j]){
					same = false;
					break LOOP;
				}
			}
		}
		
		if(same){
			return 0;
		}
		
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				
				if(matrix[i][j] == 0){
					
					for(int dx = -1; dx <= 1; dx++){
						for(int dy = -1; dy <= 1; dy++){
							if(dx == 0 && dy == 0){ continue; }
							if(dx != 0 && dy != 0){ continue; }
							
							final int nx = j + dx;
							final int ny = i + dy;
							
							if(0 <= nx && nx < SIZE && 0 <= ny && ny < SIZE){
								int tmp = matrix[i][j];
								matrix[i][j] = matrix[ny][nx];
								matrix[ny][nx] = tmp;
								
								int ret = dfs(deep + 1, limit, matrix);
								if(ret >= 0){
									return ret + 1;
								}
								
								tmp = matrix[i][j];
								matrix[i][j] = matrix[ny][nx];
								matrix[ny][nx] = tmp;
							}
							
						}
					}
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix = new int[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i <= 45; i++){
			int ret = dfs(0, i, matrix);
			
			if(ret >= 0){
				System.out.println(ret);
				break;
			}
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