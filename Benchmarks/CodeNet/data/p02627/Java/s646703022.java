import java.io.InputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String s = sc.next();
    if (s.toUpperCase(Locale.ENGLISH).equals(s)) {
      pw.println("A");
    } else {
      pw.println("a");
    }
  }
}
