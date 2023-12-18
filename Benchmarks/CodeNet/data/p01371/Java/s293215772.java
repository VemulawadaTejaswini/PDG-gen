import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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

	//dpで解く
	static int solve(int[][] matrix){
		int n = matrix.length;

		//dp[i][j]: 装備iを所持しているとして（ビットで管理）
		//最後にjを訪れたときの最小コスト
		int dp[][] = new int[(int)Math.pow(2, n)][n];

		//2のべき乗を保持するための配列
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

				for(int k = 0; k < n; k++){
					//k番目の武器を持っているか
					if(i - pow[k] >= 0 && (int)(i & pow[k]) != 0){
						//kの次にjに着いたとする
						int prevIndex = i - pow[k];

						//コストの更新。装備品を使わなかった場合も考慮する
						dp[i][j] = Math.min(dp[i][j], dp[prevIndex][k] + Math.min(matrix[j][0], prevCost));
					}
				}
			}
		}

		int result = Integer.MAX_VALUE;

		//最後に着いたステージによってコストが変わるため
		//その中で最小のものを探す
		for(int i = 0; i < n; i++){
			result = Math.min(result, dp[n - pow[i] - 1][i]);
		}

		return result;
	}
}

