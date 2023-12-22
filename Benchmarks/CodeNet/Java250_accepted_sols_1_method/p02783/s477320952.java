import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());

    int cnt = 0;
    while (h >= 0) {
      h -= a;
      ++cnt;
    }
    if (h % a == 0) {
      System.out.println(cnt - 1);
    } else {
      System.out.println(cnt);
    }
  }
}
