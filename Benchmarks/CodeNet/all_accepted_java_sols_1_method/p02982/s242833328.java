import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), D = sc.nextInt();
    int[][] X = new int[N][D];
    for (int i = 0; i < N; i++)
      for (int j = 0; j < D; j++) X[i][j] = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < N; i++)
      for (int j = 0; j < i; j++) {
        int tmp = 0;
        for (int k = 0; k < D; k++) tmp += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
        if (Math.sqrt(tmp) == (int)Math.sqrt(tmp)) ans++;
      }
    System.out.println(ans);
  }
}