import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Point {
    int x, y;

    Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    public int hashCode() {
      return y * 1024 + x;
    }
    public boolean equals(Object o) {
      return this.hashCode() == ((Point)o).hashCode();
    }
  }

  boolean isPrime(int n) {
    boolean flag = n > 1;
    for ( int i = 2; i * i <= n; ++i ) {
      flag &= n % i != 0;
    }
    return flag;
  }

  void run() {
    HashMap<Integer, Point> map = new HashMap<Integer, Point>();
    boolean[][] prime = new boolean[1024][1024];
    int[][] field = new int[1024][1024];
    boolean[][] fill = new boolean[1024][1024];
    int x, y;
    x = y = 1024 >> 1;
    int len = 1;
    int dir = 1;
    int idx = 1;
    prime[ y ][ x ] = isPrime( idx );
    field[ y ][ x ] = idx;
    fill[y][x] = true;
    map.put( idx, new Point( x, y ) );
    for ( ;idx <= 1000000; ) {
      for ( int i = 0; i < len; ++i ) {
        ++idx;
        x += dir;
        prime[ y ][ x ] = isPrime( idx );
        field[ y ][ x ] = idx;
        fill[y][x] = true;
        map.put( idx, new Point( x, y ) );
      }
      for ( int i = 0; i < len; ++i ) {
        ++idx;
        y -= dir;
        prime[ y ][ x ] = isPrime( idx );
        field[ y ][ x ] = idx;
        fill[y][x] = true;
        map.put( idx, new Point( x, y ) );
      }
      ++len;
      dir *= -1;
    }
//    for ( int i = 1024 / 2 - 3; i <= 1024 / 2 + 3; ++i ) {
//      for ( int j = 1024 / 2 - 3; j <= 1024 / 2 + 3; ++j ) {
//        System.err.print( String.format( "%2d", field[ i ][ j ] ) + ":" + (prime[i][j] ? 1 : 0) + " " );
//      }
//      System.err.println();
//    }
    for ( ;; ) {
      int m = ni();
      int n = ni();
      if ( ( m | n ) == 0 ) {
        break;
      }

      Point p = map.get( n );
      int[][] dp = new int[1024][1024];
      int max = prime[ p.y ][ p.x ] ? 1 : 0;
      int max_num = prime[ p.y ][ p.x ] ? n : 0;
      HashSet<Point> set = new HashSet<Point>();
      set.add( p );
      dp[ p.y ][ p.x ] = prime[ p.y ][ p.x ] ? 1 : 0;
      for ( ;; ) {
        HashSet<Point> nexts = new HashSet<Point>();
        for ( Point ite : set ) {
          int ax = ite.x;
          int ay = ite.y;
          for ( int[] dd : ofs ) {
            int nx = ax + dd[ 0 ];
            int ny = ay + dd[ 1 ];
            Point np = new Point( nx, ny );
//            debug(nx, ny, field[ny][nx], field[ ny ][ nx ] <= m);
            if ( 0 <= nx && nx < 1024 && 0 <= ny && ny < 1024 && fill[ny][nx] && field[ ny ][ nx ] <= m ) {
              nexts.add( np );
              dp[ ny ][ nx ] = Math.max( dp[ ny ][ nx ], dp[ ay ][ ax ]
                  + ( prime[ ny ][ nx ] ? 1 : 0 ) );
              if ( dp[ ny ][ nx ] > max ) {
                max = dp[ ny ][ nx ];
                max_num = field[ ny ][ nx ];
              } else if( dp[ny][nx] == max && prime[ny][nx] ) {
                max_num = Math.max( max_num, field[ny][nx] );
              }
            }
          }
        }
//        debug(nexts.size());
//        for( Point ite : nexts ) {
//          debug(ite.x + "," + ite.y);
//        }
        if ( nexts.size() == 0 ) {
          break;
        }
        set = nexts;
      }

      System.out.println( max + " " + max_num );
    }
  }

  int[][] ofs = new int[][] { { -1, 1 }, { 0, 1 }, { 1, 1 } };

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