import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = 1, b = 1;

    while ((a = scanner.nextInt()) != 0 || (b = scanner.nextInt()) != 0) {
      for (int i = 0; i < a; ++i) {
        for (int j = 0; j < b; ++j) System.out.printf("#");
        System.out.println();
      }
      System.out.println();
    }
  }
}
