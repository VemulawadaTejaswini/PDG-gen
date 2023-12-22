import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int dpw[] = new int[n];
    int dp[] = new int[n];

    if (s.charAt(0) == 'W') {
      dpw[0] = 1;
    } else {
      dpw[0] = 0;
    }
    dp[0] = 0;
    for (int i = 1; i < n; i++) {
      if (s.charAt(i) == 'W') {
        dpw[i] = dpw[i - 1] + 1;
        dp[i] = dp[i - 1];
      } else {
        dpw[i] = dpw[i - 1];
        dp[i] = dp[i - 1] + 1;
      }
      if (dpw[i - 1] < dp[i]) {
        dp[i] = dpw[i - 1];
      }
    }
    System.out.println(dp[n - 1]);
  }
}