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

    int  ans = 0;
    long[] mapa = new long[N];
    long[] mapb = new long[N];

    for (int i = 0; i < N; i++) {
      mapa[i] = scanner.nextLong();
    }
    for (int i = 0; i < N; i++) {
      mapb[i] = scanner.nextLong();
    }


    long tarin = 0;
    ArrayList<Long> ok = new ArrayList<>();

    long amari = 0;
    ans = 0;
    for (int i = 0; i < N; i++) {
      if(mapa[i] - mapb[i] >= 0){
        amari += mapa[i] - mapb[i];
        ok.add(mapa[i] - mapb[i]);

//        ans++;
      }else{
        tarin += mapb[i] - mapa[i];

        ans++;
      }
    }


    Collections.sort(ok);
    for (int i = 0; i < ok.size(); i++) {
//      System.out.println(ok.get(i));
    }
//    System.out.println();
//    System.out.println(tarin);
//    System.out.println();

//    System.out.println("ans = " + ans);
    if(amari < tarin){
      ans = -1;
      tarin = 0;
    }
    for (int i = 0; i < ok.size(); i++) {
      if(tarin <= 0)break;
      tarin -=ok.get(ok.size() - i - 1);
//      System.out.println(ok.get(ok.size() - i - 1));
      ans++;
    }

    System.out.println(ans);


  }

}
