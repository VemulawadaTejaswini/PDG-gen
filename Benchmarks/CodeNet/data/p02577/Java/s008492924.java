import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();

    BigDecimal N = new BigDecimal(str_scan);
    var ans = "No";
    double amari = 0;
    double sum = 0;
    int keta = 0;

    keta = N.precision();
    char[] work = new char[keta];

    for(var i = 0; i < keta; i++){
      sum += Double.parseDouble(String.valueOf(str_scan.charAt(i)));
    }

    if ( (sum % 9) == 0 ) {
      ans = "Yes";
    }

    System.out.println(ans);
    scan.close();
  }
}