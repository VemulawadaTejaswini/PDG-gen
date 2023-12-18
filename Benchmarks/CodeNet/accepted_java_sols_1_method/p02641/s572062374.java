
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int max = 105;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      set.add(sc.nextInt());
    }

    int ans = -1;
    if (set.isEmpty()) {
      ans = x;
    } else {
      for (int i = 0; i <= max; i++) {
        if (!set.contains(i) && Math.abs(ans - x) > Math.abs(i - x)) {
          ans = i;
        }
      }
    }
    System.out.println(ans);
    System.out.flush();
    sc.close();
  }
}
