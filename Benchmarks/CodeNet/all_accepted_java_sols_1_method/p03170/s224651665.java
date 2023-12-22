import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int k = Integer.parseInt(scanner.next());
    int[] a = new int[n];
    boolean[] dp = new boolean[k + 1];
    int m;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(scanner.next());
    }
    dp[0] = false;
    for (int i = 1; i < k + 1; i++) {
      dp[i] = false;
      for (int j = 0; j < n; j++) {
        m = i - a[j];
        if (m >= 0 && !dp[m]) {
          dp[i] = true;
          break;
        }
      }
    }
    if (dp[k]) {
      System.out.println("First");
    } else {
      System.out.println("Second");
    }
  }
}
