import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;
  int INF = 1 << 28;

  int compare(int v1, int h1, int v2, int h2) {
    if ( v1 < v2 ) {
      return 1;
    } else if ( v1 > v2 ) {
      return -1;
    } else {
      if ( h1 < h2 ) {
        return 1;
      } else if ( h1 > h2 ) {
        return -1;
      } else {
        return 0;
      }
    }
  }

  void run() {
    for ( ;; ) {
      int h = ni();
      int w = ni();

      if ( ( h | w ) == 0 )
        break;

      int min = INF;
      int minh = INF;
      int minw = INF;

      int trg = h * h + w * w;
      // debug(trg);
      for ( int i = 1; i <= 150; ++i ) {
        for ( int j = i + 1; j <= 150; ++j ) {
          int v = i * i + j * j;

          // debug(i, j, v);
          if ( compare( trg, h, v, i ) > 0 ) {
            if ( compare( min, minh, v, i ) < 0 ) {
              min = v;
              minh = i;
              minw = j;
            }
          }
        }
      }

      System.out.println( minh + " " + minw );
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