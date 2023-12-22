import java.util.*;

public class Main {
  public static void main(final String[] args) throws Exception {
    final Scanner scanner = new Scanner(System.in);
    try {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      if (a <= 8 && b <= 8) {
        System.out.println("Yay!");
      } else {
        System.out.println(":(");
      }
    } finally {
      scanner.close();
    }
  }
}
