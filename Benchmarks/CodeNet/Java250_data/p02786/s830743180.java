import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    long h = Long.parseLong(sc.next());
    if (h == 1) {
      pw.println("1");
      return;
    }
    long ans = 0;
    long numberOfNodes = 1;
    long nextH = h;
    while (nextH != 1) {
      ans += numberOfNodes;
      numberOfNodes *= 2;
      nextH /= 2;
    }
    ans += numberOfNodes;
    pw.println(ans);
  }
}
