import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    String n = sc.next();
    long sum = 0;
    for (int i = 0; i < n.length(); i++) {
      sum += Integer.parseInt(n.substring(i, i + 1));
    }
    pw.println(sum % 9 == 0 ? "Yes" : "No");
  }
}
