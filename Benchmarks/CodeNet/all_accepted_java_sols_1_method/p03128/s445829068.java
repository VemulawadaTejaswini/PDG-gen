import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] a = new int[m];
    int[] b = {2, 5, 5, 4, 5, 6, 3, 7, 6};
    for(int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    long[] dp = new long[n + 1];
    for(int i = 1; i <= n; i++) {
      long t = (-1) * (long)Math.pow(10, 10);
      for(int j = 0; j < m; j++) {
        if(i >= b[a[j] - 1]) t = Math.max(t, 1 + dp[i - b[a[j] - 1]]); 
      }
      dp[i] = t;
    }
    String ans = "";
    int c = n;
    for(int i = 1; i <= (int)dp[n]; i++) {
      for(int j = m - 1; j >= 0; j--) {
        if((c >= b[a[j] - 1]) && (dp[c] == (1 + dp[c - b[a[j] - 1]]))) {
          ans += a[j];
          c -= b[a[j] - 1];
          break;
        }
      }
    }
    System.out.println(ans);
  }
}