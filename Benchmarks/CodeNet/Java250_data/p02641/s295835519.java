import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int n = sc.nextInt();

    if (n == 0) {
      System.out.println(x);
      return;
    }

    List<Integer> ps = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ps.add(sc.nextInt());
    }

    int max = Integer.MAX_VALUE;
    for (int i = 1; i <= n; i++) {
      int tmp = x + i;
      if (!ps.contains(tmp)) {
        max = tmp;
        break;
      }
    }
    int min = Integer.MAX_VALUE;
    for (int i = 0; i <= n; i++) {
      int tmp = x - i;
      if (!ps.contains(tmp)) {
        min = tmp;
        break;
      }
    }

    if (Math.abs(x - min) <= Math.abs(x - max)) {
      System.out.println(min);
    } else {
      System.out.println(max);
    }
  }
}
