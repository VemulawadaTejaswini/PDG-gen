import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int M = in.nextInt();
      int D = in.nextInt();
      int count = 0;

      for (int m = 1; m <= M; ++m) {
        for (int d = 1; d <= D; ++d) {
          int d1 = d % 10;
          int d10 = d / 10;

          if (d1 >= 2 && d10 >= 2 && d1 * d10 == m) {
            ++count;
          }
        }
      }
      
      System.out.println(count);
    }
  }
}