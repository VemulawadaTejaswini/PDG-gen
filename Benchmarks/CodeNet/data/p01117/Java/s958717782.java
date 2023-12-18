import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public ArrayList<Integer> maxes;

  public static void main(String[] args) {
    (new Main()).go();
  }

  public void go() {
    this.maxes = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      if (n == 0 && m == 0) {
        break;
      }
      int[] points = new int[n];
      int max = 0;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          points[j] += sc.nextInt();
          if (i == m - 1 && max < points[j]) {
            max = points[j];
          }
        }
      }
      this.maxes.add(max);
    }

    for (Integer max : maxes) {
      System.out.println(max);
    }
    sc.close();
  }
}
