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

  class Disk {
    int x;
    int y;
    int c;
    int r;

    boolean isIn(Disk disk) {
      return Math.pow(this.r + disk.r, 2) > Math.pow(this.x - disk.x, 2) + Math.pow(this.y - disk.y, 2);
    }
  }

  void run() {
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }
      Disk[] list = new Disk[n];
      for (int i = 0; i < n; ++i) {
        Disk d = new Disk();
        d.x = ni();
        d.y = ni();
        d.r = ni();
        d.c = ni();
        list[i] = d;
      }

      int[] dp = new int[1 << n];
      boolean[] done = new boolean[1 << n];
      done[0] = true;
      for (int i = 0; i < 1 << n; ++i) {
        if (!done[i]) {
          continue;
        }
        for (int j = 0; j < n; ++j) {
          if (((i >> j) & 1) == 1) {
            continue;
          }
          boolean flag = true;
          for (int a = 0; a < j; ++a) {
            if (((i >> a) & 1) == 1) {
              continue;
            }
            flag &= !list[j].isIn(list[a]);
          }
          if (!flag) {
            continue;
          }
          for (int k = j + 1; k < n; ++k) {
            if (((i >> k) & 1) == 1) {
              continue;
            }
            boolean glag = true;
            for (int a = 0; a < k; ++a) {
              if (((i >> a) & 1) == 1) {
                continue;
              }
              glag &= !list[k].isIn(list[a]);
            }
            if (!glag) {
              continue;
            }
            if (list[j].c != list[k].c) {
              continue;
            }

//            debug(j, k);

            dp[i | (1 << j) | (1 << k)] = Math.max(dp[i] + 1, dp[i | (1 << j) | (1 << k)]);
            done[i | (1 << j) | (1 << k)] |= true;
          }
        }
      }
      int max = 0;
      for (int i = 0; i < 1 << n; ++i) {
        max = Math.max(max, dp[i]);
      }

      System.out.println(max * 2);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}