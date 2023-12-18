import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNext()){
      char[] s1 = sc.next().toCharArray();
      char[] s2 = sc.next().toCharArray();
      int len1 = s1.length;
      int len2 = s2.length;

      int[][] dp = new int[len1 + 1][len2 + 1];

      int maxLen = 0;

      for(int idx1 = 0; idx1 < len1; idx1++){
        for(int idx2 = 0; idx2 < len2; idx2++){
          if(s1[idx1] == s2[idx2]){
            dp[idx1 + 1][idx2 + 1] = dp[idx1][idx2] + 1;
            maxLen = Math.max(maxLen, dp[idx1 + 1][idx2 + 1]);
          }
        }
      }

      System.out.println(maxLen);
    }
  }
}