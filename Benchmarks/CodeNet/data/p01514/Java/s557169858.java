import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  class Team implements Comparable<Team> {
    int id;
    int[] wc;
    int ac;
    int pn;

    Team(int id, int p) {
      this.id = id;
      wc = new int[p + 1];
      ac = 0;
      pn = 0;
    }

    void c(int pid, int time) {
      ++ac;
      pn += time + wc[ pid ] * 1200;
    }

    void w(int pid) {
      ++wc[ pid ];
    }

    @Override
    public int compareTo(Team o) {
      if ( ac > o.ac ) {
        return -1;
      } else if ( ac < o.ac ) {
        return 1;
      } else {
        if ( pn < o.pn ) {
          return -1;
        } else if ( pn > o.pn ) {
          return 1;
        } else {
          return id - o.id;
        }
      }
    }

  }

  void run() {
    for ( ;; ) {
      int t, p, r;
      t = ni();
      p = ni();
      r = ni();

      if ( ( t | p | r ) == 0 ) {
        break;
      }

      Team[] teams = new Team[t + 1];
      teams[0] = new Team(0, 0);
      teams[0].ac = -1;
      for ( int i = 1; i <= t; ++i ) {
        teams[ i ] = new Team( i, p );
      }

      for ( int i = 0; i < r; ++i ) {
        int tid = ni();
        int pid = ni();
        int time = ni();
        char c = sc.next().toCharArray()[ 0 ];
        if ( c == 'C' ) {
          teams[ tid ].c( pid, time );
        } else {
          teams[ tid ].w( pid );
        }
      }

      Arrays.sort( teams );

      for ( int i = 0; i < t; ++i ) {
        System.out.println( teams[ i ].id + " " + teams[ i ].ac + " "
            + teams[ i ].pn );
      }
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