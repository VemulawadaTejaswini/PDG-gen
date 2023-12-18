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
    for (int i = 0; i < n; i++) {
      int a = Integer.parseInt(sc.next());
      if ((i + 1) % 2 == 1 && a % 2 == 1) {
        ans++;
      }
    }
    pw.println(ans);
  }
}
