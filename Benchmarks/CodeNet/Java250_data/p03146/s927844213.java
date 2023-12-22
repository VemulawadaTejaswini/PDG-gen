import java.util.HashMap;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int s = Integer.parseInt(sc.next());

    int ans = 0;
    HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();

    int ai = s;
    a.put(ai, 1);

    for (ans = 2; ans <= 1000000; ans++) {
      if (ai % 2 == 0) {
        ai = ai / 2;
      } else {
        ai = 3 * ai + 1;
      }
      if (a.containsKey(ai)) {
        System.out.println(ans);
        return;
      } else {
        a.put(ai, 1);
      }
    }

  }
}