import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var k = Integer.parseInt(br.readLine());

      if (k == 7) {
        System.out.println(1);
        return;
      }

      if (k == 10) {
        System.out.println(-1);
        return;
      }

      Set<Integer> done = new HashSet<>();
      int mod7 = 7 % k;
      int mod10 = 10 % k;
      int count = 1;

      int prev = 0;
      while (true) {
        int next = ((prev * mod10) % k + mod7) % k;

        if (done.contains(next)) {
          System.out.println(-1);
          return;
        }

        done.add(next);
        prev = next;

        if (next == 0) {
          System.out.println(count);
          return;
        }

        count++;
      }
    }
  }
}
