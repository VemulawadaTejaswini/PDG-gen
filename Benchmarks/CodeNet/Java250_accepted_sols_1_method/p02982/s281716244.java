import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[][] x = new int[n][d];
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < d; j++) {
        x[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int num = 0;
        for (int k = 0; k < d; k++) {
          num += Math.pow(Math.abs(x[i][k] - x[j][k]), 2);
        }
        for (int k = 0; k <= num; k++) {
          if (k * k == num) {
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}