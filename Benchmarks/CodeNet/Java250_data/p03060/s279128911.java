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
    int resaleGain = 0;
    sc.nextLine();
    String[] values = sc.nextLine().split(" ");
    String[] costs = sc.nextLine().split(" ");
    for (int i = 0; i < n; i++) {
      int v = Integer.parseInt(values[i]);
      int c = Integer.parseInt(costs[i]);
      if (v - c > 0) {
        resaleGain += v - c;
      }
    }
    pw.println(resaleGain);
  }
}
