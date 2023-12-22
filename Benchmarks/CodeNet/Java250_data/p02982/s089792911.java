import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt(), D = in.nextInt();
    int[][] X = new int[N][D];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < D; j++) {
        X[i][j] = in.nextInt();
      }
    }

    int ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        if (calc(X[i], X[j])) {
          ans++;
        }
      }
    }
    System.out.println(ans);
  }

  public static boolean calc(int[] a, int[] b) {
    double sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += Math.pow(a[i] - b[i], 2);
    }
    return ((Math.sqrt(sum) * 10) % 10) == 0;
  }
}