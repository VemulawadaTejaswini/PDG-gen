import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for (; ; ) {
      int W = ni();
      int H = ni();

      if ( (W | H) == 0 ) break;

      boolean[][] field = new boolean[ H + 2 ][ W + 2 ];

      int sx = 0;
      int sy = 0;
      for ( int i = 1; i <= H; ++i ) {
        char[] str = sc.next().toCharArray();
        for ( int j = 1; j <= W; ++j ) {
          if ( str[ j - 1 ] == '@' ) {
            sx = j;
            sy = i;
          }
          if ( str[ j - 1 ] == '.' ) {
            field[ i ][ j ] |= true;
          }
        }
      }

      int cnt = 1;
      Queue<Integer> qx = new LinkedList<Integer>();
      Queue<Integer> qy = new LinkedList<Integer>();
      qx.add(sx);
      qy.add(sy);
      boolean[][] done = new boolean[ H + 2 ][ W + 2 ];
      done[ sy ][ sx ] = true;
      while ( qx.size() > 0 ) {
        int x = qx.poll();
        int y = qy.poll();

        for ( int[] d : ofs ) {
          int nx = x + d[ 0 ];
          int ny = y + d[ 1 ];
          if ( !done[ ny ][ nx ] && field[ ny ][ nx ] ) {
            done[ ny ][ nx ] |= true;
            qx.add(nx);
            qy.add(ny);
            ++cnt;
          }
        }
      }

      System.out.println(cnt);
    }
  }

  int[][] ofs = new int[][]{
      { 0, 1 },
      { 1, 0 },
      { -1, 0 },
      { 0, -1 }
  };

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}