

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		int dp[][] = new int[n + 1][n + 1];

		for(int i = 0; i < m; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();

			dp[l][r]++;
		}

		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n; j++){
				dp[i][j] += dp[i][j - 1];

//				System.out.print(dp[i][j] +" ");
			}
//			System.out.println();
		}

		for(int i = 0; i < q; i++){
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();

			int sum = 0;
			for(int j = p1 ; j <= p2; j++){
				sum += dp[j][p2];
			}

			System.out.println(sum);
		}
	}

}
