

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] dp = new int[n + 1];
		Arrays.fill(dp, 0);
		System.out.println(fib(n, dp));
		scan.close();
	}

	public static int fib(int i, int[] dp) {
		if (dp[i] != 0) {
			return dp[i];
		}
		
		if (i == 0 || i == 1) {
			return dp[i] = 1;
		}else{
			return dp[i] = fib(i - 1, dp) + fib(i - 2, dp);
		}
		
	}
}