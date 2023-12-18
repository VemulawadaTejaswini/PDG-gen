import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner( System.in );
  }

  public static void main(String[] args) {
    new Main().run();
  }

  int cal(int y, int m, int d) {
    int days = 0;

    days += y * ( 20 + 19 ) * 5 + ( ( y - 1 ) / 3 ) * 5;
    days += ( m / 2 ) * ( 20 + 19 ) - ( ~m & 1 ) * 19;
    if ( y % 3 == 0 ) {
      days += ( m - 1 ) / 2;
    }
    days += d;

    return days;
  }

  void run() {
    int n = ni();
    int atm = cal( 1000, 1, 1 );
    for ( int i = 0; i < n; ++i ) {
      int y = ni();
      int m = ni();
      int d = ni();

      int days = cal( y, m, d );
      System.out.println( atm - days );
    }
  }

  int ni() {
    return sc.nextInt();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }
}