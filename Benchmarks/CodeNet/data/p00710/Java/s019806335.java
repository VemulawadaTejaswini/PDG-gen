import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }
      int r = ni();
      ArrayList<Integer> list = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        list.add(n - i);
      }
      for (int i = 0; i < r; ++i) {
        int p = ni();
        int c = ni();
        ArrayList<Integer> sub = new ArrayList<>();
        for (Iterator<Integer> ite = list.listIterator(p - 1); 0 < c; --c) {
          int v = ite.next();
          sub.add(v);
          ite.remove();
        }
//        debug(list);
        list.addAll(0, sub);
//        debug(list);
      }

      System.out.println(list.get(0));
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}