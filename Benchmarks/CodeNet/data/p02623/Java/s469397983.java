import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int a[] = new int[n];
    long aSum[] = new long[n];
    int b[] = new int[m];
    long bSum[] = new long[m];
    int ans = 0;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
      if (i == 0) {
        aSum[i] = a[i];
      } else {
        aSum[i] = aSum[i - 1] + a[i];
      }
      if (aSum[i] <= k) {
        ans = Math.max(ans, i + 1);
      }
    }
    for (int i = 0; i < m; i++) {
      b[i] = Integer.parseInt(sc.next());
      if (i == 0) {
        bSum[i] = b[i];
      } else {
        bSum[i] = bSum[i - 1] + b[i];
      }
      if (bSum[i] <= k) {
        ans = Math.max(ans, i + 1);
      }
    }
    for (int i = n - 1; i >= 0; i--) {
      if (aSum[i] > k) {
        continue;
      }
      long remain = k - aSum[i];
      int maxIndex = Arrays.binarySearch(bSum, remain);
      if (maxIndex >= 0) {
        ans = Math.max(ans, i + 1 + maxIndex + 1);
      } else {
        ans = Math.max(ans, i + 1 - maxIndex - 1);
      }
    }
    pw.println(ans);
  }
}
