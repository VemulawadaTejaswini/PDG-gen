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

    int[] map = new int[5];

//    int A = scanner.nextInt();
//    int B = scanner.nextInt();
//    int C = scanner.nextInt();
//    int D = scanner.nextInt();
//    int E = scanner.nextInt();

    for (int i = 0; i < 5; i++) {

      map[i] = scanner.nextInt();
    }
    int ans = 0;
    int min = 10;
    for (int i = 0; i < 5; i++) {
      if(map[i] % 10 != 0){
        min = Math.min(min,map[i] % 10);
        ans += map[i] / 10 + 1;
      }else{
        ans += map[i] / 10;
      }

    }

    System.out.println(ans * 10 - 10 + min);







  }


}
