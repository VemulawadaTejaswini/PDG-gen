import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      br.readLine();
      final var a = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt).toArray();

      final var lists = new ArrayList<List<Integer>>();
      var list = new ArrayList<Integer>();
      list.add(a[0]);
      for (int i = 1; i < a.length; i++) {
        if (list.get(list.size() - 1) > a[i]) {
          lists.add(list);
          list = new ArrayList<>();
        }

        list.add(a[i]);
      }
      lists.add(list);

      var sum = 1000L;
      for (final var phase : lists) {
        if (phase.size() <= 1) continue;

        var sumNext = sum;
        for (int i = 0; i < phase.size() - 1; i++) {
          // buy
          final var numBuy = sum / phase.get(i);

          final var result = sum -
                             phase.get(i) * numBuy +
                             phase.get(phase.size() - 1) * numBuy;

          sumNext = Math.max(sumNext, result);
        }

        sum = sumNext;
      }

      System.out.println(sum);
    }
  }
}
