import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int count = 1;
			int[] dp = new int[n];
			dp[0] = sc.nextInt();
			for(int i=1; i<n; i++) {
				int num = sc.nextInt();
				if(dp[i-1] > num) {
					dp[i] = num;
				}
				else if(dp[i-1] < num) {
					dp[i] = num;
					count++;
				}
				else {
					dp[i] = dp[i-1];
 				}
			}
			System.out.println(count);
		}
	}

}


