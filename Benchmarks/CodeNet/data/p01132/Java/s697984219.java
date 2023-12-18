import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    int[] mist = new int[] { 10, 50, 100, 500 };
    for ( int i = 0;; ++i ) {
      int n = ni();
      if ( n == 0 ) {
        break;
      }
      int[] list = new int[4];
      for ( int j = 0; j < 4; ++j ) {
        list[ j ] = ni();
      }
      int[] ans = new int[4];
      int min = 1 << 28;
      for ( int a = 0; a <= list[ 0 ]; ++a ) {
        for ( int b = 0; b <= list[ 1 ]; ++b ) {
          for ( int c = 0; c <= list[ 2 ]; ++c ) {
            for ( int d = 0; d <= list[ 3 ]; ++d ) {
              int sum = a * mist[ 0 ] + b * mist[ 1 ] + c * mist[ 2 ] + d
                  * mist[ 3 ];
              if ( sum < n )
                continue;
              int v = a + b + c + d;
              int n_ = sum - n;
              for(int k = 3; 0 <= k; --k) {
                int p = n_ / mist[k];
                n_ -= mist[k]*p;
                v += p;
              }
              if ( min < v )
                continue;
              min = v;
              ans[ 0 ] = a;
              ans[ 1 ] = b;
              ans[ 2 ] = c;
              ans[ 3 ] = d;
//              debug(a, b, c, d, sum, v, n_);
            }
          }
        }
      }
      if ( i > 0 ) {
        System.out.println();
      }
      for ( int j = 0; j < 4; ++j ) {
        if ( ans[ j ] == 0 )
          continue;
        System.out.println( mist[ j ] + " " + ans[ j ] );
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