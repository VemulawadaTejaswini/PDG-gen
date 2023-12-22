

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s=br.readLine();
		String t=br.readLine();
		
		System.out.println(solve(s,t));

	}

	private static int solve(String s, String t) {
		int[][] dp=new int[t.length()+1][s.length()+1];
		
		for(int i=1;i<=t.length();i++) {
			for(int j=0;j<=s.length();j++) {
				if(j==0) {
					dp[i][j]=dp[i-1][j]+1;
				}
				else {
					if(i>j) dp[i][j]=Integer.MAX_VALUE;
					else {
						dp[i][j]=t.charAt(i-1)==s.charAt(j-1)?dp[i-1][j-1]:dp[i-1][j-1]+1;
					}
				}
			}
		}
		int ans=Integer.MAX_VALUE;
		for(int val:dp[t.length()]) {
			ans=Math.min(ans, val);
		}
		return ans;
	}

}
