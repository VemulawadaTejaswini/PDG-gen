
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int result = -1;

    for (int i = 1; i <= 1010; i++) {
      if ((int) (i * 0.08) == a && (int) (i * 0.1) == b) {
        result = i;
        break;
      }
    }
    System.out.println(result);
  }
}
