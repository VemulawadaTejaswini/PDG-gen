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

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    for(;;) {
      int n = ni();
      if(n ==0) {
        break;
      }
      int cnt = 0;
      for (int i = n + 1; i <= n * 2; ++i) {
        boolean flag = true;
        for (int j = 2; flag && j * j <= i; ++j) {
          flag &= i % j != 0;
        }
        if (flag) {
          ++cnt;
        }
      }
      System.out.println(cnt);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}