import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    // スペース区切りで分ける
    var str = str_scan.split(" ");
    var N = Integer.parseInt(str[0]);
    var D = Integer.parseInt(str[1]);

    double Distance = Math.pow(D,2);

    int ans = 0;
    double x = 0;
    double y = 0;
    double z = 0;

    // read X,Y

    for (var i=0; i<N; i++){
      str_scan = scan.nextLine();
      str = str_scan.split(" ");
      x = Math.pow(Double.parseDouble(str[0]),2);
      y = Math.pow(Double.parseDouble(str[1]),2);

      z = x + y;

      if ( z <= Distance ) {
        ans++;
      }
    }

    System.out.println(ans);
    scan.close();
  }
}