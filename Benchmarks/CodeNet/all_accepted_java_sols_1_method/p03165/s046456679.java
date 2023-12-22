import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    int n = s.length();
    int m = t.length();
    int[][] dp = new int[n+1][m+1];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        if(s.charAt(i)==t.charAt(j))dp[i+1][j+1]=dp[i][j]+1;
        else dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
      }
    }
    int x = n-1;
    int y = m-1;
    StringBuilder sb = new StringBuilder();
    while(x>=0&&y>=0){
      if(s.charAt(x)==t.charAt(y)){
        sb.append(s.substring(x,x+1));
        x--;
        y--;
      }
      else if(dp[x+1][y+1]==dp[x+1][y])y--;
      else if(dp[x+1][y+1]==dp[x][y+1])x--;
    }
    sb.reverse();
    System.out.println(sb.toString());
  }
}