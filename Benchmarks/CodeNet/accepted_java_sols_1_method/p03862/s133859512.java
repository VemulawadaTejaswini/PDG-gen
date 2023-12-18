import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long x = sc.nextLong();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextLong();
    }
    long ans = 0;
    if (x < a[0]) {
      ans += a[0] - x;
      a[0] = x;
    }
    for (int i = 0; i < N - 1; i++) {
      if (x < a[i] + a[i + 1]) {
        ans += a[i] + a[i + 1] - x;
        a[i + 1] = x - a[i];
      }
    }
    System.out.println(ans);
  }
}