import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Pair<T extends Comparable<T>, U extends Comparable<U>> implements
      Comparable<Pair<T, U>> {
    T f;
    U s;
    int retro_f;
    int retro_s;

    Pair(T f_, U s_, boolean retro_ff, boolean retro_sf) {
      f = f_;
      s = s_;
      retro_f = retro_ff ? -1 : 1;
      retro_s = retro_sf ? -1 : 1;
    }

    Pair(T f_, U s_) {
      this( f_, s_, false, false );
    }

    @Override
    public int compareTo(Pair<T, U> o) {
      if ( f.compareTo( o.f ) == 0 ) {
        if ( s.compareTo( o.s ) == 0 ) {
          return 0;
        } else {
          return s.compareTo( o.s ) * retro_s;
        }
      } else {
        return f.compareTo( o.f ) * retro_f;
      }
    }

    public String toString() {
      return "{" + f.toString() + ", " + s.toString() + "}";
    }
  }

  class Team {
    ArrayList<Problem> list;

    Team() {
      list = new ArrayList<Problem>();
    }

    Pair<Integer, Integer> result() {
      int cnt = 0;
      int time = 0;
      for ( Problem v : list ) {
        if ( v.isAC ) {
          ++cnt;
          time += v.time;
          time += v.cntWA * 20;
        }
      }

      return new Pair<Integer, Integer>( cnt, time, true, false );
    }
  }

  class Problem {
    boolean isAC;
    int cntWA;
    int time;

    Problem() {
      isAC = false;
      cntWA = 0;
      time = 0;
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
        Team t = new Team();
        for ( int j = 0; j < P; ++j ) {
          Problem p = new Problem();
          t.list.add( p );
        }
        list.add( t );
      }
      for ( int i = 0; i < R; ++i ) {
        int m = ni();
        int t = ni();
        int p = ni();
        int j = ni();

        Team team = list.get( t - 1 );
        Problem prob = team.list.get( p - 1 );
        if ( j == 0 ) {
          prob.isAC = true;
          prob.time = m;
        } else {
          ++prob.cntWA;
        }
        // debug( prob.isAC, prob.time, prob.cntWA );
      }

      ArrayList<Pair<Pair<Integer, Integer>, Integer>> ansl = new ArrayList<Pair<Pair<Integer, Integer>, Integer>>();
      for ( int i = 0; i < list.size(); ++i ) {
        Team v = list.get( i );
        ansl.add( new Pair<Pair<Integer, Integer>, Integer>( v.result(), i,
            false, true ) );
      }
      // debug( ansl );

      Collections.sort( ansl );
      // debug( ansl );

      Pair<Pair<Integer, Integer>, Integer> buf = null;
      for ( int i = 0; i < ansl.size(); ++i ) {
        Pair<Pair<Integer, Integer>, Integer> v = ansl.get( i );
        if ( i > 0 ) {
          if ( v.f.compareTo( buf.f ) == 0 ) {
            System.out.print( "=" );
          } else {
            System.out.print( "," );
          }
        }
        System.out.print( v.s + 1 );
        buf = v;
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