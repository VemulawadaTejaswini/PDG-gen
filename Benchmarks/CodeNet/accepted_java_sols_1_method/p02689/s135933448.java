import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[] h = new long[n];
    int[] a = new int[m];
    int[] b = new int[m];

    for (int i = 0; i < n; i++) {
      h[i] = sc.nextLong();
    }

    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    int count = 0;

    int[][] data = new int[2][n];

    for (int i = 0; i < m; i++) {
      if (h[a[i]-1] < h[b[i]-1]) {
        data[1][b[i]-1]++;
        data[0][b[i]-1]++;
        data[0][a[i]-1]++;
      } else if (h[a[i]-1] > h[b[i]-1]) {
        data[1][a[i]-1]++;
        data[0][a[i]-1]++;
        data[0][b[i]-1]++;
      } else {
        data[0][a[i]-1]++;
        data[0][b[i]-1]++;
      }
    }

    int ans = 0;

    for (int i = 0; i < n; i++) {
      if (data[0][i] == data[1][i] || data[0][i] == 0) {
        ans++;
      }
    }

    System.out.println(ans);

  }

}
