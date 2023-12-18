import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
  Scanner sc;
  static final int INF = 1 << 28;

  class Point {
    int x_, y_;

    Point(int x, int y) {
      x_ = x;
      y_ = y;
    }

    int[][] ofs = new int[][] { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

    Point(Point p, int d) {
      x_ = p.gx() + ofs[ d ][ 0 ];
      y_ = p.gy() + ofs[ d ][ 1 ];
    }

    int gx() {
      return x_;
    };

    int gy() {
      return y_;
    };
  }

  void run() {
    for ( ;; ) {
      int N = ni();

      if ( N == 0 )
        break;

      HashMap<Integer, Point> map = new HashMap<Integer, Point>();
      map.put( 0, new Point( 0, 0 ) );
      for ( int i = 1; i <= N - 1; ++i ) {
        int n = ni();
        int d = ni();

        Point p = map.get( n );
        map.put( i, new Point( p, d ) );
      }

      int minx = INF, maxx = -INF;
      int miny = INF, maxy = -INF;

      for ( Iterator<Integer> ite = map.keySet().iterator(); ite.hasNext(); ) {
        Point p = map.get( ite.next() );
        minx = Math.min( minx, p.gx() );
        maxx = Math.max( maxx, p.gx() );
        miny = Math.min( miny, p.gy() );
        maxy = Math.max( maxy, p.gy() );
      }

      System.out.println( ( maxx - minx + 1 ) + " " + ( maxy - miny + 1 ) );
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