import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Rect {
    int w, d;

    Rect(int w, int d) {
      this.w = w;
      this.d = d;
    }

    ArrayList<Rect> cut(int s) {
      Rect[] res = new Rect[2];

      s %= w + d;
      if ( s < w ) {
        res[ 0 ] = new Rect( s, d );
        res[ 1 ] = new Rect( w - s, d );
      } else {
        s -= w;
        res[ 0 ] = new Rect( w, s );
        res[ 1 ] = new Rect( w, d - s );
      }

      if ( res[ 0 ].getV() > res[ 1 ].getV() ) {
        Rect tmp = res[ 0 ];
        res[ 0 ] = res[ 1 ];
        res[ 1 ] = tmp;
      }

      ArrayList<Rect> l = new ArrayList<Rect>( 2 );
      for ( Rect r : res ) {
        l.add( r );
      }
      return l;
    }

    int getV() {
      return w * d;
    }

    public String toString() {
      return "(" + w + ", " + d + ")";
    }
  }

  void run() {
    for ( ;; ) {
      int n, w, d;
      n = ni();
      w = ni();
      d = ni();
      if ( ( n | w | d ) == 0 ) {
        break;
      }

      Comparator<Rect> comp = new Comparator<Rect>() {
        public int compare(Rect o1, Rect o2) {
          return o1.getV() - o2.getV();
        }
      };

      ArrayList<Rect> list = new ArrayList<Rect>();
      list.add( new Rect( w, d ) );
      for ( int i = 0; i < n; ++i ) {
        int p = ni() - 1;
        int s = ni();

        list.addAll( list.get( p ).cut( s ) );
        list.remove( p );
      }
      Collections.sort( list, comp );

      for ( int i = 0; i < n + 1; ++i ) {
        if ( i > 0 ) {
          System.out.print( " " );
        }
        System.out.print( list.get( i ).getV() );
      }
      System.out.println();
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