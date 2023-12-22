import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int D = scanner.nextInt();
    System.out.print("Christmas");
    for (int i = 0; i < 25 - D; i++) {
      System.out.print(" Eve");
    }
    System.out.println();
  }
}
