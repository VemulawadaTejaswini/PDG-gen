import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int a[] = new int[m];
    long sum = 0;
    for (int i = 0; i < m; i++) {
      a[i] = Integer.parseInt(sc.next());
      sum += a[i];
    }
    pw.println(
      Math.max(n - sum, -1)
    );
  }
}
