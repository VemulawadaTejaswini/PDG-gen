
import java.util.Scanner;


public class Main {

  public static void main(String [] args) {

    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int[] dp = new int[n + 1];

    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i ++) {
      int min = dp[i - 1] + 1;

      for (int j = 6; j <= i; j *= 6) {
        if (dp[i - j] + 1 < min)
          min = dp[i - j] + 1;
      }

      for (int j = 9; j <= i; j *= 9) {
        if (dp[i - j] + 1 < min)
          min = dp[i - j] + 1;
      }

      dp[i] = min;
    }

    System.out.println(dp[n]);

  }

}