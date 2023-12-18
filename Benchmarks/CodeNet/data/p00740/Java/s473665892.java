import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    while (true) {
      int n = ni();
      int p = ni();
      if ((n | p) == 0)
        break;

      int[] list = new int[n];
      int idx = 0;
      // 10^6
      while (true) {
        if (p == 1) {
          boolean f = false;
          // 50
          for (int i = 0; i < n; ++i) {
            if (i == idx)
              continue;
            f |= list[i] > 0;
          }
          if (!f) {
            break;
          }
        }

        if (p == 0) {
          p += list[idx];
          list[idx] = 0;
        } else {
          --p;
          ++list[idx];
        }

        ++idx;
        idx %= n;
      }

      System.out.println(idx);
    }
  }

  int ni() {
    return sc.nextInt();
  }

  Main() {
    sc = new Scanner(System.in);
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}