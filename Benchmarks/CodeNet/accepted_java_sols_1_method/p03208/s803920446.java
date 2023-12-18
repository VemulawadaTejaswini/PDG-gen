
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] p = new int[N];
      for (int i = 0; i < N; i++) {
        p[i] = sc.nextInt();
      }
      Arrays.sort(p);

      int ans = Integer.MAX_VALUE;
      for (int i = 0; i < N - K + 1; i++) {
        ans = Math.min(ans, p[i + K - 1] - p[i]);
      }

      System.out.println(ans);
    }
  }
}
