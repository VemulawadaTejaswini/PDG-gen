import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    int maxVal = Math.max(A, B);
    int result = 0;
    if (C > maxVal) {
      result = C * 10 + A + B;
    } else {
      result = maxVal * 10 + C + Math.min(A, B);
    }

    System.out.println(result);
  }
}
