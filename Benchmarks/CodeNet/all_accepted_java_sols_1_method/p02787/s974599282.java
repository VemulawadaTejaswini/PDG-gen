import java.math.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    sc.close();

    int ans = Integer.MAX_VALUE;
    int[] dp = new int[H];
    dp[0] = 1;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < H; j++) {
        if (dp[j] == 0) continue;
        int h = j + A[i];
        int c = dp[j] + B[i];
        if (h < H) {
          if (dp[h] == 0 || c < dp[h]) {
            dp[h] = c;
          }
        } else {
          ans = Math.min(ans, c);
        }
      }
    }
    System.out.println(ans - 1);
  }
}