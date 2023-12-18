import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    var X = Long.parseLong(str[0]);
    var K = Long.parseLong(str[1]);
    var D = Long.parseLong(str[2]);

    long ans = 0;
    long syou = 0;
    long amari = 0;

    if ( X < 0 ){
      X = X * -1;
    }

    syou = X / D;
    amari = X % D;

    if ( syou < K ) {
      if ((K % 2 == 1) && (syou % 2 == 1)){
        ans = amari;
      } else if ( (K % 2 == 0) && (syou % 2 == 0)) {
        ans = amari;
      } else if ( (K % 2 == 0) && (syou % 2 == 1)) {
          ans = amari - D;
      } else if ( (K % 2 == 1) && (syou % 2 == 0)){
          ans = amari - D;
      }
      if (ans < 0) {
        ans = -1 * ans;
      }
    } else {
      ans = amari + ((syou-K) * D);
    }

    System.out.println(ans);
    scan.close();
  }
}