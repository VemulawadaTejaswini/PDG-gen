import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long k = sc.nextLong();

    long[] a = new long[n];
    long[] b = new long[m];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }

    for (int i = 0; i < m; i++) {
      b[i] = sc.nextLong();
    }

    int x = 0;
    int y = 0;

    long sum = 0;
    int count = 0;

    while (true) {
      if (x >= n || y >= m) {
        if (x >= n && y < m) {
          sum += b[y];
          y++;
        } else if (y >= m && x < n) {
          sum += a[x];
          x++;
        } else {
          break;
        }
      } else {
        if (a[x] < b[y]) {
          sum += a[x];
          x++;
        } else if (a[x] >= b[y]) {
          sum += b[y];
          y++;
        }
      }

      if (sum > k) {
        break;
      }

      count++;

    }

    System.out.println(count);

  }

}
