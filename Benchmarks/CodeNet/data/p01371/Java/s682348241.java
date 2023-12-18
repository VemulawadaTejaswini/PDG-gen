import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();

			if(n == 0){
				break;
			}

			int matrix[][] = new int[n][n + 1];

			for(int i = 0; i < n; i++){
				for(int j = 0; j < n + 1; j++){
					matrix[i][j] = sc.nextInt();
				}
			}

			System.out.println(solve(matrix));
		}
	}

	static boolean visited[];

	static int minCost;

	static void dfs(int matrix[][], int n, int level, int cost){
		if(level == n){
			minCost = Math.min(cost, minCost);
			return;
		}

		for(int i = 0; i < n; i++){
			if(visited[i]){
				continue;
			}

			//i番目のステージに行くための最小コストを求める
			int tmpCost = matrix[i][0];
			for(int j = 1; j < n + 1; j++){
				if(visited[j - 1]){
					tmpCost = Math.min(tmpCost, matrix[i][j]);
				}
			}

			if(minCost <= tmpCost + cost){
				continue;
			}

			visited[i] = true;
			dfs(matrix, n, level + 1, tmpCost + cost);
			visited[i] = false;
		}
	}

	static int solve(int[][] matrix){
		int n = matrix.length;
		minCost = Integer.MAX_VALUE;

		visited = new boolean[n];

		dfs(matrix, n, 0, 0);

		return minCost;
	}
}

