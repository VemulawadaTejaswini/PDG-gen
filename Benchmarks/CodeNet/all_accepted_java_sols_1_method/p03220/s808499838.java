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

    int T = scanner.nextInt();
    int A = scanner.nextInt();

    int map[] = new int[N];


    int ans = -1;
    for (int i = 0; i < N; i++) {
      map[i] = scanner.nextInt();
      double temp = T - map[i] * 0.006;
      if(min > Math.abs(A - temp)){
        ans = i + 1;
        min = Math.abs(A - temp);
      }
    }
    System.out.println(ans);
  }
}
