import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int[] points = new int[n];

    for (int i = 0; i < q; i++) {
      int a = sc.nextInt();
      a--;
      points[a] += 1;
    }

    for (int i = 0; i < n; i++) {
      if (k - q + points[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
