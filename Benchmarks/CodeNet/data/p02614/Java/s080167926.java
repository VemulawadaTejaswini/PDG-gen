import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();
    int k = sc.nextInt();
    int total = 0;

    int[][] cells = new int[h][w];
    for (int y = 0; y < h; y++) {
      String row = sc.next();
      for (int x = 0; x < w; x++) {
        String c = row.substring(x, x + 1);
        cells[y][x] = c.equals("#") ? 1 : 0;
        total += cells[y][x];
      }
    }
    sc.close();

    if (k == total) {
      System.out.println(1);
      return;
    } else if (k > total) {
      System.out.println(0);
      return;
    }

    int h2 = 1 << h;
    int w2 = 1 << w;

    int ans = 0;
    for (int y = 0; y < h2; y++) {
      for (int x = 0; x < w2; x++) {
        int count = 0;
        for (int y2 = 0; y2 < h; y2++) {
          if (((1 << y2) & y) == 0) continue;

          for (int x2 = 0; x2 < w; x2++) {
            if (((1 << x2) & x) == 0) continue;

            count += cells[y2][x2];
          }
        }
        if (count == k) {
          ans++;
        }

      }

    }

    System.out.println(ans);
  }
}
