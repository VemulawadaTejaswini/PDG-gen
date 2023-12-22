import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String[] d = new String[k];
    for (int i = 0; i < k; i++) {
      d[i] = sc.next();
    }
    for (int i = 1; i < Integer.MAX_VALUE; i++) {
      int price = i;
      String price_s = Integer.toString(i);
      boolean skip = false;
      for (int j = 0; j < k; j++) {
        if (price_s.contains(d[j])) {
          skip = true;
        }
      }
      if (skip) {
        continue;
      }
      if (price >= n) {
        System.out.println(price);
        return;
      }
    }
  }
}