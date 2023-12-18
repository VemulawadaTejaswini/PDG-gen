import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  void run() {
    int m = ni();
    for ( int i = 0; i < m; ++i ) {
      int v = ni();
      int y = ni();
      int n = ni();
      int max = 0;
      for ( int j = 0; j < n; ++j ) {
        int h = ni();
        double r = nd();
        int d = ni();

        int a = v;
        int acc = 0;
        for(int k = 0; k < y; ++k) {
          int b = (int)(a * r);
          if( h == 1 ) {
            a += b;
//            debug("h", a);
          } else {
            acc += b;
//            debug("t", acc);
          }
          a -= d;
        }
        max = Math.max(max, a + acc);
      }

      System.out.println(max);
    }
  }

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  double nd() {
    return sc.nextDouble();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}