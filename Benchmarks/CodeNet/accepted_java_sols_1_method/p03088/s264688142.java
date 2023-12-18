import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long dp[][][][] = new long[N + 1][4][4][4];
		
		dp[0][3][3][3] = 1;
		for(int i = 0; i < N; i++) {
			for(int a = 0; a < 4; a++) {
				for(int b = 0; b < 4; b++) {
					for(int c = 0; c < 4; c++) {
						if(dp[i][a][b][c] == 0) continue;
						for(int d = 0; d < 4; d++) {
							if(b == 0 && c == 2 && d == 1) continue;
							if(b == 0 && c == 1 && d == 2) continue;
							if(a == 0 && c == 2 && d == 1) continue;
							if(b == 2 && c == 0 && d == 1) continue;
							if(a == 0 && b == 2 && d == 1) continue;
							dp[i + 1][b][c][d] = (dp[i + 1][b][c][d] + dp[i][a][b][c]) % 1000000007;
						}
					}
				}
			}
		}
		
		long ans = 0;
		for(int a = 0; a < 4; a++) {
			for(int b = 0; b < 4; b++) {
				for(int c = 0; c < 4; c++) {
					ans = (ans + dp[N][a][b][c]) % 1000000007;
				}
			}
		}
		System.out.println(ans);
	}
}
