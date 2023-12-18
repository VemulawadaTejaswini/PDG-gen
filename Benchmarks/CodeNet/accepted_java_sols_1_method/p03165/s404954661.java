//package compilers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.next();
	String t=in.next();
	 int dp[][]=new int[s.length()+1][t.length()+1];
	 for(int i=0;i<=s.length();i++) {
		 for(int j=0;j<=t.length();j++) {
			 if(i==0 || j==0)
				 dp[i][j]=0;
			 else if(s.charAt(i-1)==t.charAt(j-1))
				 dp[i][j]=dp[i-1][j-1]+1;
			 else 
				 dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			 
		 }
	 }
	 int i=s.length();
	 int j=t.length();
	 String ans="";
	 while(i>0 && j>0) {
		 if(s.charAt(i-1)==t.charAt(j-1)) {
			 ans+=s.charAt(i-1);
			 i--;
			 j--;
		 }
		 else if(dp[i-1][j]>dp[i][j-1])
			     i--;
		 else j--;
		 
	 }
	for(int k=ans.length()-1;k>=0;k--)
		System.out.print(ans.charAt(k));
}
}
