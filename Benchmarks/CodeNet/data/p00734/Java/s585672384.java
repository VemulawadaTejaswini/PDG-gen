import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    for ( ;; ) {
      int n = ni();
      int m = ni();

      if ( ( n | m ) == 0 )
        break;

      int[] t = new int[n];
      int[] h = new int[m];

      int sumt = 0;
      for ( int i = 0; i < n; ++i ) {
        t[ i ] = ni();
        sumt += t[ i ];
      }
      int sumh = 0;
      for ( int i = 0; i < m; ++i ) {
        h[ i ] = ni();
        sumh += h[ i ];
      }

      int min = 1 << 28;
      int mintidx = 0;
      int minhidx = 0;
      boolean f = false;
      for ( int i = 0; i < n; ++i ) {
        for ( int j = 0; j < m; ++j ) {
          if ( ( sumt - t[ i ] + h[ j ] ) == ( sumh - h[ j ] + t[ i ] ) ) {
            f |= true;
            if ( t[ i ] + h[ j ] < min ) {
              min = t[ i ] + h[ j ];
              mintidx = i;
              minhidx = j;
            }
          }
        }
      }

      if ( f ) {
        System.out.println( t[ mintidx ] + " " + h[ minhidx ] );
      } else {
        System.out.println( -1 );
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