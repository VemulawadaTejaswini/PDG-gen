import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str_scan = scan.nextLine();
    double N = Double.parseDouble(str_scan);
    var ans = "no";
    double amari = 0;
    double sum = 0;

    while(N > 0){
      amari = N % 10;
      sum += amari;
      N = N / 10;
    }

    if ( (sum % 9) == 0 ) {
      ans = "yes";
    }

    System.out.println(ans);
    scan.close();
  }
}