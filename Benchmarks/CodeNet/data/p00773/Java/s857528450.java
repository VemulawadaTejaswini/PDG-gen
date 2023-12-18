import java.util.Arrays;
import java.util.Scanner;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int k3(int v, int r) {
    return v + (v * r) / 100;
  }

  int pop_count(int bs) {
    int cnt = 0;
    for (int i = 0; i < 16; ++i) {
      cnt += (bs >> i) & 1;
    }
    return cnt;
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    for (; ; ) {
      int x = ni();
      int y = ni();
      int s = ni();

      if ((x | y | s) == 0) {
        break;
      }

      int ans = 0;
      for (int l = 1; l < s; ++l) {
        for (int r = 1; r < s; ++r) {
          if (k3(l, x) + k3(r, x) == s) {
            ans = Math.max(ans, k3(l, y) + k3(r, y));
          }
        }
      }

      System.out.println(ans);
    }
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}