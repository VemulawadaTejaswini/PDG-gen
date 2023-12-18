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
    int ans = 0;
    for (int a = 1; a <= n; a++) {
      for (int b = 1; b <= n; b++) {
        int m = a * b;
        if (n - m >= 1) {
          ans++;
        } else {
          break;
        }
      }
    }
    pw.println(ans);
  }
}
