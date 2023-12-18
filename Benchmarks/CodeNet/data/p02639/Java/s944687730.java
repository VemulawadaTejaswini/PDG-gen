import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    for (int i = 1; i <= 5; i++) {
      int x = Integer.parseInt(sc.next());
      if (x == 0) {
        pw.println(i);
        return;
      }
    }
  }
}
