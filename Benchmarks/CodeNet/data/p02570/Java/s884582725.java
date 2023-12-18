import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    double d = Integer.parseInt(sc.next());
    double t = Integer.parseInt(sc.next());
    int s = Integer.parseInt(sc.next());
    pw.println(d / s <= t ? "Yes" : "No");
  }
}
