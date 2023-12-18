import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> a = new ArrayList<Integer>();
    int ans = 0;

    for (int i = 0; i < n; i++) {
      a.add(sc.nextInt());
    }

    a.sort(Collections.reverseOrder());

    for (int i = 0; i < n; i++) {
      if ((i % 2) == 0) {
        ans += a.get(i);
      } else {
        ans -= a.get(i);
      }
    }

    System.out.println(ans);

  }
}