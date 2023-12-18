import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    String t = sc.next();
    if (t.startsWith(s)) {
      pw.println("Yes");
    } else {
      pw.println("No");
    }
  }
}
