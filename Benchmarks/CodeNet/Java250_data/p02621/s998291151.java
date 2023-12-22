import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    double ans = Double.parseDouble(str_scan);
    double ans_double;

    ans_double = ans + Math.pow(ans,2) + Math.pow(ans,3);

    System.out.println((int)ans_double);
    scan.close();
  }
}