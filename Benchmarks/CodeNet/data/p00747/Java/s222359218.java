import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Dance {
    boolean u;
    boolean r;
    boolean d;
    boolean l;

    Dance() {
      u = r = d = l = true;
    }

    void wall() {
      u = r = d = l = false;
    }

    boolean adj(int n) {
      switch ( n ) {
      case 0:
        return u;
      case 1:
        return r;
      case 2:
        return d;
      case 3:
        return l;
      }
      return false;
    }

    int[][] ofs = new int[][] { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };

    int[] trans(int n) {
      return ofs[ n ];
    }
  }

  void run() {
    for ( ;; ) {
      int w = ni();
      int h = ni();

      if ( ( w | h ) == 0 ) {
        break;
      }

      Dance[][] adj = new Dance[h + 2][w + 2];
      for ( int i = 0; i <= h + 1; ++i ) {
        for ( int j = 0; j <= w + 1; ++j ) {
          adj[ i ][ j ] = new Dance();
        }
      }
      for ( int i = 0; i <= h + 1; ++i ) {
        adj[ i ][ 0 ].r = adj[ i ][ 1 ].l = false;
        adj[ i ][ w ].r = adj[ i ][ w + 1 ].l = false;
      }
      for ( int i = 0; i <= w + 1; ++i ) {
        adj[ 0 ][ i ].d = adj[ 1 ][ i ].u = false;
        adj[ h ][ i ].d = adj[ h + 1 ][ i ].u = false;
      }
      adj[ 0 ][ 1 ].wall();
      adj[ 0 ][ 1 ].d = true;

      for ( int i = 1; i <= 2 * h - 1; ++i ) {
        int idx = ( i + 1 ) >> 1;
        if ( ( i & 1 ) != 0 ) {
          for ( int j = 1; j <= w - 1; ++j ) {
            adj[ idx ][ j ].r = adj[ idx ][ j + 1 ].l = ni() == 0;
          }
        } else {
          for ( int j = 1; j <= w; ++j ) {
            adj[ idx ][ j ].d = adj[ idx + 1 ][ j ].u = ni() == 0;
          }
        }
      }

      int sx = 1;
      int sy = 0;
      int ex = w;
      int ey = h;
      Queue<Integer> qx = new LinkedList<Integer>();
      Queue<Integer> qy = new LinkedList<Integer>();
      boolean[][] done = new boolean[h + 2][w + 2];
      int[][] cost = new int[h + 2][w + 2];
      qx.add( sx );
      qy.add( sy );
      done[ sy ][ sx ] = true;
      cost[ sy ][ sx ] = 0;
      while (qx.size() > 0) {
        int x = qx.poll();
        int y = qy.poll();
//        debug( x, y );
//        debug( adj[ y ][ x ].u, adj[ y ][ x ].r, adj[ y ][ x ].d,
//            adj[ y ][ x ].l );

        for ( int i = 0; i < 4; ++i ) {
          if ( adj[ y ][ x ].adj( i ) ) {
            int[] d = adj[ y ][ x ].trans( i );
            int dx = x + d[ 0 ];
            int dy = y + d[ 1 ];
//            debug( "\t", dx, dy, x, y, i );
            if ( done[ dy ][ dx ] ) {
              continue;
            }
            cost[ dy ][ dx ] = cost[ y ][ x ] + 1;
            done[ dy ][ dx ] = true;
            qx.add( dx );
            qy.add( dy );
          }
        }
      }

      System.out.println( cost[ ey ][ ex ] );
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