import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] h = new int[n];
		for(int i=0; i<n; i++){
			h[i] = sc.nextInt();
		}
		int[] dp = new int[n];
		Arrays.fill(dp, 1000000000);
		dp[0] = 0;
		for(int i=0; i<n; i++){
			for(int j=1; j<k+1; j++){
				if(i>=j){
					dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i] - h[i-j]));
				}
			}
		}
		System.out.println(dp[n-1]);
	}
}