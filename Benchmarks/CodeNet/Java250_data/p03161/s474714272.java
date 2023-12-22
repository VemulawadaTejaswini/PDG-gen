import java.util.*;
import java.util.stream.IntStream;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = sc.nextInt();
    int[] dp = new int[N];
    int b = K;
    for (int i = 1; i < N; i++) {
      if (i <= K) b--;
      for (int j = 1; j <= K-b; j++) {
        if (j == 1) {
          dp[i] = dp[i-j] + Math.abs(a[i] - a[i-j]);
        } else {
          dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(a[i] - a[i-j]));
        }
      }
    }
    System.out.println(dp[N-1]);
  }
}