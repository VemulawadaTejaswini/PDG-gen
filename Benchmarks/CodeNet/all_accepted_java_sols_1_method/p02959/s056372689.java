import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n + 1];
    long[] b = new long[n];
    for(int i = 0; i < (n + 1); i++) {
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < n; i++) {
      b[i] = sc.nextLong();
    }
    long ans = 0;
    for(int i = 0; i < n; i++) {
      if(a[i] >= b[i]) {
        ans += b[i];
      } else {
        ans += a[i];
        long r = b[i] - a[i];
        long t = Math.min(r, a[i + 1]);
        ans += t;
        a[i + 1] -= t;
      }
    }
    System.out.println(ans);
  }
}
