import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    boolean allEven = true;
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      allEven &= a % 2 == 0;
    }
    if (allEven) System.out.println("second");
    else System.out.println("first");
  }
}
