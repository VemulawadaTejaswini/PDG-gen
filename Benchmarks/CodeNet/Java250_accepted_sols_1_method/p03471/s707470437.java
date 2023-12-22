import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = b = c = -1;
    int n = sc.nextInt();
    int y = sc.nextInt();
    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= (n - i); j++) {
        int tmpA = i;
        int tmpB = j;
        int tmpC = n - i - j;
        if (10000 * tmpA + 5000 * tmpB + 1000 * tmpC == y) {
          a = tmpA;
          b = tmpB;
          c = tmpC;
        }
      }
    }

    System.out.println(a + " " + b + " " + c);
    sc.close();
  }
}