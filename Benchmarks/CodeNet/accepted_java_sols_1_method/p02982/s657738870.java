import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    int[][] X = new int[N][D];
    for (int i = 0; i < N; i++)
      for (int j = 0; j < D; j++)
        X[i][j] = sc.nextInt();
    int count = 0;
    int tmp;
    for (int i = 0; i < N - 1; i++)
      for (int j = i + 1; j < N; j++) {
        tmp = 0;
        for (int k = 0; k < D; k++)
          tmp += (int) Math.pow(X[i][k] - X[j][k], 2);
        if (Math.sqrt(tmp) == (int) Math.sqrt(tmp))
          count++;
      }
    System.out.println(count);
  }
}