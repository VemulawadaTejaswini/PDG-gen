import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final var scanner = new Scanner(System.in);
    final var S = scanner.nextInt();

    switch (S % 10) {
      case 3:
        System.out.println("bon");
        break;
      case 0:
      case 1:
      case 6:
      case 8:
        System.out.println("pon");
        break;
      default:
        System.out.println("hon");
        break;
    }
  }
}
