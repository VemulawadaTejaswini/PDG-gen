
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < N; i++) {
      Integer key = sc.nextInt();
      map.computeIfPresent(key, (k, v) -> (v + 1));
      map.putIfAbsent(key, 1);
    }

    List<Integer> list = new ArrayList<>();
    map.entrySet().forEach(e -> list.add(e.getValue()));
    Collections.sort(list, Comparator.reverseOrder());
    int ans = list.stream().skip(K).mapToInt(n -> n).sum();
    System.out.println(ans);
    sc.close();
  }
}
