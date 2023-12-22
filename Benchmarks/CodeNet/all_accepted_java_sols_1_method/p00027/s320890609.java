import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

  private static final String[] WEEEK_NAME = {
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
      "Sunday"
  };

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (scanner.hasNext()) {
        final int month = scanner.nextInt();
        final int day = scanner.nextInt();
        if (month == 0 && day == 0) {
          return;
        }
        final DayOfWeek dayOfWeek = LocalDate.of(2004, month, day).getDayOfWeek();
        System.out.println(WEEEK_NAME[dayOfWeek.ordinal()]);
      }
    }
  }
}