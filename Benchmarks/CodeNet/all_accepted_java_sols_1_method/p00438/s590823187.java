import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a + b == 0) break;
			int[][] dp = new int[a][b];
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				dp[x - 1][y - 1] = -1;
			}
			dp[0][0] = 1;
			for(int i = 1; i < a; i++) {
				if(dp[i][0] != -1) {
					dp[i][0] = dp[i - 1][0];
				}else {
					dp[i][0] = 0;
				}
			}
			for(int j = 1; j < b; j++) {
				if(dp[0][j] != -1) {
					dp[0][j] = dp[0][j - 1];
				}else {
					dp[0][j] = 0;
				}
			}
			for(int i = 1; i < a; i++) {
				for(int j = 1; j < b; j++) {
					if(dp[i][j] != -1) {
						dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
					}else {
						dp[i][j] = 0;
					}
				}
			}
			
//			for(int i = 0; i < a; i++) {
//				for(int j = 0; j < b; j++) {
//					System.out.print(dp[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			System.out.println(dp[a - 1][b - 1]);
		}
	}

}

