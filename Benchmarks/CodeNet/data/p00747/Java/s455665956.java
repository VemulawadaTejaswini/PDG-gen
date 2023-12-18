import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

  final int INF = 100_000_000;
  int W, H;
  Square[][] map;
  int[][] d;
  int[] rx = {0,0,-1,1}, ry = {-1,1,0,0}; // up,down, left, right
  Deque<Square> deq = new ArrayDeque<>();

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines;
      StringBuilder buf = new StringBuilder();
      
      while(true) {
        lines = in.readLine().split(" ");
        W = Integer.parseInt(lines[0]);
        H = Integer.parseInt(lines[1]);

        if(W == 0 && H == 0) break;

        map = new Square[H][W];

        String line = "";
        for(int i=0; i<H; i++) {

          if(i != 0)
            line = in.readLine();
          for(int j=0; j<W; j++) {
            if(i == 0) {
              map[i][j] = new Square(j,i);
            }
            else {
              map[i][j] = new Square(j,i);
              map[i][j].wall[0] = map[i-1][j].wall[1]
              = line.charAt(j<<1) == '0' ? true : false;
            }
          }

          line = in.readLine();
          for(int j=1; j<W; j++) {
            map[i][j-1].wall[3] = map[i][j].wall[2]
            = line.charAt((j<<1)-1) == '0' ? true : false;
          }
        }
        d = new int[H][W];
        for (int[] a : d)
          Arrays.fill(a, INF); 

        int ans = bfs();
        buf.append(ans != INF ? ans : 0).append('\n');
        deq.clear();
      }

      System.out.print(buf);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private int bfs() {

    d[0][0] = 1;
    deq.offer(map[0][0]);

    while(!deq.isEmpty()) {
      Square cur = deq.poll();

      if(cur.x == W-1 && cur.y == H-1) break;

      for(int i=0; i<4; i++) {
        int nx = cur.x + rx[i], ny = cur.y + ry[i];

        if(0 <= nx && nx < W && 0 <= ny && ny < H
          && cur.wall[i] && d[ny][nx] == INF) {

            deq.offer(map[ny][nx]);
            d[ny][nx] = d[cur.y][cur.x] + 1;
          }
      }
    }

    return d[H-1][W-1];
  }
}

class Square {
  int x,y;
  boolean[] wall;

  public Square() {
    wall = new boolean[4];
  }
  public Square(int x, int y) {
    this.x = x;
    this.y = y;
    wall = new boolean[4];
  }
}
