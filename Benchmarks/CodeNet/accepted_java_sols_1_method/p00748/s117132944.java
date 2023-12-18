import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static int MAX = 1000000;
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int[] pol = new int[200];
			for(int i=1; i<200; i++) {
				pol[i] = (i * (i + 1) * (i + 2)) / 6;
			}
			
			int[] dp = new int[MAX+1];
			int[] dp2 = new int[MAX+1];
			Arrays.fill(dp, Integer.MAX_VALUE);
			Arrays.fill(dp2, Integer.MAX_VALUE);
			dp[0] = 0;
			dp2[0] = 0;
			for(int i=1; i<MAX; i++) {
				for(int j=1; j<200; j++) {
					if(i - pol[j] >= 0) {
						dp[i] = Math.min(dp[i], dp[i-pol[j]]+1);
						if(pol[j] % 2 == 1) {
							dp2[i] = Math.min(dp2[i], dp2[i-pol[j]]+1);
						}
					}
				}
			}
			while(sc.hasNext()) {
				int n = sc.nextInt();
				if(n == 0) break;
				System.out.println(dp[n] + " " + dp2[n]);
			}
			
		}
	}
}
