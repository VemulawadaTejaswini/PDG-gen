import java.awt.geom.Point2D;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
  final static int INF = 1 << 28;
  final static long MOD = 1_000_000_007;
  final static double EPS = 1e-9;
  final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  class Board {
    int cost;
    int enc;
  }

  int get(int x, int y, int bits) {
    return (bits >> (y * 4 + x)) & 1;
  }

  int next(int x, int y, int c, int f) {
    f &= ~(1 << (y * 4 + x));
    f |= c << (y * 4 + x);
    return f;
  }

  int apply(int h, int w, int c, int f, int x, int y, int[][] ans) {
    for (int i = 0; i < h; ++i) {
      for (int j = 0; j < w; ++j) {
        int nx = x + j;
        int ny = y + i;
        if (nx < 0 || 4 <= nx || ny < 0 || 4 <= ny) {
          continue;
        }
        int v = ans[ny][nx] == c ? 1 : 0;
        f = next(nx, ny, v, f);
      }
    }
    return f;
  }

  int[][][][][] mask;

  void initMask(int n, int[] h, int[] w, int[][] ans) {
    mask = new int[n][4][7][7][2];
    for (int i = 0; i < n; ++i) {
      for (int c = 1; c <= 3; ++c) {
        for (int y = -3; y <= 3; ++y) {
          for (int x = -3; x <= 3; ++x) {
            int left = (1 << 16) - 1;
            int right = 0;
            for (int a = 0; a < h[i]; ++a) {
              for (int b = 0; b < w[i]; ++b) {
                int nx = b + x;
                int ny = a + y;
                if (nx < 0 || 4 <= nx || ny < 0 || 4 <= ny) {
                  continue;
                }
                left &= ~(1 << (ny * 4 + nx));
                int v = ans[ny][nx] == c ? 1 : 0;
                right |= v << (ny * 4 + nx);
              }
            }
            mask[i][c][x + 3][y + 3][0] = left;
            mask[i][c][x + 3][y + 3][1] = right;
          }
        }
      }
    }
  }

  int apply(int index, int c, int x, int y, int f) {
    f &= mask[index][c][x + 3][y + 3][0];
    f |= mask[index][c][x + 3][y + 3][1];
    return f;
  }

  void run() {
    int n = ni();
    int[] h = new int[n];
    int[] w = new int[n];
    for (int i = 0; i < n; ++i) {
      h[i] = ni();
      w[i] = ni();
    }
    int[] map = new int[256];
    map['R'] = 1;
    map['G'] = 2;
    map['B'] = 3;
    int[][] ans = new int[4][4];
    for (int i = 0; i < 4; ++i) {
      String str = sc.next();
      for (int j = 0; j < 4; ++j) {
        ans[i][j] = map[str.charAt(j)];
      }
    }
    initMask(n, h, w, ans);
    Board atom = new Board();
    atom.cost = 0;
    atom.enc = 0;
    Queue<Board> queue = new LinkedList<>();
    queue.add(atom);
    boolean[] done = new boolean[1 << 16];
    int min = INF;
    while (queue.size() > 0) {
      Board board = queue.poll();
      if (board.enc == (1 << 16) - 1) {
        min = Math.min(min, board.cost);
        break;
      }
      if (done[board.enc]) {
        continue;
      }
      done[board.enc] = true;
      for (int i = 0; i < n; ++i) {
        for (int c = 1; c <= 3; ++c) {
          for (int y = -3; y <= 3; ++y) {
            for (int x = -3; x <= 3; ++x) {
              int enc = apply(i, c, x, y, board.enc);
              if (enc == board.enc) {
                continue;
              }
              Board next = new Board();
              next.enc = enc;
              next.cost = board.cost + 1;
              queue.add(next);
            }
          }
        }
      }
    }
    System.out.println(min);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}