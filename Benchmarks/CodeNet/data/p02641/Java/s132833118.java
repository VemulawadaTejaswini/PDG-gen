import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }

    for (int i = 0;; i++) {
      int plus = x + i;
      int minus = x - i;
      if (!list.contains(minus)) {
        System.out.println(minus);
        return;
      }
      if (!list.contains(plus)) {
        System.out.println(plus);
        return;
      }
    }

  }

}