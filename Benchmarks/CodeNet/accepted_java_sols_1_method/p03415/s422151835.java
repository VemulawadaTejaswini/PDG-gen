import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String A = scanner.nextLine();
    String B = scanner.nextLine();
    String C = scanner.nextLine();

   System.out.printf("%c%c%c\n", A.charAt(0), B.charAt(1), C.charAt(2));
  }

}