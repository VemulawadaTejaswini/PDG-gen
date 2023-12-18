import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

  final int INF = 100_000_000;
  int H,W,N;
  char[][] map;
  int[][] minD;
  int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
  Deque<Point> que = new ArrayDeque<>();

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {

      String[] lines = in.readLine().split(" ");
      H = Integer.parseInt(lines[0]);
      W = Integer.parseInt(lines[1]);
      N = Integer.parseInt(lines[2]);

      map = new char[H][W];
      Point[] point = new Point[N+1];

      for(int i=0; i<H; i++) {
        map[i] = in.readLine().toCharArray();

        int x = 0;
        for (char c : map[i]) {
          if(Character.isDigit(c)) {
            int m = Character.getNumericValue(c);
            point[m] =  new Point(x, i);
          }
          else if(c == 'S')
            point[0] = new Point(x, i);

          x++;
        }
      }

      int ans = 0;
      minD = new int[H][W];

      for(int i=0; i<N; i++) {
        for (int[] a : minD)
          Arrays.fill(a, INF);

        ans += bfs(point[i],point[i+1]);
        que.clear();
      }

      System.out.println(ans);
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  private int bfs(Point S, Point G) {
    int sx = S.x;
    int sy = S.y;
    int gx = G.x;
    int gy = G.y;

    que.offer(S);
    minD[sy][sx] = 0;

    while(!que.isEmpty()) {
      Point p = que.poll();

      if(p.x == gx && p.y == gy) break;

      for(int i=0; i<4; i++) {
        int nx = p.x + dx[i], ny = p.y + dy[i];

        if(0 <= nx && nx < W && 0 <= ny && ny < H && map[ny][nx] != 'X'
          && minD[ny][nx] == INF) {
          
          que.offer(new Point(nx,ny));
          minD[ny][nx] = minD[p.y][p.x] + 1;
        }
      }
    }
    return minD[gy][gx];
  }
}

class Point {
  int x;
  int y;

  public Point() {
    x = 0;
    y = 0;
  }
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}
