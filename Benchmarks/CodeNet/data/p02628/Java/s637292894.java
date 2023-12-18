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
    int k = Integer.parseInt(sc.next());
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    int ans = 0;
    for (int i = 0; i < k; i++) {
      ans += a[i];
    }
    pw.println(ans);
  }
}
