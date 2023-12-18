import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      final int start = scanner.nextInt();
      final int end   = scanner.nextInt();
      final int c     = scanner.nextInt();
      int counter = 0;
      for (int i = start; i <= end; i++) {
        if (c % i == 0) {
          counter++;
        }
      }
      System.out.println(counter);
    }
  }
}