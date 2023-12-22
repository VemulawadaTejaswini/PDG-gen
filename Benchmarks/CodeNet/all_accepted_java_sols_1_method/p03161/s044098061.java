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
  // static int[][] map;
  static double min = 9999999;
  static long ans = 0;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] map = new int[N];

    int[] tree = new int[N];

    for (int i = 0; i < N; i++) {
      tree[i] = scanner.nextInt();
    }

    map[0] = 0;

    for (int i = 1; i < N; i++) {
      int min = 999999999;

      for (int j = 1; j <= K; j++) {
        if(i - j < 0)continue;
        min = Math.min(map[i - j] + Math.abs(tree[i - j] - tree[i]), min);
      }

      map[i] = min;

    }

//    for (int i = 0; i < N; i++) {
//      System.out.print(map[i] + " ");
//    }

    System.out.println(map[N - 1]);

  }
}
