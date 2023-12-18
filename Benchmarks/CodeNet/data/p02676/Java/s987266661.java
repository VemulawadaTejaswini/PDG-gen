import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int k = Integer.parseInt(sc.next());
    String s = sc.next();
    if (s.length() <= k) {
      pw.println(s);
      return;
    }
    pw.println(s.substring(0, k) + "...");
  }
}
