import java.util.Scanner;

public class Main {
  static final char SEARCH_DONE = '.';
  static final int[] dx = { -1, 0, 1, 0 };
  static final int[] dy = { 0, 1, 0, -1 };
  static int h;
  static int w;
  static char[][] map;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    h = sc.nextInt();
    w = sc.nextInt();

    map = new char[h][];
    for (int i = 0; i < h; i++) {
      map[i] = sc.next().toCharArray();
    }

    int count = 0;
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        char current = map[i][j];
        if (current != SEARCH_DONE) {
          depthFirstSearch(i, j, current);
          count++;
        }
      }
    }
    System.out.println(count);
  }

  private static void depthFirstSearch(int y, int x, char current) {
    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];

      if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
        continue;
      }

      if (map[ny][nx] == current) {
        map[ny][nx] = SEARCH_DONE;
        depthFirstSearch(ny, nx, current);
      }
    }
  }
}