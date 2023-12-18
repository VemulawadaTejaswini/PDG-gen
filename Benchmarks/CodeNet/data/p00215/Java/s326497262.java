import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Point {
    int x;
    int y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  }

  int INF = 1 << 28;

  void run() {
    for ( ;; ) {
      int x = ni();
      int y = ni();

      if ( ( x | y ) == 0 ) {
        break;
      }

      Point S = null;
      Point G = null;
      ArrayList<ArrayList<Point>> list = new ArrayList<ArrayList<Point>>();
      for ( int i = 0; i < 5; ++i ) {
        list.add( new ArrayList<Point>() );
      }
      for ( int i = 0; i < y; ++i ) {
        char[] str = sc.next().toCharArray();
        for ( int j = 0; j < x; ++j ) {
          if ( str[ j ] == 'S' ) {
            S = new Point( j, i );
          } else if ( str[ j ] == 'G' ) {
            G = new Point( j, i );
          } else if ( str[ j ] == '.' ) {
          } else {
            int id = str[ j ] - '0' - 1;
            ArrayList<Point> subl = list.get( id );
            subl.add( new Point( j, i ) );
          }
        }
      }

      int ansid = INF;
      int min = INF;
      int[][] dp = new int[5][1001];
      for ( int i = 0; i < 5; ++i ) {
        for ( int j = 0; j < list.get( ( i + 1 ) % 5 ).size(); ++j ) {
          dp[ ( i + 1 ) % 5 ][ j ] = dist( S, list.get( ( i + 1 ) % 5 ).get( j ) );
        }
        for ( int j = 2; j < 5; ++j ) {
          int nidx = ( i + j ) % 5;
          int prev = ( nidx + 4 ) % 5;
          for ( int k = 0; k < list.get( nidx ).size(); ++k ) {
            dp[ nidx ][ k ] = INF;
          }
          for ( int k = 0; k < list.get( nidx ).size(); ++k ) {
            for ( int l = 0; l < list.get( prev ).size(); ++l ) {
              dp[ nidx ][ k ] = Math
                  .min(
                      dp[ nidx ][ k ],
                      dp[ prev ][ l ]
                          + dist( list.get( nidx ).get( k ), list.get( prev )
                              .get( l ) ) );
            }
          }
        }
        int subm = INF;
        for ( int j = 0; j < list.get( ( i + 4 ) % 5 ).size(); ++j ) {
          subm = Math.min(
              subm,
              dp[ ( i + 4 ) % 5 ][ j ]
                  + dist( list.get( ( i + 4 ) % 5 ).get( j ), G ) );
        }
        if ( min > subm ) {
          min = subm;
          ansid = i + 1;
        }
      }

      if ( min == INF ) {
        System.out.println( "NA" );
      } else {
        System.out.println( ansid + " " + min );
      }
    }
  }

  int dist(Point a, Point b) {
    return Math.abs( a.x - b.x ) + Math.abs( a.y - b.y );
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