import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		for (int i=0;i<N;i++) {
			h[i] = sc.nextInt();
		}

		int[] dp = new int[N];
		Arrays.fill(dp,2111111111);
		dp[0]=0;
		for (int i=0;i<N;i++) {
			for (int j=Math.max(0,i-K);j<i;j++) {
				dp[i]=Math.min(dp[i],dp[j]+Math.abs(h[i]-h[j]));
			}
		}
		System.out.println(dp[N-1]);
	}
}