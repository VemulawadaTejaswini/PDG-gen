import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();

    int[][] points = new int[n][d];
    int count = 0;

    for (int i = 0; i < n; ++i) {

      for (int j = 0; j < d; ++j)
        points[i][j] = sc.nextInt();

      for (int j = 0; j < i; ++j) {
        double dist = 0;

        for (int k = 0; k < d; ++k)
          dist += Math.pow(points[i][k] - points[j][k], 2);

        dist = Math.sqrt(dist);
        if (Math.round(dist) == dist)
          ++count;
      }
    }

    System.out.println(count);
  }
}