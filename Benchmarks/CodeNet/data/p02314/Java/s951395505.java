import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[m];
		for(int i=0; i<m; i++){
			c[i] = sc.nextInt();
		}
		int[] dp = new int[n+1];
		for(int i=0; i<n+1; i++){
			dp[i] = i;
		}
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(j+1>=c[i]){
					dp[j+1] = Math.min(dp[j+1-c[i]]+1, dp[j+1]);
				}
			}
		}
		System.out.println(dp[n]);
	}
}
