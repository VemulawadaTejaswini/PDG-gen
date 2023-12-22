import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		int[] dp = new int[N];
		for(int i = 0;i < N;i++){
			h[i] = sc.nextInt();
		}
		dp[0] = 0;
		dp[1] = (int)Math.abs(h[1] - h[0]);
		for(int i = 2;i < N;i++){
			dp[i] = dp[i - 1] + (int)Math.abs(h[i - 1] - h[i]);
			for(int j = 1;j < K + 1;j++){
				if(i - j < 0){
					break;
				}
				dp[i] = Math.min(dp[i - j] + (int)Math.abs(h[i - j] - h[i]),dp[i]);
			}
		}
		System.out.println(dp[N-1]);
	}
}