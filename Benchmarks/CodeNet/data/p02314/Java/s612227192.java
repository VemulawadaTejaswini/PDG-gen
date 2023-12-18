import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] dp = new int[n+1];
			int[] c  = new int[m];
			for(int i=0; i<m; i++) {
				c[i] = sc.nextInt();
			}
			for(int i=0; i<n+1; i++) {
				dp[i] = Integer.MAX_VALUE;
			}
			dp[0] = 0;
			
			for(int i=0; i<=n; i++) {
				for(int j=0; j<m; j++) {
					if(c[j] <= i) {
						dp[i] = Math.min(dp[i], dp[i-c[j]]+1);
					}
				}
			}
			System.out.println(dp[n]);
		}
	}

}


