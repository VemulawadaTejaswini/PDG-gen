import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    for (int i = 0; i < N; i++) p[i] = sc.nextInt();
    sc.close();

    long[] s = new long[N + 1];
    for (int i = 0; i < N; i++) {
      long n = p[i] + 1;
      s[i + 1] = s[i] + n;
    }

    long max = 0;
    for (int i = K; i < N + 1; i++) {
      max = Math.max(max, s[i] - s[i - K]);
    }

    BigDecimal ans = BigDecimal.valueOf(max).divide(BigDecimal.valueOf(2));
    System.out.println(ans.toPlainString());
  }
}
