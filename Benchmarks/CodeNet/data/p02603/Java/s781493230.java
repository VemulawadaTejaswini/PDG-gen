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

      var sum = 1000;
      for (final List<Integer> phase : lists) {
        if (phase.size() <= 1) continue;

        // buy
        final var numBuy = sum / phase.get(0);
        sum -= phase.get(0) * numBuy;

        // sell
        sum += phase.get(phase.size() - 1) * numBuy;
      }

      System.out.println(sum);
    }
  }
}
