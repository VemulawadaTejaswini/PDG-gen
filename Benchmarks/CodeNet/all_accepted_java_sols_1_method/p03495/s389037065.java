import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      map.put(a, map.getOrDefault(a, 0) + 1);
    }
    List<Integer> counts = new ArrayList<>(map.values());
    Collections.sort(counts);

    int res = 0;
    for (int i = 0; i < counts.size() - K; i++) res += counts.get(i);
    System.out.println(res);
  }
}
