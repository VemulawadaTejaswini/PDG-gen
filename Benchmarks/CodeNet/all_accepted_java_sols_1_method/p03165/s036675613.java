import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int[][] dp=new int[s.length()+1][t.length()+1];
		for(int i=1; i<=s.length(); i++){
			for(int j=1; j<=t.length(); j++){
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
				}else{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		int n=s.length();
		int m=t.length();
		String ans="";
		while(n>0 && m>0){
			if(s.charAt(n-1)==t.charAt(m-1)){
				n--;
				m--;
				ans=s.charAt(n)+ans;
			}else if(dp[n][m]==dp[n-1][m]){
				n--;
			}else{
				m--;
			}
		}
		System.out.println(ans);
	}
}
