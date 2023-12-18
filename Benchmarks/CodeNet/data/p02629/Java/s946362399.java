import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long n = Long.parseLong(sc.next());
    StringBuilder ans = new StringBuilder();
    while (n > 26) {
      char r = (char) (n % 26);
      n /= 26;
      if (r == 0) {
        r = 26;
        n--;
      }
      ans.append((char) (r + 'a' - 1));
    }
    char r = (char) n;
    ans.append((char) (r + 'a' - 1));
    pw.println(ans.reverse());
  }
}
