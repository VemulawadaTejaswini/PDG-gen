import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    for (int i = 0; i <= x; i++) {
      int a = i * 4;
      int b = (x - i) * 2;
      if (a + b == y) {
        pw.println("Yes");
        return;
      }
    }
    pw.println("No");
  }
}
