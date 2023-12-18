import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] matrix = new int[n+1][n+1];
		
		for(int i = 0; i <= n; i++){
			Arrays.fill(matrix[i], 0);
		}
		for(int i = 1 ; i <= n; i++){
			String[] tmpArray = br.readLine().split(" ");
			
			for(int j = 2 ; j < tmpArray.length ; j++){
				int tmp = Integer.parseInt(tmpArray[j]);
				matrix[i][tmp] = 1;
			}
		}
		
		int[] visited = new int[n + 1];
		int[] finished = new int[n + 1];
		Arrays.fill(visited, 0);
		Arrays.fill(finished, 0);
		
		int time = 0;
		for(int i = 1; i <= n ; i++){
			if(visited[i] <= 0){
				time = dfs(matrix, visited, finished, i, time);
			}
		}
		
		for(int i = 1; i <= n ; i++){
			System.out.println(i + " " + visited[i] + " " + finished[i]);
		}
		/*
		for(int i = 1; i <= n; i++){
			for(int j = 1 ; j <= n ; j++){
				if(j == 1){
					System.out.print(matrix[i][j]);
				}
				else {
					System.out.print(" "+matrix[i][j]);
				}
			}
			System.out.println();
		}*/
		
		
	}
	
	static int dfs (int[][] matrix, int[] visited, int[] finished, int v, int time){
		//System.out.println("current vertex is "+v);
		time++;
		visited[v] = time;
		
		int tmpTime = time;
		for(int i = 1; i <= matrix[v].length - 1 ; i++){
			if(matrix[v][i] == 1 && visited[i] <= 0){
				tmpTime = dfs(matrix, visited, finished, i, tmpTime);
			}
		}
		
		finished[v] = tmpTime + 1;
		
		return tmpTime + 1;
	}

}