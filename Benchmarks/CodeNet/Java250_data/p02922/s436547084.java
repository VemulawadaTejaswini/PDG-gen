import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    if (B == 1) System.out.println(0);
    else System.out.println((B - 2) / (A - 1) + 1);
  }
}
