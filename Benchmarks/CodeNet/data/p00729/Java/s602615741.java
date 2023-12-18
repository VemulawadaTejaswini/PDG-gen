import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int N = ni();
      int M = ni();
      if ( ( N | M ) == 0 ) {
        break;
      }

      int[][] imos = new int[M + 1][1261];

      int r = ni();
      for ( int i = 0; i < r; ++i ) {
        int t = ni();
        int n = ni();
        int m = ni();
        int s = ni();

        imos[ m ][ t ] += 2 * s - 1;
      }

      int q = ni();
      for ( int i = 0; i < q; ++i ) {
        int ts = ni();
        int te = ni();
        int m = ni();

        int v = 0;
        int cnt = 0;
        for ( int j = 0; j < te; ++j ) {
          v += imos[ m ][ j ];
          if ( v > 0 && ts <= j ) {
            ++cnt;
          }
        }

        System.out.println( cnt );
      }
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