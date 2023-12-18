
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int count500 = x / 500;
    int count5 = (x % 500) /5;

    System.out.println(count5 * 5 + count500 * 1000);

   }
}
