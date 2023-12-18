import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int ans = 0;
    int current = 0;
    for(char c : sc.next().toCharArray()) {
      if (c == 'R') {
        current++;
        ans = Math.max(ans, current);
      } else {
        current = 0;
      }
    }
    pw.println(ans);
  }
}
