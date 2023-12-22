import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    String dateStr = sc.next();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate date = LocalDate.parse(dateStr, formatter);
    LocalDate reiwa = LocalDate.of(2019, 4, 30);

    System.out.println(date.isAfter(reiwa) ? "TBD" : "Heisei" );

  }
}
