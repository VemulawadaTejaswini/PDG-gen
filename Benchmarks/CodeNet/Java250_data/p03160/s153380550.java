import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		for(int i = 0;i < n;i++)
			arr[i] = sc.nextInt();
		
		Arrays.fill(dp, 0);
		
		if(n == 1) {
			System.out.println(arr[0]);
			return;
		}
		
		dp[1] = Math.abs(arr[1] - arr[0]);
		
		for(int i = 2;i < n;i++) {
			int a = dp[i-1] + Math.abs(arr[i] - arr[i-1]);
			int b = dp[i-2] + Math.abs(arr[i] - arr[i-2]);
			dp[i] = Math.min(a, b);
		}
		
		System.out.println(dp[n-1]);
		return;
		
	}
}
