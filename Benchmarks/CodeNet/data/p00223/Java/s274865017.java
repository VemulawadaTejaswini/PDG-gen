import java.io.*;
import java.util.*;

public class Main {
  // constant
  static final int MAX_INT = (1 << 31) - 1;
  static final int MAX_D = 100;

  static final int[][] DIRCS = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};

  // innter classes

  static class PtPair {
    int x0, y0, x1, y1;

    PtPair(int x0, int y0, int x1, int y1) {
      this.x0 = x0;
      this.y0 = y0;
      this.x1 = x1;
      this.y1 = y1;
    }
  }

  // global variables

  // subroutines

  // main
  public static final void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String[] wh = br.readLine().trim().split(" ");
      int w = Integer.parseInt(wh[0]);
      int h = Integer.parseInt(wh[1]);
      if (w == 0 && h == 0) break;

      String[] txy = br.readLine().trim().split(" ");
      int tx = Integer.parseInt(txy[0]) - 1;
      int ty = Integer.parseInt(txy[1]) - 1;

      String[] kxy = br.readLine().trim().split(" ");
      int kx = Integer.parseInt(kxy[0]) - 1;
      int ky = Integer.parseInt(kxy[1]) - 1;

      boolean[][] brd = new boolean[h][w];
      for (int y = 0; y < h; y++) {
        String[] chs = br.readLine().trim().split(" ");
        for (int x = 0; x < w; x++)
          brd[y][x] = chs[x].equals("0");
      }

      int[][][][] dists = new int[w][h][w][h];
      boolean[][][][] visit = new boolean[w][h][w][h];

      for (int x0 = 0; x0 < w; x0++)
        for (int y0 = 0; y0 < h; y0++)
          for (int x1 = 0; x1 < w; x1++)
            for (int y1 = 0; y1 < h; y1++) {
              dists[x0][y0][x1][y1] = MAX_INT;
              visit[x0][y0][x1][y1] = false;
            }

      ArrayList<PtPair> q = new ArrayList<PtPair>();

      dists[tx][ty][kx][ky] = dists[kx][ky][tx][ty] = 0;
      visit[tx][ty][kx][ky] = visit[kx][ky][tx][ty] = true;
      q.add(new PtPair(tx, ty, kx, ky));

      while (! q.isEmpty()) {
        PtPair pp = q.remove(0);

        if (pp.x0 == pp.x1 && pp.y0 == pp.y1) break;
        if (dists[pp.x0][pp.y0][pp.x1][pp.y1] >= MAX_D) continue;

        int ndist = dists[pp.x0][pp.y0][pp.x1][pp.y1] + 1;

        for (int k0 = 0; k0 < 4; k0++) {
          boolean moved = false;

          int nx0 = pp.x0 + DIRCS[k0][0];
          int ny0 = pp.y0 + DIRCS[k0][1];
          if (nx0 >= 0 && nx0 < w && ny0 >= 0 && ny0 < h && brd[ny0][nx0])
            moved = true;
          else {
            nx0 = pp.x0;
            ny0 = pp.y0;
          }

          int k1 = k0 ^ 2;
          int nx1 = pp.x1 + DIRCS[k1][0];
          int ny1 = pp.y1 + DIRCS[k1][1];
          if (nx1 >= 0 && nx1 < w && ny1 >= 0 && ny1 < h && brd[ny1][nx1])
            moved = true;
          else {
            nx1 = pp.x1;
            ny1 = pp.y1;
          }

          if (moved && dists[nx0][ny0][nx1][ny1] > ndist) {
            dists[nx0][ny0][nx1][ny1] = dists[nx1][ny1][nx0][ny0] = ndist;
            if (! visit[nx0][ny0][nx1][ny1]) {
              visit[nx0][ny0][nx1][ny1] = visit[nx1][ny1][nx0][ny0] = true;
              q.add(new PtPair(nx0, ny0, nx1, ny1));
            }
          }
        }
      }

      int min_dist = MAX_INT;
      for (int y = 0; y < h; y++)
        for (int x = 0; x < w; x++)
          if (min_dist > dists[x][y][x][y])
            min_dist = dists[x][y][x][y];

      if (min_dist < MAX_D)
        System.out.println(min_dist);
      else
        System.out.println("NA");
    }
  }
}