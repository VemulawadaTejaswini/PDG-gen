import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] h = new int[N];
		int[] dp = new int[N];
		dp[0] = 0;
		for(int i = 0;i < N;i++){
			h[i] = sc.nextInt();
		}
		dp[1] = Math.abs(h[1] - h[0]);
		for(int i = 1;i < N - 1;i++){
			int jump = Math.abs(h[i + 1] - h[i]);
			int highJump = Math.abs(h[i + 1] - h[i - 1]);
			dp[i + 1] = Math.min(jump + dp[i],highJump + dp[i - 1]);
		}
		System.out.println(dp[N-1]);
	}
}