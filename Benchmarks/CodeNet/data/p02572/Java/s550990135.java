import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int mod = 1000000000 + 7;
    int n = Integer.parseInt(sc.next());
    int a[] = new int[n];
    long sums[] = new long[n];
    long sum = 0;
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    for (int i = n - 1; i >= 0; i--) {
      sum += a[i];
      sum %= mod;
      sums[i] = sum;
    }
    long ans = 0;
    for (int i = 0; i < n - 1; i++) {
      ans += sums[i + 1] * a[i];
      ans %= mod;
    }
    pw.println(ans);
  }
}
