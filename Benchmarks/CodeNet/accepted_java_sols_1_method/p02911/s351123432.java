import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();

    int[] points = new int[n];
    Arrays.fill(points, k - q);

    for (int i = 0; i < q; i++) {
      int p = sc.nextInt();
      points[p - 1]++;
    }

    for (int point : points) {
      if (point >= 1) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
