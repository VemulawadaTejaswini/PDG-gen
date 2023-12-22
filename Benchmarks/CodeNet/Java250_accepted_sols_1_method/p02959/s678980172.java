import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n+1];
    long[] b = new long[n];

    for (int i = 0; i < n+1; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      b[i] = sc.nextInt();
    }

    long ans = 0;

    for (int i = 0; i < n; i++) {
      if (a[i] <= b[i]) {
        ans += a[i];
        b[i] -= a[i];
        a[i] = 0;
        if (a[i+1] <= b[i]) {
          ans += a[i+1];
          b[i] -= a[i+1];
          a[i+1] = 0;
        } else {
          ans += b[i];
          a[i+1] -= b[i];
        }
      } else {
        ans += b[i];
      }
    }

    System.out.println(ans);

  }

}
