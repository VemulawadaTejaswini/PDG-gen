import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      int n = in.nextInt();
      int x = in.nextInt();

      if (n == 0 && x == 0) break;

      int count = 0;
      for (int i = 1; i < (double)x / 3; i++) {
        for (int j = i + 1; j < (double)(x - i) / 2; j++) {
          if (x - (i + j) > n) {
            continue;
          }
          else {
            count += (x - i - 2 * j + 1) / 2;
            break;
          }
        }
      }
      System.out.println(count);
    }
  }
}