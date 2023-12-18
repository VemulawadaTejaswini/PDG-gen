import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();

    // マップに要素追加する
    for (int i = 0; i < n; i++) {
      int key = sc.nextInt();
      Integer mapVal = map.get(key);
      map.put(key, mapVal == null ? 1 : ++mapVal);
    }

    int q = sc.nextInt();
    for (int j = 0; j < q; j++) {
      int b = sc.nextInt();
      int c = sc.nextInt();

      Integer bVal = map.get(b);
      map.remove(b);

      Integer cVal = map.get(c);

      map.put(c, cVal == null ? bVal : cVal + bVal);

      System.out.println(map.entrySet().stream().mapToInt(v -> v.getKey() * v.getValue()).sum());
    }
  }
}
