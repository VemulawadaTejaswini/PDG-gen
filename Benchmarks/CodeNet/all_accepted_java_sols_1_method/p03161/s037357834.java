import java.io.*;
import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = in.nextInt();

    int dp[] = new int[n];
    dp[0] = 0;
    for(int i=1;i<n;i++){
      dp[i] = Integer.MAX_VALUE;
      int j = Math.max(0, i-k);
      for(;j<i;j++)
        dp[i] = Math.min(dp[i], Math.abs(a[i]-a[j]) + dp[j]);
    }
    System.out.println(dp[n-1]);
  }
}