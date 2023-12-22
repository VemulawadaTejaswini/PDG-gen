import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int K = scan.nextInt();
    int X = scan.nextInt();

    int max = X + K - 1;
    int sa = max - X;
    if (max > 1000000) {
      max = 1000000;
    }
    int min = X - sa;
    if (min < -1000000) {
      min = -1000000;
    }

    for (int i = min; X > i; i++) {
      System.out.print(i + " ");
    }
    for (int i = X; i < max; i++) {
      System.out.print(i + " ");
    }
    System.out.print(max);

  }

}
