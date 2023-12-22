import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int ans = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    list.sort(null);

    for (int i = 0; i < n; i++) {
      int a = list.get(i);
      if (x >= a) {
        ans++;
        x -= a;
      } else {
        System.out.println(ans);
        return;
      }
    }

    if (x == 0) {
      System.out.println(n);
    } else {
      System.out.println(n - 1);
    }

  }
}