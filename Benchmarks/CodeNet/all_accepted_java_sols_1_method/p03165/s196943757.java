import java.util.*;
public class Main{ 

   public static void main(String args[]) {
	 
	   Scanner s=new Scanner(System.in);
	   String a=s.next();
	   String b=s.next();
	   
	   int dp[][]=new int[a.length()+1][b.length()+1];
	   dp[0][0]=1;
	   for(int i=1;i<=a.length();i++) {
		   for(int j=1;j<=b.length();j++) {
			   if(a.charAt(i-1)==b.charAt(j-1)) {
				   dp[i][j]=dp[i-1][j-1] + 1;
			   }
			   else {
				   dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
			   }
		   }
	   }
	   
	   int i=a.length();
	   int j=b.length();
	   String str="";
	   while(i>0 && j>0) {
		   if(a.charAt(i-1)==b.charAt(j-1)) {
			   str=a.charAt(i-1)+str;
			   i--;
			   j--;
		   }else {
			   if(dp[i-1][j]==dp[i][j]) {
				   i--;
			   }else {
				   j--;
			   }
		   }
	   }
	   System.out.println(str);
   	
   }
}