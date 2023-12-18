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
    int[] map = new int[N];

    int[] tree = new int[N];

    for (int i = 0; i < N; i++) {
      tree[i] = scanner.nextInt();
    }

    map[0] = 0;
    map[1] = Math.abs(tree[0] - tree[1]);

    for (int i = 2; i < N; i++) {
      map[i] = Math.min(map[i - 1] + Math.abs(tree[i - 1] - tree[i]),
              map[i - 2] + Math.abs(tree[i - 2] - tree[i]));
    }

    System.out.println(map[N - 1]);

  }
}
