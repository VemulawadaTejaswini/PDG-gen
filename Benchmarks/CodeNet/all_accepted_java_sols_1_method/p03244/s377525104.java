import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Map<Integer, Integer> odds = new HashMap<>();
    Map<Integer, Integer> evens = new HashMap<>();
    int N = scanner.nextInt();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      if (i % 2 == 0) {
        evens.put(a, evens.getOrDefault(a, 0) + 1);
      } else {
        odds.put(a, odds.getOrDefault(a, 0) + 1);
      }
    }

    List<Map.Entry<Integer, Integer>> o = new ArrayList<>(odds.entrySet());
    List<Map.Entry<Integer, Integer>> e = new ArrayList<>(evens.entrySet());
    o.sort((o1, o2) -> o2.getValue() - o1.getValue());
    e.sort((o1, o2) -> o2.getValue() - o1.getValue());

    int o1 = o.get(0).getValue();
    int o2 = o.size() == 1 ? 0 : o.get(1).getValue();
    int e1 = e.get(0).getValue();
    int e2 = e.size() == 1 ? 0 : e.get(1).getValue();

    if (!o.get(0).getKey().equals(e.get(0).getKey())) {
      System.out.println(N - o1 - e1);
    } else {
      System.out.println(N - Math.max(o1 + e2, o2 + e1));
    }
  }
}
