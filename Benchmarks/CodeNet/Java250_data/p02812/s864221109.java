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
    String s = sc.next();
    int ans = 0;
    int index = -1;
    while ((index = s.indexOf("ABC", index + 1)) != -1) {
      ans++;
    }
    pw.println(ans);
  }
}
