import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  private static void solve(int n, int d, int[][] x) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        long distance = 0;
        for (int k = 0; k < d; k++) {
          int diff = Math.abs(x[i][k] - x[j][k]);
          distance += diff * diff;
        }
        double sqrt = Math.sqrt((double) distance);
        if (Math.floor(sqrt) == sqrt) count++;
      }
    }
    System.out.println(count);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] num = sc.nextLine().split(" ");
    int n = Integer.parseInt(num[0]);
    int d = Integer.parseInt(num[1]);
    int[][] x = new int[n][d];
    for (int i = 0; i < n; i++) {
      String[] xi = sc.nextLine().split(" ");
      for (int j = 0; j < d; j++) x[i][j] = Integer.parseInt(xi[j]);
    }
    solve(n, d, x);
  }
}