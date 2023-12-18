import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int INF = 1 << 28;

  class Pair implements Comparable<Pair> {
    int f;
    int s;
    int retrof;
    int retros;

    Pair(int f_, int s_, boolean retrof_, boolean retros_) {
      f = f_;
      s = s_;
      retrof = retrof_ ? -1 : 1;
      retros = retros_ ? -1 : 1;
    }

    Pair(int f_, int s_) {
      this( f_, s_, false, false );
    }

    public int compareTo(Pair o) {
      if ( f > o.f ) {
        return 1 * retrof;
      } else if ( f < o.f ) {
        return -1 * retrof;
      } else {
        if ( s > o.s ) {
          return 1 * retros;

        } else if ( s < o.s ) {
          return -1 * retros;
        } else {
          return 0;
        }
      }
    }

    public String toString() {
      return "{" + f + ", " + s + "}";
    }
  }

  class Problem {
    boolean isAC;
    int time;
    int cntWA;
  }

  class Tri implements Comparable<Tri> {
    Pair p;
    int id;

    Tri(Pair p, int id) {
      this.p = p;
      this.id = id;
    }

    public int compareTo(Tri o) {
      if ( p.compareTo( o.p ) == 0 ) {
        if ( id > o.id ) {
          return -1;
        } else if ( id < o.id ) {
          return 1;
        } else {
          return 0;
        }
      } else {
        return p.compareTo( o.p );
      }
    }

    public String toString() {
      return "{" + p.toString() + " " + id + "}";
    }
  }

  class Team {
    ArrayList<Problem> list;

    Team(int p) {
      list = new ArrayList<Problem>();
      for ( int i = 0; i < p; ++i ) {
        list.add( new Problem() );
      }
    }

    Pair getResult() {
      Pair res = new Pair( 0, 0, true, false );
      for ( int i = 0; i < list.size(); ++i ) {
        Problem pro = list.get( i );
        if ( pro.isAC ) {
          ++res.f;
          res.s += pro.time + pro.cntWA * 20;
        }
      }
      return res;
    }
  }

  void run() {
    for ( ;; ) {
      int M = ni();
      int T = ni();
      int P = ni();
      int R = ni();

      if ( ( M | T | P | R ) == 0 ) {
        break;
      }

      ArrayList<Team> list = new ArrayList<Team>();
      for ( int i = 0; i < T; ++i ) {
        list.add( new Team( P ) );
      }

      for ( int i = 0; i < R; ++i ) {
        int m = ni();
        int t = ni();
        int p = ni();
        int j = ni();

        Team team = list.get( t - 1 );
        Problem pro = team.list.get( p - 1 );
        if ( j == 0 ) {
          pro.time = m;
          pro.isAC |= true;
        } else {
          ++pro.cntWA;
        }
      }

      ArrayList<Tri> ansl = new ArrayList<Tri>();
      for ( int i = 0; i < T; ++i ) {
        Pair pair = list.get( i ).getResult();
        ansl.add( new Tri( pair, i + 1 ) );
      }

      // debug(ansl);

      Collections.sort( ansl );

      for ( int i = 0; i < T; ++i ) {
        if ( i > 0 ) {
          Pair prev = ansl.get( i - 1 ).p;
          if ( ansl.get( i ).p.compareTo( prev ) == 0 ) {
            System.out.print( "=" );
          } else {
            System.out.print( "," );
          }
        }
        System.out.print( ansl.get( i ).id );
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