import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  int date(int y, int m, int d) {
    --y;
    --m;
    return y * (19 * 5 + 20 * 5) + (y / 3) * 5 + m * 20 - ((y+1) % 3 != 0 ? m / 2 : 0) + d;
  }

  void run() {
    int n = ni();
    for (int i = 0; i < n; ++i) {
      int ay = 1000, am = 1, ad = 1;
      int y, m, d;
      y = ni();
      m = ni();
      d = ni();
      System.out.println(date(ay, am, ad) - date(y, m, d));
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}