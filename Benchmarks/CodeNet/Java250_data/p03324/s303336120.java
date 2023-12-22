import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int D = scanner.nextInt();
    int N = scanner.nextInt();
    long res = 1;
    for (int i = 0; i < D; i++) res *= 100;
    if (N == 100) N++;
    System.out.println(res * N);
  }
}
