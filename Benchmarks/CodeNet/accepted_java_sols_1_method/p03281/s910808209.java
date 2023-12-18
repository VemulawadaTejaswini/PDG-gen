import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int b = 0;
    for (int i = 1; i <= n; i++) {
      int a = 0;
      for (int j = 1; j <= i; j++) {
        if (i % 2 == 1 && i % j == 0) {
          a++;
        }
      }
      if (a == 8) {
        b++;
      }
    }
    System.out.println(b);
  }
}
