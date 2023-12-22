import java.util.*;
import static java.lang.System.*;
 
public class Main{
  public static void main(String[] args){//方針としては、階乗求めてからその階乗分あるルートを全部求めて足して、それを階乗の数値で割る
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();//配列の数
    int[] a = new int[N];
    int jun = 1;
    int stopper = 0;
    int kosu = 0;
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      for (int j = 0; i < N; i++) {
        if (a[stopper + i] == jun) {
          kosu += 1;
          stopper = j;
          jun+=1;
          break;
        }
      }
    }
    if (kosu != 0) {
      out.print(N - kosu);
    } else {
      out.print("-1");
    }




  }
}
