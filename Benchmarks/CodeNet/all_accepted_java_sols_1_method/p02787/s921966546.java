
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		long[] dp = new long[h+1];
		
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for (int i=1;i<=h;i++) {
			dp[i]=Long.MAX_VALUE;
			for (int j=0;j<n;j++) {
				if(i-a[j]>=0) {
					dp[i]=Math.min(dp[i-a[j]]+b[j], dp[i]);
				} else {
					dp[i]=Math.min(b[j],dp[i]);
				}
			}
		}
		System.out.println(dp[h]);
	}
	
	
	
	
	
}


