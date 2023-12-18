import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    for (int i = 0; i < N; i++) X[i] = sc.nextInt();
    sc.close();

    int ans = Integer.MAX_VALUE;
    for (int x = 1; x <= 100; x++) {
      int sum = 0;
      for (int i = 0; i < N; i++) {
        sum += (X[i] - x) * (X[i] - x);
      }
      ans = Math.min(ans, sum);
    }
    System.out.println(ans);
  }
}
