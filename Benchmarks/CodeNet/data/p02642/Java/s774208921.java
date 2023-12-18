import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(sc.next());
    }
    long ans = IntStream.range(0, n)
      .parallel()
      .filter(i -> meet(i, n, a))
      .count();
    pw.println(ans);
  }

  static boolean meet(int i, int n, int[] a) {
    int ai = a[i];
    for (int j = 0; j < n; j++) {
      if (i == j) {
        continue;
      }
      if (ai % a[j] == 0) {
        return false;
      }
    }
    return true;
  }
}
