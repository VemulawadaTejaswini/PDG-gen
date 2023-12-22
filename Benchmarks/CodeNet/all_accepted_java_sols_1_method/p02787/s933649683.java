import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt(), n = scan.nextInt();
		int[] dp = new int[h+1];
		for (int i = 0; i < dp.length; i++) dp[i] = 999999999;
		
		dp[0] = 0;
		while (n-- > 0) {
			int value = scan.nextInt();
			int cost = scan.nextInt();
			
			for (int i = 0; i <= h; i++) {
				int j = Math.min(h, i + value);
				dp[j] = Math.min(dp[j], dp[i] + cost);
			}
		}
		System.out.println(dp[h]);
	}

}