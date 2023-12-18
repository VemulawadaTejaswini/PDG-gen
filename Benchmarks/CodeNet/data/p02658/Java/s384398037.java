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
    long ans = 1;
    long border = 1000000000000000000L;
    for (int i = 0; i < n; i++) {
      ans *= Long.parseLong(sc.next());
      if (ans > border || ans < 0) {
        pw.println(-1);
        return;
      }
    }
    pw.println(ans);
  }
}
