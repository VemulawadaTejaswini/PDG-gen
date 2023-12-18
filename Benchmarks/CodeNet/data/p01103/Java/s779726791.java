import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int d = sc.nextInt();
      int w = sc.nextInt();
      if (d == 0) return;

      int map[][] = new int[d][w];
      for (int i = 0; i < d; i++)
        for (int j = 0; j < w; j++)
          map[i][j] = sc.nextInt();

          /*  -i1-      -n-
            j1    j2   w   e
              -i2-      -s-  */

      int max = 0;
      for (int i1 = 0; i1 < d - 2; i1++) {
        for (int j1 = 0; j1 < w - 2; j1++) {
          for (int i2 = i1 + 2; i2 < d; i2++) {
            for (int j2 = j1 + 2; j2 < w; j2++) {

              int out = 10;
              for (int ew = i1; ew <= i2; ew++) {
                if (map[ew][j1] < out) out = map[ew][j1];
                if (map[ew][j2] < out) out = map[ew][j2];
              }
              for (int ns = j1+1; ns <= j2-1; ns++) {
                if (map[i1][ns] < out) out = map[i1][ns];
                if (map[i2][ns] < out) out = map[i2][ns];
              }

              int in = 0;
              for (int a = i1+1; a <= i2-1; a++)
                for (int b = j1+1; b <= j2-1; b++)
                  if (map[a][b] > in) in = map[a][b];

              //System.out.println("in: "+in+", out:"+out);
              if (in < out) {
                //printMap(i1, j1, i2, j2, d, w);
                int count = 0;
                for (int a = i1+1; a <= i2-1; a++)
                  for (int b = j1+1; b <= j2-1; b++)
                    if (map[a][b] < out) count += out - map[a][b];
                if (count > max) max = count;
              }
            }
          }
        }
      }

      System.out.println(max);
    }
  }

  static void printMap(int a, int b, int c, int d, int h, int w) {

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (i >= a && i <= c && (j == b || j == d) || j >= b && j <= d && (i == a || i == c))
          System.out.print(" *");
        else System.out.print(" .");
      }
      System.out.println();
    }
    System.out.println();
  }
}

