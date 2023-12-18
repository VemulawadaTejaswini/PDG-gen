
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] c = new int[m];
		int[] dp = new int[n+1];
		Arrays.fill(dp, 50000);
		for(int i=0;i<m;i++){
			c[i] = sc.nextInt();
		}

		for(int i=0;i<m;i++){
			if(n<c[i]){
				continue;
			}
			dp[c[i]] = 1;
			for(int j=0;j<n;j++){
				if(j+c[i]>n){
					break;
				}
				if(dp[j]!=0){
					dp[c[i]+j] = Math.min(dp[c[i]+j], dp[j]+1);
				}
			}
		}

		System.out.println(dp[n]);

	}
}


