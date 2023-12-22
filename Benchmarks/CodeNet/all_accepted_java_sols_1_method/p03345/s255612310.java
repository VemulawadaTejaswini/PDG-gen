import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    long K = scanner.nextLong();
    if (K % 2 == 0) {
      System.out.println(A - B);
    } else {
      System.out.println(B - A);
    }
  }
}
