import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {

    int H = 0;
    int W = 0;
    int[][] cell = null;

    int h = 0;
    int w = 0;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final String[] tmp = br.readLine().split("\\s");
      H = Integer.parseInt(tmp[0]);
      W = Integer.parseInt(tmp[1]);
      cell = new int[H][W];

      final String[] hw = br.readLine().split("\\s");
      h = Integer.parseInt(hw[0]);
      w = Integer.parseInt(hw[1]);

    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    int sum = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < W; j++) {
        cell[i][j] = 1;
        sum++;
      }
    }

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < w; j++) {
        if (cell[i][j] == 0) {
          cell[i][j] = 1;
          sum++;
        }
      }
    }

    System.out.print(H * W - sum);
  }
}
