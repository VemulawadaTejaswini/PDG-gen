
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[][] magic = new int[n][2];
		for(int i = 0; i < n; i++){
			magic[i][0] = sc.nextInt();//攻撃力
			magic[i][1] = sc.nextInt();//消費MP
		}
		long[] dp = new long[h + 10001];
		for(int i = 1; i < h + 1; i++){
			int i2 = i + 10000;
			dp[i2] = Long.MAX_VALUE;
			for(int k = 0; k < n; k++){
				dp[i2] = Math.min(dp[i2], dp[i2 - magic[k][0]] + magic[k][1]);
			}
		}
		System.out.println(dp[10000 + h]);
	}
}
