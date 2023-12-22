import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i<n; i++)
      a[i] = sc.nextInt();
    int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for(int i = 1; i<n; i++) {
        for(int jump = 1; jump<=k; jump++) {
            if(i-jump>=0)
                dp[i] = Math.min(dp[i], dp[i-jump]+Math.abs(a[i-jump]-a[i]));
        }
    }
    System.out.println(dp[n-1]);
  }
}