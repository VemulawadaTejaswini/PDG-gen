import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[100010];
		for(int i = 0 ; i <= 100000 ; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		dp[0] = 0;
		for(int i = 1 ; i <= 100000 ; i++) {
			int pow6 = 1;
			while(pow6 <= i) {
				dp[i] = Math.min(dp[i], dp[i - pow6] + 1) ;
				pow6 *= 6;
			}
			int pow9 = 1;
			while(pow9 <= i) {
				dp[i] = Math.min(dp[i], dp[i - pow9] + 1);
				pow9 *= 9;
			}
		}
		System.out.println(dp[n]);
	}
}
