import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args ){

    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age == 1){
      System.out.println("Hello World");
      return;
    }
    int A = sc.nextInt();
    int B = sc.nextInt();

    System.out.println(A + B);
  }
}
