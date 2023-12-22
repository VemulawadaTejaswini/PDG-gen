import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    Map<Integer, Integer> used = new HashMap<>();
    for (int i = 0; i < num; i++) {
      int val = sc.nextInt();
      if (used.get(val) != null) {
        System.out.println("NO");
        return;
      } else {
        used.put(val, i);
      }
    }
    System.out.println("YES");
  }
}
