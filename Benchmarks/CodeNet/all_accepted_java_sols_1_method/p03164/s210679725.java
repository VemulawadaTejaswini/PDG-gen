import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int w = sc.nextInt();
    long[] weights = new long[n];
    int[] values = new int[n];
    for(int i = 0; i<n; i++) {
        weights[i] = sc.nextInt();
        values[i] = sc.nextInt();
    }
    int valueSum = 0;
    for(int i: values)
        valueSum+=i;
    long[][] dp = new long[n+1][valueSum+1];
    for(long[] i: dp)
        Arrays.fill(i, Long.MAX_VALUE);
    for(int i = 0; i<=n; i++)
        dp[i][0] = 0;
    for(int i = 1; i<=n; i++) {
        for(int j = 1; j<=valueSum; j++) {
            dp[i][j] = dp[i-1][j];
            int currValue = values[i-1];
            if(j-currValue>=0 && dp[i-1][j-currValue]!=Long.MAX_VALUE)
                dp[i][j] = Math.min(dp[i][j], dp[i-1][j-currValue]+weights[i-1]);
        }
    }
    for(int i = valueSum; i>=0; i--) {
        if(dp[n][i]<=w) {
            System.out.println(i);
            return;
        }
    }
  }
}