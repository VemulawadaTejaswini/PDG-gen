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
    String t = sc.next();
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < n; i++) {
      ans.append(s.charAt(i));
      ans.append(t.charAt(i));
    }
    pw.println(ans.toString());
  }
}
