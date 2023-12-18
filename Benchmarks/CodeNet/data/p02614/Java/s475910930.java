import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var line = br.readLine().split(" ");
      final var h = Integer.parseInt(line[0]);
      final var w = Integer.parseInt(line[1]);
      final var k = Integer.parseInt(line[2]);

      final var lines = new char[h][w];
      for (int i = 0; i < h; i++) {
        final var l = br.readLine();
        for (int j = 0; j < w; j++) {
          lines[i][j] = l.charAt(j);
        }
      }

      int count = 0;
      for (int row = 0; row < Math.pow(2, h); row++) {
        for (int col = 0; col < Math.pow(2, w); col++) {
          if (countBlack(lines, row, col) == k) {
            count++;
          }
        }
      }

      System.out.println(count);
    }
  }

  private static int countBlack(char[][] lines, int rows, int cols) {
    final var rowsBool = new boolean[lines.length];
    for (int i = 0; i < rowsBool.length; i++) {
      rowsBool[i] = (rows & (1 << i)) == (1 << i);
    }

    final var colsBool = new boolean[lines[0].length];
    for (int i = 0; i < colsBool.length; i++) {
      colsBool[i] = (cols & (1 << i)) == (1 << i);
    }

    int count = 0;
    for (int i = 0; i < lines.length; i++) {
      for (int j = 0; j < lines[i].length; j++) {
        if (rowsBool[i] || colsBool[j]) continue;

        if (lines[i][j] == '#') {
          count++;
        }
      }
    }

    return count;
  }
}
