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
    int[] map = new int[N];
    for (int i = 0; i < N; i++) {
      map[i] = scanner.nextInt();

    }

    Arrays.sort(map);
//    System.out.println(map[0]);
    int total = 0;
    for (int i = 0; i < N -1; i++) {
      total += map[i];
    }

    if(total > map[N - 1]){
        System.out.println("Yes");
      }else{
        System.out.println("No");
    }
  }



}
