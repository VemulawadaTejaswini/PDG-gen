import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    b();
  }
  public static void b() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      int[] p = new int[n];
      for (int xx = 0; xx < n; xx++) {
        p[xx] = Integer.parseInt(sc.next());
      }
      Arrays.parallelSort(p);

      int goukei = 0;
      for (int ans = 0; ans < k; ans++) {
        goukei += p[ans];
      }

      System.out.println(goukei);

    } catch (Exception E) {
      System.out.println("エラー");
    }
  }
}