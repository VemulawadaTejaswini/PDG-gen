import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  boolean[][] done;
  char[][] field;

  int[][] ofs = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

  int dfs(int x, int y) {
    if ( done[ y ][ x ] || field[ y ][ x ] == '#' )
      return 0;

    int sum = 1;
    done[ y ][ x ] = true;
    for ( int[] d : ofs ) {
      sum += dfs( x + d[ 0 ], y + d[ 1 ] );
    }

    return sum;
  }

  void run() {
    for ( ;; ) {
      int w, h;
      w = ni();
      h = ni();

      if ( ( w | h ) == 0 ) {
        break;
      }

      done = new boolean[h + 2][w + 2];
      field = new char[h + 2][w + 2];

      for ( int i = 0; i < h + 2; ++i ) {
        for ( int j = 0; j < w + 2; ++j ) {
          field[ i ][ j ] = '#';
        }
      }

      int sx = 0;
      int sy = 0;
      for ( int i = 1; i <= h; ++i ) {
        char[] str = ns().toCharArray();
        for ( int j = 1; j <= w; ++j ) {
          field[ i ][ j ] = str[ j - 1 ];
          if ( field[ i ][ j ] == '@' ) {
            sx = j;
            sy = i;
          }
        }
      }

      System.out.println( dfs( sx, sy ) );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  int ni() {
    return sc.nextInt();
  }

  String ns() {
    return sc.next();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}