import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    boolean flag = false;
    if (X == 7 || X == 5 || X == 3){
      flag = true;
    }

    System.out.println(flag ? "YES" : "NO");
  }
}
