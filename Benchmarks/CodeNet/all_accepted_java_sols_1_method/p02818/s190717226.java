import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long A = scanner.nextLong();
    long B = scanner.nextLong();
    long K = scanner.nextLong();

    long da = Math.min(A, K);
    A -= da;
    K -= da;
    long db = Math.min(B, K);
    B -= db;
    System.out.printf("%d %d\n", A, B);
  }
}
