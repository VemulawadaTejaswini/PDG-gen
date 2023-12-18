import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  void run() {
    for (; ; ) {
      int n = ni();
      int p = ni();

      if ( (n | p) == 0 ) break;

      int[] s = new int[ n ];
      int v = p;
      int idx = 0;
      for (; ; ) {
        if ( v > 0 ) {
          ++s[ idx ];
          --v;

          if ( v == 0 ) {
            boolean flag = true;
            for ( int i = 0; i < n; ++i ) {
              if ( i == idx ) continue;
              flag &= s[ i ] == 0;
            }
            if ( flag ) {
              break;
            }
          }
        } else {
          v += s[ idx ];
          s[ idx ] = 0;
        }


        ++idx;
        idx %= n;
      }


      System.out.println(idx);
    }

  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}