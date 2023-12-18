import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    boolean[] pt = new boolean[123456 * 2 + 1];
    Arrays.fill( pt, true );
    pt[ 0 ] = pt[ 1 ] = false;
    for ( int i = 2; i * i < pt.length; ++i ) {
      if ( pt[ i ] ) {
        debug(i);
        for ( int j = i * 2; j < pt.length; j += i ) {
          pt[ j ] = false;
        }
      }
    }

    for ( ;; ) {
      int n = ni();
      if ( n == 0 )
        break;

      int sum = 0;
      for ( int i = n + 1; i <= 2 * n; ++i ) {
        if ( pt[ i ] )
          ++sum;
      }

      System.out.println( sum );
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