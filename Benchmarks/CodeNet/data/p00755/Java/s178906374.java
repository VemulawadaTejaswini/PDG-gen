import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int h, w, c;

  int[][] field;

  int dfs(int depth) {
    if ( depth == 4 ) {
      fill( c );
//      debug("!!!!", res, "!!!!");
      return fill( c );
    }

    int[][] dup = new int[h][w];
    for ( int i = 0; i < h; ++i ) {
      for ( int j = 0; j < w; ++j ) {
        dup[ i ][ j ] = field[ i ][ j ];
      }
    }
    int max = 0;
    for ( int r = 1; r <= 6; ++r ) {
      fill( r );
//      debug(depth);
//      for(int[] a : field) debug(a);
      max = Math.max( max, dfs( depth + 1 ) );
      for ( int i = 0; i < h; ++i ) {
        for ( int j = 0; j < w; ++j ) {
          field[ i ][ j ] = dup[ i ][ j ];
        }
      }
    }
    return max;
  }

  int[][] ofs = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

  int fill(int color) {
    int cnt = 0;
    Queue<Integer> qx = new LinkedList<Integer>();
    Queue<Integer> qy = new LinkedList<Integer>();
    qx.add( 0 );
    qy.add( 0 );
    boolean[][] done = new boolean[h][w];
    boolean[][] ok = new boolean[h + 2][w + 2];
    for ( int i = 1; i <= h; ++i ) {
      for ( int j = 1; j <= w; ++j ) {
        ok[ i ][ j ] = true;
      }
    }
    int atom = field[ 0 ][ 0 ];
    field[ 0 ][ 0 ] = color;
    done[ 0 ][ 0 ] = true;
    ++cnt;
    while (qx.size() > 0) {
      int x = qx.poll();
      int y = qy.poll();

      for ( int[] d : ofs ) {
        int nx = x + d[ 0 ];
        int ny = y + d[ 1 ];
        if ( ok[ ny + 1 ][ nx + 1 ] && !done[ ny ][ nx ]
            && field[ ny ][ nx ] == atom ) {
          done[ ny ][ nx ] = true;
          field[ ny ][ nx ] = color;
          qx.add( nx );
          qy.add( ny );
          ++cnt;
        }
      }
    }

    return cnt;
  }

  void run() {
    for ( ;; ) {
      h = ni();
      w = ni();
      c = ni();
      if ( ( h | w | c ) == 0 ) {
        break;
      }

      field = new int[h][w];
      for ( int i = 0; i < h; ++i ) {
        for ( int j = 0; j < w; ++j ) {
          field[ i ][ j ] = ni();
        }
      }

      System.out.println( dfs( 0 ) );
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