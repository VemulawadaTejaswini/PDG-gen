import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    while (input.hasNext()) {
      String s = input.next();
      String t = input.next();
      int[][] dp = new int[s.length() + 1][t.length() + 1];
      
      for (int i = 1; i < dp.length; ++i) {
        for (int j =  1; j < dp[i].length; ++j) {
          dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                              
          if(s.charAt(i - 1) == t.charAt(j - 1)) {
            dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
          }
        }
      }
      
      StringBuilder LCS = new StringBuilder();
      int i = dp.length - 1;
      int j =  dp[0].length - 1;
      while (i >= 1 || j >= 1) {
        if (i >= 1 && j >= 1 && dp[i][j] == dp[i - 1][j - 1] + 1 && s.charAt(i - 1) == t.charAt(j - 1)) {
          LCS.append(s.charAt(i - 1));
          --i;
          --j;
        } else if (i >= 1 && dp[i][j] == dp[i - 1][j]) {
          --i;
        } else {
          --j;
        }
      }
                              
      System.out.println(LCS.reverse());
    }
  }
}