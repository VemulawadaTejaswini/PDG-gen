import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // int型へ変換
    var K = Integer.parseInt(str_scan);

    int ans = 1;
    String seven = "7";
    String seventmp = "7";
    double sevenDouble = 7;
    var i = 0;
    int vallen;
    int klen = String.valueOf( K ).length();

    // 偶数を除外する
    if ( K % 2 == 0 ) {
      ans = -1;
    }
    // 5の倍数を除外
    if ( K % 5 == 0 ) {
      ans = -1;
    }

    if ( ans > 0 ) {

      while(true) {

        vallen = String.valueOf(sevenDouble).length();

        if ( klen + 1 == vallen ) {
          if ( sevenDouble % K == 0) {
            break;
          }
        }

        // 7の連番を生み出す
        seventmp = seven;
        seven = seven + "7";
        sevenDouble = Double.parseDouble(seventmp)-14;

        ans++;

      }

    }


    System.out.println(ans);
    scan.close();
  }
}