import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int hundComplement = (10 - n / 100) * 100;
    int tenComplement =( 10 - n % 100 / 10) * 10;
    int oneComplement = 10 - n % 10;
    int result = hundComplement + tenComplement + oneComplement;

    System.out.println(result);
  }
}
