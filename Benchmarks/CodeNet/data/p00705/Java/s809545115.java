import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  void run() {
    for (; ; ) {
      int N, Q;
      N = ni();
      Q = ni();

      if ( (N | Q) == 0 ) {
        break;
      }

      int[] nums = new int[ 101 ];
      int max = 0;
      for ( int i = 0; i < N; ++i ) {
        int M = ni();
        for ( int j = 0; j < M; ++j ) {
          int d = ni();
          max = Math.max(max, ++nums[ d ]);
        }
      }

      if ( max < Q ) {
        System.out.println("0");
      } else {
        for ( int i = 0; i < 101; ++i ) {
          if ( nums[ i ] == max ) {
            System.out.println(i);
            break;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}