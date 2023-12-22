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
    int M = scanner.nextInt();

    int C = scanner.nextInt();

    int[] map = new int[M];

    for (int i = 0; i < M; i++) {
      map[i] = scanner.nextInt();
    }

    int ans = 0;

    for (int i = 0; i < N; i++) {

      int cnt = 0;
      for (int j = 0; j < M; j++) {
        int temp = scanner.nextInt();

        cnt += temp * map[j];


      }
      if(cnt + C > 0)ans++;
    }


    System.out.println(ans);



//    System.out.println(getAns());





  }

//  static public int getAns(){
//    Scanner scanner = new Scanner(System.in);
//
//    int w = scanner.nextInt();
//
//
//
//
//    return (H - h) * (W - w);
//  }

}
