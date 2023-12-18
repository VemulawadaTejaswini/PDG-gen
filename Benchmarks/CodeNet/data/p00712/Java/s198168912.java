import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Pair<T extends Comparable<T>, U extends Comparable<U>> implements
      Comparable<Pair<T, U>> {
    T f;
    U s;

    Pair(T f, U s) {
      this.f = f;
      this.s = s;
    }

    public int compareTo(Pair<T, U> o) {
      return 0;
    }

    public String toString() {
      return "{" + f + ", " + s + "}";
    }
  }

  int gcd(int m, int n) {
    for ( ; m != 0; ) {
      int t = n % m;
      n = m;
      m = t;
    }
    return n;
  }

  int lcm(int n, int m) {
    return ( n / gcd( n, m ) ) * m;
  }

  int p;
  int q;
  int n;
  int a;

  int equalF(int p1, int q1, int p2, int q2) {
    int v1 = p1 * q2;
    int v2 = p2 * q1;

    return new Integer( v1 ).compareTo( new Integer( v2 ) );
  }

  Pair<Integer, Integer> add(int p1, int q1, int p2, int q2) {
    int pro = q1 * q2;
    int v1 = p1 * q2;
    int v2 = p2 * q1;

    int gcd = gcd( v1 + v2, pro );

    return new Pair<Integer, Integer>( ( v1 + v2 ) / gcd, pro / gcd );
  }

  int dfs(int depth, int pro, int p_, int q_, int lastq) {
    if ( equalF( p, q, p_, q_ ) == 0 ) {
      // debug("cnt up!");
      return 1;
    }
    if ( depth == n ) {
      return 0;
    }
    if ( equalF( p, q, p_, q_ ) < 0 ) {
      return 0;
    }
    {
      Pair<Integer, Integer> np = add( p_, q_, n - depth, lastq );
      if ( equalF( p, q, np.f, np.s ) > 0 ) {
        return 0;
      }
    }
    int cnt = 0;
    for ( int i = lastq; i <= a / pro; ++i ) {
      Pair<Integer, Integer> np = add( p_, q_, 1, i );
      // debug( depth, i, p );
      cnt += dfs( depth + 1, pro * i, np.f, np.s, i );
    }
    return cnt;
  }

  void run() {
    for ( ;; ) {
      p = ni();
      q = ni();
      a = ni();
      n = ni();

      if ( ( p | q | n | a ) == 0 ) {
        break;
      }

      System.out.println( dfs( 0, 1, 0, 1, 1 ) );
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