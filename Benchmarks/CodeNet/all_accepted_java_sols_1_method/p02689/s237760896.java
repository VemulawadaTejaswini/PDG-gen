import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt(); //展望台の数
    int m = sc.nextInt(); //道の数

    int[] h = new int[n]; //展望台の高さ
    for (int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < m; i++) {
      int t1 = sc.nextInt() - 1;
      int t2 = sc.nextInt() - 1;

      if (h[t1] <= h[t2]) {
        set.add(t1);
      }

      if (h[t1] >= h[t2]) {
        set.add(t2);
      }
    }

    System.out.println(n - set.size());
  }
}
