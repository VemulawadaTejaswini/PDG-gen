import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		int arr[] = new int[N+1];
		for(int i=1;i<=N;i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(minIncurredCost(N,K,arr));
	}
	
	public static int minIncurredCost(int N, int k, int[]arr) {
		int dp[] = new int[N+1];
		dp[1] = 0;
		for(int i = 2;i<=N;i++) {
			dp[i] =  Integer.MAX_VALUE;
			//faced issue
			for(int j=i-1;j>=1 && (i-j)<=k;j--) {
				dp[i] = Math.min(dp[i],Math.abs(arr[i]-arr[j])+dp[j]);
			}
		}
		return dp[N];
	}
	
	
}