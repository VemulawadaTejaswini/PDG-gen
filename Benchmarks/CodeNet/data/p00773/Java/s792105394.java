import java.util.Arrays;
import java.util.Scanner;

public class Main {
  Scanner sc;

  int ex(int src, int ratio) {
    return (src * (100 + ratio))/100;
  }

  void run() {
    for (; ; ) {
      int x = ni();
      int y = ni();
      int s = ni();

      if ( (x | y | s) == 0 ) {
        break;
      }

      int max = 0;
      for ( int i = 1; i < s; ++i ) {
        for ( int j = 1; j < s; ++j ) {
          int a = ex(i, x);
          int b = ex(j, x);

          if(a+b == s) {
            max = Math.max(max, ex(i, y) + ex(j, y));
          }
        }
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

  public static void main(String[] args) {
    new Main().run();
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}