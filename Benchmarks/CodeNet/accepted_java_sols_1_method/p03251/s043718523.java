import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[m];

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }

    for (int i = 0; i < m; i++) {
      y[i] = sc.nextInt();
    }

    for (int z = X+1; z <= Y; z++) {
      int countx = 0;
      int county = 0;
      for (int j = 0; j < n; j++) {
        if (x[j] < z) {
          countx++;
        }
      }

      for (int j = 0; j < m; j++) {
        if (y[j] >= z) {
          county++;
        }
      }

      if (countx == n && county == m) {
        System.out.println("No War");
        return;
      }
    }

    System.out.println("War");

  }

}
