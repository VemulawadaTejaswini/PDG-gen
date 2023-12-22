import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		while(true){
			count++;
			
			int w = sc.nextInt();
			if(w==0) break;
			int n = sc.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i=0;i<n;i++){
				String[] s = sc.next().split(",");
				a[i] = Integer.valueOf(s[0]);
				b[i] = Integer.valueOf(s[1]);
			}
			
			int[][] dp = new int[n+1][w+1];
			int[][] wgt = new int[n+1][w+1];
			
			for(int i=n-1;i>=0;i--){
				for(int j=0;j<=w;j++){
					if(j>=b[i] && dp[i+1][j]<dp[i+1][j-b[i]]+a[i]){
						dp[i][j] = dp[i+1][j-b[i]] + a[i];
						wgt[i][j] = wgt[i+1][j-b[i]] + b[i];
					}else{
						dp[i][j] = dp[i+1][j];
						wgt[i][j] = wgt[i+1][j];
					}
				}
			}
			
			System.out.println("Case " + count + ":");
			System.out.println(dp[0][w]);
			System.out.println(wgt[0][w]);
		}	
	}	
}