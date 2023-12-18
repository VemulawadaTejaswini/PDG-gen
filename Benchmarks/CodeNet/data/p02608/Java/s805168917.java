import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    Map<Integer, AtomicInteger> countMap = new HashMap<>();
    for (int x = 1; x <= 10000; x++) {
      int x2 = x * x;
      if (x2 > n) {
        break;
      }
      for (int y = 1; y <= 10000; y++) {
        int y2 = y * y;
        int xy = x * y;
        if ((long) x2 + y2 + xy > n) {
          break;
        }
        for (int z = 1; z <= 10000; z++) {
          long c = x2 + y2 + z * z + xy + y * z + z * x;
          if (c > n) {
            break;
          }
          int castC = (int) c;
          countMap.computeIfAbsent(castC, k -> new AtomicInteger(0))
            .incrementAndGet();
        }
      }
    }
    for (int i = 1; i <= n; i++) {
      pw.println(countMap.getOrDefault(i, new AtomicInteger(0)).get());
    }
  }
}
