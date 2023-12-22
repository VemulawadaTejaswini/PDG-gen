import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt(), k = kb.nextInt();
		int[] h = new int[n];
		for(int i=0; i < n; i++) {
			h[i] = kb.nextInt();
		}
		int[] dp = new int[n];
	//	Arrays.fill(dp, -1);
		boolean[] visited = new boolean[n];

		dp[0] = 0;
		visited[0] = true;
		for(int i = 1; i < n; i++) {
			for(int j = 1; j <= k && j <= i; j++) {
				int ksteps = dp[i-j] + Math.abs(h[i-j]-h[i]);
				if(!visited[i]) {
					dp[i] = ksteps;
					visited[i] = true;
				}
				else
					dp[i] = Math.min(dp[i], ksteps);
			}
		}
		System.out.println(dp[n-1]);
	}
}
