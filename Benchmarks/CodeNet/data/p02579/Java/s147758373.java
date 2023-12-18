import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var hw = br.readLine().split(" ");
      final var h = Integer.parseInt(hw[0]);
      final var w = Integer.parseInt(hw[1]);
      final var c = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
      final var d = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

      final int[][] s = new int[h][w];
      for (int i = 0; i < h; i++) {
        final var line = br.readLine().toCharArray();
        for (int j = 0; j < line.length; j++) {
          s[i][j] = line[j] == '#' ? -2 : -1;
        }
      }

      Deque<int[]> deque = new ArrayDeque<>();
      deque.add(new int[] { c[0] - 1,  c[1] - 1});
      s[c[0] - 1][c[1] - 1] = 0;
      while (!deque.isEmpty()) {
        final var coord = deque.poll();
        int x, y;

        x = coord[0] + 1; y = coord[1];
        if (check(x, y, h, w) && s[x][y] >= -1) {
          if (s[x][y] == -1) {
            s[x][y] = s[coord[0]][coord[1]];
            deque.add(new int[] { x, y });
          } else {
            if (s[x][y] > s[coord[0]][coord[1]]) {
              s[x][y] = s[coord[0]][coord[1]];
              deque.add(new int[] { x, y });
            }
          }
        }

        x = coord[0] - 1; y = coord[1];
        if (check(x, y, h, w) && s[x][y] >= -1) {
          if (s[x][y] == -1) {
            s[x][y] = s[coord[0]][coord[1]];
            deque.add(new int[] { x, y });
          } else {
            if (s[x][y] > s[coord[0]][coord[1]]) {
              s[x][y] = s[coord[0]][coord[1]];
              deque.add(new int[] { x, y });
            }
          }
        }

        x = coord[0]; y = coord[1] + 1;
        if (check(x, y, h, w) && s[x][y] >= -1) {
          if (s[x][y] == -1) {
            s[x][y] = s[coord[0]][coord[1]];
            deque.add(new int[] { x, y });
          } else {
            if (s[x][y] > s[coord[0]][coord[1]]) {
              s[x][y] = s[coord[0]][coord[1]];
              deque.add(new int[] { x, y });
            }
          }
        }

        x = coord[0]; y = coord[1] - 1;
        if (check(x, y, h, w) && s[x][y] >= -1) {
          if (s[x][y] == -1) {
            s[x][y] = s[coord[0]][coord[1]];
            deque.add(new int[] { x, y });
          } else {
            if (s[x][y] > s[coord[0]][coord[1]]) {
              s[x][y] = s[coord[0]][coord[1]];
              deque.add(new int[] { x, y });
            }
          }
        }

        for (int i = -2; i <= 2; i++) {
          for (int j = -2; j <= 2; j++) {
            if (i == 0 && j == 0) continue;
            if (i == 0 && j == -1) continue;
            if (i == 0 && j == 1) continue;
            if (i == 1 && j == 0) continue;
            if (i == -1 && j == 1) continue;

            x = coord[0] + i; y = coord[1] + j;
            if (check(x, y, h, w) && s[x][y] >= -1) {
              if (s[x][y] == -1) {
                s[x][y] = s[coord[0]][coord[1]] + 1;
                deque.add(new int[] { x, y });
              } else {
                if (s[x][y] > s[coord[0]][coord[1]] + 1) {
                  s[x][y] = s[coord[0]][coord[1]] + 1;
                  deque.add(new int[] { x, y });
                }
              }
            }
          }
        }
      }

      System.out.println(s[d[0] - 1][d[1] - 1]);
    }
  }

  private static boolean check(int x, int y, int h, int w) {
    return 0 <= x && x < h && 0 <= y && y < w;
  }
}
