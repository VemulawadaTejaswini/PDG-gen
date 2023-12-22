import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());//int型
		int W = Integer.parseInt(sc.next());
		int[] v = new int[N];
		int[] w = new int[N];
		for (int i=0; i<N; i++){
			v[i] = Integer.parseInt(sc.next());
			w[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		int[][] dp = new int[N+1][W+1];
		for(int j=0; j<=W; j++){
			dp[0][j] = 0;
		}
		// dp[i+1][j]i番目までを利用したj以内でどこまで大きくできるか
		for(int i=0; i<N; i++){
			for(int j=0; j<=W; j++){
				if(j >= w[i]) {
					dp[i+1][j] = Math.max(dp[i][j-w[i]] + v[i], dp[i][j]);
				} else {
					dp[i+1][j] = dp[i][j];
				}
			}
		}
		System.out.println(dp[N][W]);
		
	}

}

