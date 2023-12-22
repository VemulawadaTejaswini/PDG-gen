import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    for (int i = 1; i <= 3; i++) {
      if (A == i || B == i) continue;
      System.out.println(i);
      return;
    }
  }
}
