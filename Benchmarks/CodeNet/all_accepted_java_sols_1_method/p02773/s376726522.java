import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  public static void main(String[] args) throws Exception {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int n = Integer.parseInt(br.readLine());
      Map<String, AtomicInteger> map = new TreeMap<>();
      int max = 0;
      for (int i = 0; i < n; i++) {
        String s = br.readLine();
        AtomicInteger c = map.get(s);
        int val = 1;
        if (c == null) {
          map.put(s, new AtomicInteger(1));
        } else {
          val = c.incrementAndGet();
        }
        if (val > max) {
          max = val;
        }
      }
      for (Map.Entry<String, AtomicInteger> e : map.entrySet()) {
        if (e.getValue().get() == max) {
          System.out.println(e.getKey());
        }
      }
      System.out.flush();
    }
  }
}