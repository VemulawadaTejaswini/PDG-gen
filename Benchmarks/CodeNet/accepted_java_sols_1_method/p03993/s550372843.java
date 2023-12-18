import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int n = sc.nextInt();
    int cnt = 0;

    for (int i = 1; i <= n; i++) {
      int tmp = sc.nextInt();
      if (map.containsKey(tmp)) {
        if (map.get(tmp) == i) {
          cnt++;
          continue;
        }
      }
      map.put(i, tmp);
    }

    System.out.println(cnt);

  }
}