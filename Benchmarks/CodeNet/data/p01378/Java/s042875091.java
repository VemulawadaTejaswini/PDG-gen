import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
      String s = sc.next();
      String[] ss = s.split("iwi");

      if(ss.length != 2){
        System.out.println(3);
        continue;
      }

      String left = ss[0];
      int n = ss[0].length();
      String right = "";
      int m = ss[1].length();

      for(int i=0;i<m;i++){
        char ch = ss[1].charAt(i);
        char to = ' ';
        switch(ch){
        case '(':
          to = ')';
          break;
        case ')':
          to = '(';
          break;
        case '[':
          to = ']';
          break;
        case ']':
          to = '[';
          break;
        case '{':
          to = '}';
          break;
        case '}':
          to = '{';
          break;
        }

        right += to;
      }

      right = new StringBuilder(right).reverse().toString();

      int[][] dp = new int[n+2][m+2];
      for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
          if(left.charAt(i-1) == right.charAt(j-1)){
            dp[i][j] = Math.max(dp[i-1][j-1]+1,Math.max(dp[i-1][j],dp[i][j-1]));
          }
          else{
            dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
          }
        }
      }

      System.out.println(dp[n][m]*2+3);
    }
  }

}