import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int result = 0;
    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= n / i; j++) {
        if (i * j < n) {
          result++;
        }
      }
    }
    System.out.println(result);
  }
}
