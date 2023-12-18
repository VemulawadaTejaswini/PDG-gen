import java.util.*;

public class Main {

  private static void solve(int N) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int x = 1; x * x < N; x++) {
      for (int y = 1; y * y < N && y * x < N; y++) {
        for (int z = 1; z * z < N && z * y < N; z++) {
          int val = x * x + y * y + z * z + x * y + y * z + z * x;
          map.put(val, map.getOrDefault(val, 0) + 1);
        }
      }
    }
    for (int i = 1; i <= N; i++) {
      int res = 0;
      if (map.containsKey(i)) {
        res += map.get(i);
      }
      System.out.println(res);
    }
  }

  public static void main(String[] args) {
    int N = scanner.nextInt();
    solve(N);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
