import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Plant {
    String name;
    double v;

    Plant(String s, double c) {
      name = s;
      v = c;
    }
  }

  int pow(int n, int r) {
    if ( r == 0 ) {
      return 1;
    } else {
      return n * pow( n, r - 1 );
    }
  }

  void run() {
    for ( ;; ) {
      int n = ni();
      if ( n == 0 ) {
        break;
      }

      Plant[] list = new Plant[n];
      for ( int i = 0; i < n; ++i ) {
        String l = sc.next();
        int p, a, b, c, d, e, f, s, m;
        p = ni();
        a = ni();
        b = ni();
        c = ni();
        d = ni();
        e = ni();
        f = ni();
        s = ni();
        m = ni();

        int v = 0;
        int time = 0;
        time += ( a + b + c );
        time += ( d + e ) * m;
        v += s * pow( f, m );
        v -= p;

        list[ i ] = new Plant( l, (double) v / time );
      }

      Arrays.sort( list, new Comparator<Plant>() {
        public int compare(Plant o1, Plant o2) {
          if( Math.abs(o1.v - o2.v) < 1e-6) {
            return o1.name.compareTo( o2.name );
          }
          else if ( o1.v < o2.v ) {
            return 1;
          } else {
            return -1;
          }
        }
      } );

      for ( Plant v : list ) {
        System.out.println( v.name );
      }
      System.out.println( "#" );
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