import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Circle {
    byte x, y, r, c;

    Circle(byte x, byte y, byte r, byte c) {
      this.x = x;
      this.y = y;
      this.r = r;
      this.c = c;
    }

    boolean intersect(Circle o) {
      return ( (int) r + o.r ) * ( (int) r + o.r ) > ( (int) x - o.x )
          * ( (int) x - o.x ) + ( (int) y - o.y ) * ( (int) y - o.y );
    }
  }

  int n;
  Circle[] list;
  boolean[] done;

  byte[] memo;
  boolean[] fill;

  byte dfs(int BITS) {
    if ( fill[ BITS ] ) {
      return memo[ BITS ];
    }
    byte max = 0;

    for ( int i = 0; i < n; ++i ) {
      if ( done[ i ] || !isTop( i ) )
        continue;
      for ( int j = i - 1; 0 <= j; --j ) {
        if ( done[ j ] || !isTop( j ) )
          continue;

        if ( list[ i ].c == list[ j ].c ) {
          done[ i ] = done[ j ] = true;
          max = (byte) Math
              .max( max, 2 + dfs( BITS | ( 1 << i ) | ( 1 << j ) ) );
          done[ i ] = done[ j ] = false;
        }
      }
    }

    fill[ BITS ] = true;
    memo[ BITS ] = max;
    return max;
  }

  boolean isTop(int index) {
    boolean flag = true;
    for ( int i = index - 1; 0 <= i; --i ) {
      flag &= done[ i ] | !list[ i ].intersect( list[ index ] );
    }
    return flag;
  }

  void run() {
    for ( ;; ) {
      n = ni();
      if ( n == 0 ) {
        break;
      }

      list = new Circle[n];
      done = new boolean[n];
      fill = new boolean[1 << n];
      memo = new byte[1 << n];
      for ( int i = 0; i < n; ++i ) {
        byte x = ni();
        byte y = ni();
        byte r = ni();
        byte c = ni();
        list[ i ] = new Circle( x, y, r, c );
        // debug(isTop(i));
      }

      System.out.println( dfs( 0 ) );
    }
  }

  Main() {
    sc = new Scanner( System.in );
  }

  byte ni() {
    return (byte) sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println( Arrays.deepToString( os ) );
  }

}