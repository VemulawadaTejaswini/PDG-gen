import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Point {
    int x, y;

    Point(int x_, int y_) {
      x = x_;
      y = y_;
    }
  }

  int[][] ofs = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

  void run() {
    for ( ;; ) {
      int w, h;
      w = ni();
      h = ni();
      if ( w == 0 ) {
        break;
      }

      boolean[][] W = new boolean[h + 2][w + 2];
      boolean[][] B = new boolean[h + 2][w + 2];
      char[][] field = new char[h + 2][w + 2];
      Queue<Point> wq = new LinkedList<Point>();
      Queue<Point> bq = new LinkedList<Point>();
      for ( int i = 1; i <= h; ++i ) {
        char[] str = sc.next().toCharArray();
        for ( int j = 1; j <= w; ++j ) {
          field[ i ][ j ] = str[ j - 1 ];
          if ( field[ i ][ j ] == 'W' ) {
            wq.add( new Point( j, i ) );
          }
          if ( field[ i ][ j ] == 'B' ) {
            bq.add( new Point( j, i ) );
          }
        }
      }

      while (wq.size() > 0) {
        Point e = wq.poll();
        for ( int[] v : ofs ) {
          Point np = new Point( e.x + v[ 0 ], e.y + v[ 1 ] );
          if ( field[ np.y ][ np.x ] == '.' && !W[ np.y ][ np.x ] ) {
            wq.add( np );
            W[ np.y ][ np.x ] |= true;
          }
        }
      }
      while (bq.size() > 0) {
        Point e = bq.poll();
        for ( int[] v : ofs ) {
          Point np = new Point( e.x + v[ 0 ], e.y + v[ 1 ] );
          if ( field[ np.y ][ np.x ] == '.' && !B[ np.y ][ np.x ] ) {
            bq.add( np );
            B[ np.y ][ np.x ] |= true;
          }
        }
      }

      int wc, bc;
      wc = bc = 0;
      for ( int i = 1; i <= h; ++i ) {
        for ( int j = 1; j <= w; ++j ) {
          if ( W[ i ][ j ] && B[ i ][ j ] )
            continue;
          if ( W[ i ][ j ] )
            ++wc;
          if ( B[ i ][ j ] )
            ++bc;
        }
      }

      System.out.println( bc + " " + wc );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }

}