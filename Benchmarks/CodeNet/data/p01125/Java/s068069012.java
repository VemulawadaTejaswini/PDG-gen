import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    int[][] ofs = new int[256][];
    ofs['N'] = new int[] { 0, 1 };
    ofs['E'] = new int[] { 1, 0 };
    ofs['S'] = new int[] { 0, -1 };
    ofs['W'] = new int[] { -1, 0 };
    while (true) {
      boolean[][] field = new boolean[21][21];
      int rx = 10, ry = 10;
      int N = ni();
      if (N == 0)
        break;

      for (int i = 0; i < N; ++i) {
        int x = ni();
        int y = ni();
        field[y][x] = true;
      }

      int M = ni();
      int cnt = field[ry][rx] ? 1 : 0;
      for (int i = 0; i < M; ++i) {
        char d = sc.next().charAt(0);
        int l = ni();
        for (int j = 0; j < l; ++j) {
          rx += ofs[d][0];
          ry += ofs[d][1];
          if (field[ry][rx])
            ++cnt;
        }
      }

      System.out.println(cnt == N ? "Yes" : "No");
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