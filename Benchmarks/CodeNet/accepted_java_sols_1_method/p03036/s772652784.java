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


    int r = scanner.nextInt();
    int D = scanner.nextInt();

    int x = scanner.nextInt();
    long temp = x;
    for (int i = 0; i < 10; i++) {

      temp = r * temp - D;
      System.out.println(temp);
    }


  }
}

