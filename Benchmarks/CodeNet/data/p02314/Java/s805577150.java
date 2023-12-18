import java.util.Scanner;
public class CoinChangingProblem {
    public int count (int n, int[] coins) {
	int m = coins.length;
	int[] dp = new int[n+1];
	for (int i = 1; i <= n; i++) {
	    dp[i] = 50000;
	}

	for (int i = 0; i < m; i++) {
	    for (int j = coins[i]; j <= n; j++) {
		dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
	    }
	}
	return dp[n];
    }
}

class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	String[] input;
	input = scan.nextLine().split(" ");
	int n = Integer.parseInt(input[0]);
	int m = Integer.parseInt(input[1]);
	int[] coins = new int[m];
	input = scan.nextLine().split(" ");
	for (int i = 0; i < m; i++) {
	    coins[i] = Integer.parseInt(input[i]);
	}
	CoinChangingProblem problem = new CoinChangingProblem();
	System.out.println(problem.count(n, coins));
    }
}