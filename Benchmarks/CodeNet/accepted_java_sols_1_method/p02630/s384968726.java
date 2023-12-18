import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 0;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      if (map.containsKey(tmp)) {
        int v = map.get(tmp);
        map.put(tmp, v + 1);
      } else {
        map.put(tmp, 1);
      }
    }

    for (int key : map.keySet()) {
      sum += key * map.get(key);
    }

    int q = sc.nextInt();

    for (int i = 0; i < q; i++) {
      int b = sc.nextInt();
      int c = sc.nextInt();
      if (map.containsKey(b)) {
        int v = map.get(b);
        int gap = (c - b) * v;
        sum += gap;
        map.remove(b);
        if (map.containsKey(c)) {
          int tmp = map.get(c);
          map.put(c, tmp + v);
        } else {
          map.put(c, v);
        }
      }
      System.out.println(sum);
    }
  }
}