import java.util.*;

public class Main {
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    int gcd = 1;  /* gcd：最大公約数を１に初期化 */
    int small = 0;
    //x.compareTo(y);

    /* x÷y or y÷x が割り切れるとき, 小さい方を最大公約数として返す */
    if ((x % y == 0) || (y % x == 0)){
      if (x > y || x == y) System.out.println(y);
      else System.out.println(x);
    }
    else{
      if (x > y || x == y){
        x = x % y;
        small = x;
      }
      else{
        y = y % x;
        small = y;
      }

      for (int i = 1; i <= small; i++){
        if ((x % i == 0) && (y % i == 0)){
          gcd = i;
        }
      }
      System.out.println(gcd);
    }
  }
}
