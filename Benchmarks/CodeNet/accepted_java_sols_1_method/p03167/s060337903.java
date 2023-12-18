import java.util.Scanner;

class Main{
	static int mod = 1000000000 + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int H = sc.nextInt(), W = sc.nextInt();
			int[][] dp = new int[H + 1][W + 1];
			for(int i = 0; i < H; i++) {
				String s = sc.next();
				for(int j = 0; j < W; j++) {
					if(s.charAt(j) == '#') dp[i][j] = -1;
				}
			}
			dp[0][0] = 1;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					if(dp[i][j] == -1) continue;
					if(dp[i + 1][j] != -1) {
						dp[i + 1][j] += dp[i][j];
						dp[i + 1][j] %= mod;
					}
					if(dp[i][j + 1] != -1) {
						dp[i][j + 1] += dp[i][j];
						dp[i][j + 1] %= mod;
					}
				}
			}
			System.out.println(dp[H - 1][W - 1] % mod);
		}
	}
}