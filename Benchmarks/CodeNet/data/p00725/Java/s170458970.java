import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;


class Main {
  static int w, h;
  static int[][] map;
  static int sx, sy;
  static int gx, gy;

  static boolean isIn(int x, int y) {
    return 0 <= x && x < w && 0 <= y && y < h;
  }

  static boolean ableToMove(int x, int y, int dx, int dy) {
    int c = 0;
    while(true) {
      x += dx;
      y += dy;
      if(!isIn(x, y)) {
        // System.out.println("a");
        return false;
      }
      if(map[y][x] == 3) {
        // System.out.println("b");
        return true;
      }
      if(map[y][x] == 1) break;
      c++;
    }
    // System.out.println("c");
    return c > 0;
  }

  static int move(int x, int y, int dx, int dy) {
    int nx = x + dx, ny = y + dy, c = 0;
    while(true) {
      if(map[ y][ x] == 3) break;
      if(map[ny][nx] == 1) break;
      x += dx;
      y += dy;
      nx += dx;
      ny += dy;
      c++;
    }
    if(isIn(x + dx, y + dy) && map[y + dy][x + dx] == 1) {
      map[y + dy][x + dx] = 0;
    }
    return c;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      w = sc.nextInt();
      h = sc.nextInt();
      if(w == 0 && h == 0) break;

      map = new int[h][w];
      for(int y = 0; y < h; y++) {
        for(int x = 0; x < w; x++) {
          map[y][x] = sc.nextInt();
          if(map[y][x] == 2) { sx = x; sy = y; }
          if(map[y][x] == 3) { gx = x; gy = y; }
        }
      }

      // System.out.println(ableToMove(1, 0, -1, 0));
      // System.out.println(move(1, 0, -1, 0));

      int min = -1;
      Queue<Integer> qx = new ArrayDeque<Integer>();
      Queue<Integer> qy = new ArrayDeque<Integer>();
      Queue<Integer> qc = new ArrayDeque<Integer>();
      qx.add(sx);
      qy.add(sy);
      qc.add(0);
      while(!qx.isEmpty()) {
        int x = qx.remove();
        int y = qy.remove();
        int c = qc.remove();

        if(c > 10) break;
        if(x == gx && y == gy) {
          min = c;
          break;
        }

        if(ableToMove(x, y, -1,  0)) { qx.add(x - move(x, y, -1,  0)); qy.add(y); qc.add(c + 1); }
        if(ableToMove(x, y,  0, -1)) { qy.add(y - move(x, y,  0, -1)); qx.add(x); qc.add(c + 1); }
        if(ableToMove(x, y,  1,  0)) { qx.add(x + move(x, y,  1,  0)); qy.add(y); qc.add(c + 1); }
        if(ableToMove(x, y,  0,  1)) { qy.add(y + move(x, y,  0,  1)); qx.add(x); qc.add(c + 1); }
      }

      System.out.println(min);
    }
  }
}