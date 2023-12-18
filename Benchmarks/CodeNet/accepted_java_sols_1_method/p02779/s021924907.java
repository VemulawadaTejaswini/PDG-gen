import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    for (int i = 0; i < n; ++i) {
      String a = sc.next();
      map.put(a, map.getOrDefault(a, 0));
      map.put(a, map.get(a) + 1);
    }
    sc.close();

    for (Map.Entry<String, Integer> e : map.entrySet()) {
      if(e.getValue() > 1) {
        System.out.println("NO");
        System.exit(0);
      }
    }

    System.out.println("YES");
  }
}