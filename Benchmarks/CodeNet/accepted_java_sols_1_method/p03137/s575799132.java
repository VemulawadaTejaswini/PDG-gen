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
  static long B;
  static long C;
  static double min = 9999999;
  static long ans = 0;




  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    int[] map = new int[M];

    int[] sa = new int[M - 1];

    for (int i = 0; i < M; i++) {
      map[i] = scanner.nextInt();
    }
    Arrays.sort(map);
    for (int i = 0; i < M - 1; i++) {
      sa[i] = map[i + 1] - map[i];
    }
    Arrays.sort(sa);

    int total = 0;
//    for (int i = 0; i < M - 1; i++) {
//      System.out.println(sa[i]);
//    }
    for (int i = 0; i < M - N; i++) {
      total += sa[i];
    }
    System.out.println(total);

  }

}
