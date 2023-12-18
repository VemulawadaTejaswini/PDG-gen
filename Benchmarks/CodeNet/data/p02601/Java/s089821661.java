import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    while (k > 0 && (a >= b || b >= c)) {
      if (a >= b) {
        b = b * 2;
        k--;
        continue;
      }
      if (b >= c) {
        c = c * 2;
        k--;
        continue;
      }
    }
    pw.println(
      (a < b && b < c) ? "Yes" : "No"
    );
  }
}
