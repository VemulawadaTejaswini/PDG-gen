import java.util.Scanner;

public class Main {
	static int N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int top = 100010;
		int[] dp = new int[top]; //余裕をもって10プラス
		dp[0] = 0;
		
		for (int i = 1; i < top; i++) {
			int wkN = 1;
			dp[i] = Integer.MAX_VALUE;
			while (wkN <= i) {
				dp[i] = Math.min(dp[i], dp[i - wkN]+1);
				wkN *= 6;
			}
			wkN = 1;
			while (wkN <= i) {
				dp[i] = Math.min(dp[i], dp[i - wkN]+1);
				wkN *= 9;
			}
		}
		System.out.println(dp[N]);
		
	}
}