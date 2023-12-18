import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    c();
  }

  public static void c() {
    try (Scanner sc = new Scanner(System.in)) {
      int x = Integer.parseInt(sc.next());
      int y = Integer.parseInt(sc.next());
      Integer[] a = new Integer[y];
      for (int z = 0; z < y; z++) {
        a[z] = Integer.parseInt(sc.next());
      }
      Boolean flg = true;
      if (!Arrays.asList(a).contains(x)) {
        System.out.println(x);
        flg = false;
      }
      int ans = 0;
      if (flg) {
        for (int q = 1; q < y + 2; q++) {
          ans = x - q;
          if (!Arrays.asList(a).contains(ans)) {
            System.out.println(ans);
            break;
          }
          ans = x + q;
          if (!Arrays.asList(a).contains(ans)) {
            System.out.println(ans);
            break;
          }
        }
      }
    } catch (Exception E) {
      System.out.println("エラー");
    }
  }
}