import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    // int型へ変換
    var A = Integer.parseInt(str[0]);
    var B = Integer.parseInt(str[1]);
    var C = Integer.parseInt(str[2]);

    String ans = "No";

    String k_scan = scan.nextLine();
    var K = Integer.parseInt(k_scan);

    for (var i=0;i<=K;i++) {
      var Atmp = A << i;
      for (var j=0;j<=K;j++) {
        var Btmp = B << j;
        for (var f=0;f<=K;f++) {
          var Ctmp = C << f;

          if ( (Btmp > Atmp)  && (Ctmp > Btmp) && (i+j+f <= K) ) {
            ans = "Yes";
            break;
          }

        }
        if (ans == "Yes") {
          break;
        }
      }
      if (ans == "Yes") {
        break;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}