import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
      if (a[i] == 0) {
        System.out.println(0);
        return;
      }
    }

    Arrays.sort(a);

    long ans = 1;

    for (int i = n-1; i >= 0; i--) {
      if (a[i] > 1000000000000000000L || ans > 1000000000000000000L) {
        System.out.println(-1);
        return;
      } else {
        ans *= a[i];
        if (ans > 1000000000000000000L) {
          System.out.println(-1);
          return;
        }
      }
    }

    System.out.println(ans);

  }

}
