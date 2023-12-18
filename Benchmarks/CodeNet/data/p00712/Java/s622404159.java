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

  int a, n;
  int p, q;

  int dfs(int last, int sa, int sn, double sm) {
    if (sn > n) {
      return 0;
    }

    int cnt = 0;
    if (Math.abs(sm - (double) p / q) < 1e-6) {
      ++cnt;
    }
    if ((sm - (double) p / q) > 1e-6) {
      return 0;
    }
    for (int i = last; i <= a / sa; ++i) {
      cnt += dfs(i, sa * i, sn + 1, sm + 1.0 / i);
    }
    return cnt;
  }

  void run() {
    for (; ; ) {
      p = ni();
      q = ni();
      a = ni();
      n = ni();

      if (p == 0) {
        break;
      }

      System.out.println(dfs(1, 1, 0, 0));
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}