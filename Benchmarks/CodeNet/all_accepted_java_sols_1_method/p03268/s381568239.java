import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    long k = N / K;
    if (K % 2 == 0) {
      if (N < K / 2) {
        System.out.println(0);
        return;
      }
      long l = (N - K / 2) / K + 1;
      System.out.println(k * k * k + l * l * l);
    } else {
      System.out.println(k * k * k);
    }
  }
}
