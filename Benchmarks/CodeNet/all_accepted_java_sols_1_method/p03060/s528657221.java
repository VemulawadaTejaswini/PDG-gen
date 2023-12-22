import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

  static int N;
  static int K;
  static long Q;
  static int A;
  static int B;
  static long C;
  static double min = 9999999;
  static long ans = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    int N = scanner.nextInt();

    int[] V = new int[N];
    int[] C = new int[N];
    for (int i = 0; i < N; i++) {
      V[i] = scanner.nextInt();


    }

    for (int i = 0; i < N; i++) {
      C[i] = scanner.nextInt();

    }

    for (int i = 0; i < N; i++) {
      ans += Math.max(0, V[i] - C[i]);
    }

    System.out.println(ans);

  }
}
