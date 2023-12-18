import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    long total = 0;
    for (long i = k; i <= n + 1; i++) {
      total += i * n - i * (i - 1) + 1;
    }

    System.out.println(total % ((int)Math.pow(10, 9) + 7));
  }
}
