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
    int[] map = new int[10];
    int a = scanner.nextInt();
    map[a] = 1;

    int b = scanner.nextInt();
    map[b] = 1;

    a = scanner.nextInt();
    map[a] = 1;
    a = scanner.nextInt();
    map[a] = 1;


    if(map[1] == 1 && map[7] == 1 && map[9] == 1 && map[4] == 1){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }


  }

}
