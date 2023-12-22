import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    while (N > 0) {
      if (N % 10 == 7) {
        System.out.println("Yes");
        return;
      }
      N /= 10;
    }
    System.out.println("No");
  }
}
