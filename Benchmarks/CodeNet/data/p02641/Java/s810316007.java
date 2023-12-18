import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int x = Integer.parseInt(sc.next());
    int n = Integer.parseInt(sc.next());
    Set<Integer> forbidden = new HashSet<>();
    for (int i = 0; i < n; i++) {
      int p = Integer.parseInt(sc.next());
      forbidden.add(p);
    }
    int min = Integer.MAX_VALUE;
    int ans = -10;
    for (int i = -10; i <= 110; i++) {
      if (forbidden.contains(i)) {
        continue;
      }
      int abs = Math.abs(x - i);
      if (abs < min) {
        ans = i;
        min = abs;
      }
    }
    pw.println(ans);
  }
}
