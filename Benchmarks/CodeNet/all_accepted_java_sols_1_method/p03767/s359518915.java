import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int N = sc.nextInt();
    long[] A = new long[3 * N];
    for (int i = 0; i < 3 * N; i++) {
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    long ans = 0;
    for (int i = 1; i <= N; i++) {
      ans += A[3 * N - i * 2];
    }
    System.out.println(ans);
  }

}
