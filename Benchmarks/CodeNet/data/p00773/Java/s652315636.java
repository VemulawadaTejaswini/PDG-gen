import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int ex(int src, int ratio) {
    return ( src * ( ratio + 100 ) ) / 100;
  }

  void run() {
    for ( ;; ) {
      int x, y, s;

      x = ni();
      y = ni();
      s = ni();

      if ( ( x | y | s ) == 0 ) {
        break;
      }

      int max = 0;
      for ( int i = 1; i <= s / 2; ++i ) {
        int a = ex( i, x );
        for ( int j = s; 0 <= j; --j ) {
          int b = ex( j, x );

          if ( a + b == s ) {
            max = Math.max( max, ex( i, y ) + ex( j, y ) );
            break;
          }
        }
      }

      System.out.println( max );
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