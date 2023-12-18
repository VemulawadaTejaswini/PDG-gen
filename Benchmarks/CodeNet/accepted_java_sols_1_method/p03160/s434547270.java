import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] h = new int[N];

		for (int i = 0; i < N; i++) 
			h[i] = sc.nextInt();

		int[] dp = new int[N];
		dp[0] = 0;
		dp[1] = Math.abs(h[0]-h[1]);	

		for (int i = 2; i < N; i++) {
			int a = dp[i-1] + Math.abs(h[i]-h[i-1]);
			int b = dp[i-2] + Math.abs(h[i]-h[i-2]);
			dp[i] = Math.min(a, b);
		}
		System.out.println(dp[N-1]);
	}

}




