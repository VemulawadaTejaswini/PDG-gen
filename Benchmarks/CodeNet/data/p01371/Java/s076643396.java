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
	static int limit;

	static void dfs(int matrix[][], int n, int level, int cost){
		if(minCost == limit){
			return;
		}

		if(level == n){
			minCost = Math.min(cost, minCost);
			System.out.println("COST : "+cost);
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
//				System.out.println("skip");
				continue;
			}

			visited[i] = true;
			dfs(matrix, n, level + 1, tmpCost + cost);
			visited[i] = false;
		}
	}

	//dpで解ける？
	static int solve(int[][] matrix){
		int n = matrix.length;

		int dp[][] = new int[(int)Math.pow(2, n)][n];

		int pow[] = new int[n];

		//まずは装備品無し
		for(int i = 0; i < n; i++){
			dp[0][i] = matrix[i][0];

			//ついでに武器用のべき乗計算
			pow[i] = (int)Math.pow(2, i);
		}

		for(int i = 1; i < dp.length; i++){
			for(int j = 0; j < n ; j++){
				dp[i][j] = Integer.MAX_VALUE;

				int prevCost = Integer.MAX_VALUE;
				for(int k = 0; k < n ;k++){
					//k番目の武器を持っているか
					if(i - pow[k] >= 0 && (int)(i & pow[k]) != 0){
						prevCost = Math.min(prevCost, matrix[j][k + 1]);
					}
				}

//				System.out.println("prev cost "+prevCost);

				for(int k = 0; k < n; k++){
					//k番目の武器を持っているか
					if(i - pow[k] >= 0 && (int)(i & pow[k]) != 0){
//						System.out.println("i j k "+i+" "+j+" "+k);
						//最後にk番目の武器を使ってjに着いたとする
						int prevIndex = i - pow[k];

						dp[i][j] = Math.min(dp[i][j], dp[prevIndex][k] + Math.min(matrix[j][0], prevCost));
					}
				}
			}
		}

//		show(dp);

		int result = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++){
			result = Math.min(result, dp[dp.length - pow[i] - 1][i]);
		}

		return result;
	}

	static void show(int[][] matrix){
		int h = matrix.length;
		int w = matrix[0].length;

		for(int i = 0; i < h; i++){
			System.out.print(i+" : ");
			for(int j = 0; j < w; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
//	static int solve(int[][] matrix){
//		int n = matrix.length;
//		minCost = Integer.MAX_VALUE;
//
//		visited = new boolean[n];
//		limit = 0;
//		for(int i = 0; i < n; i++){
//			int tmp = Integer.MAX_VALUE;
//			for(int j = 0; j < n + 1; j++){
//				tmp = Math.min(tmp, matrix[i][j]);
//			}
//
//			limit += tmp;
//		}
//
//		dfs(matrix, n, 0, 0);
//
//		return minCost;
//	}

//	static int solve(int[][] matrix){
//		int n = matrix.length;
//
//		Weapon weapons[] = new Weapon[n];
//
//		for(int i = 0; i < n; i++){
//			int tmpP = 0;
//			for(int j = 0; j < n; j++){
//				if(i == j){
//					continue;
//				}
//
//				tmpP += matrix[j][0] - matrix[j][i + 1];
//			}
//
//			weapons[i] = new Weapon(i, tmpP);
//
//			System.out.println("weapon "+ i + " performance "+ weapons[i].performance);
//		}

//
//
//
//		return 0;
//	}
}

class Weapon implements Comparable<Weapon> {
	int id;
	int performance;

	Weapon(int id, int performance){
		this.id = id;
		this.performance = performance;
	}

	@Override
	public int compareTo(Weapon w) {
		return w.performance - this.performance;
	}


}
