import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    String x=sc.nextLine();
    String y=sc.nextLine();
    int n=x.length();
    int m=y.length();
    int dp[][]=new int[n+1][m+1];
    for(int i=0;i<=n;i++)
    dp[i][0]=0;
    for(int i=0;i<=m;i++)
    dp[0][i]=0;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=m;j++){
        if(x.charAt(i-1)==y.charAt(j-1)){
          dp[i][j]=dp[i-1][j-1]+1;
        }
        else{
          dp[i][j]=Math.max(dp[i-1][j],
            dp[i][j-1]);
        }
      }
    }
    String rev="";
    int i=n,j=m;
    while(i!=0 && j!=0){
      if(x.charAt(i-1)==y.charAt(j-1)){
      rev+=x.charAt(i-1);
      i--;
      j--;
      }
      else{
        if(dp[i-1][j]>dp[i][j-1]){
          i--;
        }
        else{
          j--;
        }
      }
    }
    String ans="";
    for(i=rev.length()-1;i>=0;i--)
    ans+=rev.charAt(i);
    System.out.print(ans);
  }
}