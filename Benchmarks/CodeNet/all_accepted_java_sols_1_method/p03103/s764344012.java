import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int N = sc.nextInt();
      int M = sc.nextInt();

      Map<Long, Long> tMap = new TreeMap<>();
      for (int i = 0; i < N; i++) {
        long price = sc.nextInt();
        long left = sc.nextInt();
        if (tMap.containsKey(price)) {
          tMap.put(price, tMap.get(price) + left);
        } else {
          tMap.put(price, left);
        }
      }

      long ans = 0;
      for (Map.Entry<Long, Long> entry : tMap.entrySet()) {
        long buy = Math.min(M, entry.getValue());
        ans += buy * entry.getKey();
        M -= buy;
        if(M <= 0) {
          break;
        }
      }

      System.out.println(ans);
    }
  }
}