import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> list = new ArrayList<Integer>();
    int s = sc.nextInt();
    list.add(s);
    int ans = 1;

    while (true) {
      ans++;
      int next = 0;
      if ((s % 2) == 1) {
        next = (3 * s) + 1;
      } else {
        next = s / 2;
      }
      if (list.contains(next)) {
        System.out.println(ans);
        return;
      } else {
        s = next;
        list.add(next);
      }
    }

  }
}