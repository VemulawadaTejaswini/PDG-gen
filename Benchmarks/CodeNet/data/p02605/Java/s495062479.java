import java.util.*;
public class Main {
  Main() {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      ArrayList<HashMap<Integer, TreeSet<Integer>>> list = new ArrayList<>(8);
      for (int i = 0;i < 8;++ i) list.add(new HashMap<>(N));
      final int[] dx = {1, 1, 0, -1, -1, -1, 0, 1}, dy = {0, 1, 1, 1, 0, -1, -1, -1};
      int ans = Integer.MAX_VALUE;
      while(N --> 0) {
        int X = sc.nextInt(), Y = sc.nextInt();
        int d = getDirection(sc.next().charAt(0));
        for (int i = -1;i <= 1;++ i) {
          final int addLine = (d + i + 12) % 8;
          final int addKey = X * dy[addLine] - Y * dx[addLine], addValue = X * dx[addLine] + Y * dy[addLine];
          list.get(addLine).compute(addKey, (k, v) -> {
            if (v == null) v = new TreeSet<>();
            v.add(addValue);
            return v;
          });
          final int getLine = (d + i + 8) % 8;
          final int getKey = X * dy[getLine] - Y * dx[getLine], getValue = X * dx[getLine] + Y * dy[getLine];
          TreeSet<Integer> set = list.get(getLine).get(getKey);
          if (set == null) continue;
          Integer dist = set.higher(getValue);
          if (dist != null) ans = Math.min(ans, (dist - getValue) * 5);
        }
      }
      if (ans == Integer.MAX_VALUE) System.out.println("SAFE");
      else System.out.println(ans);
    }
  }
  private static int getDirection(char U) {
    return U == 'R' ? 0 : U == 'U' ? 2 : U == 'L' ? 4 : 6;
  }
  public static void main(String[] args) {
    new Main();
  }
}