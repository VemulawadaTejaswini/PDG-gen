import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    boolean[] dp = new boolean[K + 1];
    for (int i = 0; i < K + 1; i++)
      for (int j = 0; j < N; j++)
        if (0 <= i - a[j] && !dp[i - a[j]]) dp[i] = true;

    String ans = dp[K] ? "First" : "Second";
    System.out.println(ans);
  }
}