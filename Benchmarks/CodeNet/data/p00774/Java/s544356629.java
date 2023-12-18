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

  class Point {
    int x, y;
  }

  int[][] ofs = {
      {-1, 0},
      {0, 1},
      {1, 0},
      {0, -1}
  };
  int INF = 1 << 28;

  void run() {
    for (; ; ) {
      int h = ni();
      if (h == 0) {
        break;
      }
      int[][] field = new int[h][5];
      for (int i = 0; i < h; ++i) {
        for (int j = 0; j < 5; ++j) {
          field[i][j] = ni();
        }
      }

      int sum = 0;
      for (; ; ) {
        boolean flag = false;

        for (int i = h - 1; 0 <= i; --i) {
          for (int j = 0; j < 5; ++j) {
            int val = field[i][j];
            if (val == 0) {
              continue;
            }
            int cnt = 1;
            for (int k = j + 1; k < 5; ++k) {
              if (val == field[i][k]) {
                ++cnt;
              } else {
                break;
              }
            }
            if (cnt >= 3) {
              flag |= true;
              for (int k = j; k < 5; ++k) {
                if (val == field[i][k]) {
                  sum += field[i][k];
                  field[i][k] = 0;
                } else {
                  break;
                }
              }
            }
          }
        }
        if (!flag) {
          break;
        }

        for (int i = h - 1; 0 <= i; --i) {
          for (int j = 0; j < 5; ++j) {
            for (int k = i; k + 1 < h; ++k) {
              if (field[k + 1][j] != 0) {
                break;
              }
              field[k + 1][j] = field[k][j];
              field[k][j] = 0;
            }
          }
        }
      }

      System.out.println(sum);


    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}