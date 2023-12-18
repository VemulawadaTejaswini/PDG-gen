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
              int enc = apply(h[i], w[i], c, board.enc, x, y, ans);
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