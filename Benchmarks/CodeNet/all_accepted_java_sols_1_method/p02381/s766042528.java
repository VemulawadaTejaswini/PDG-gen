import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    while (true) {

      int n = scan.nextInt();

      if (n == 0) {
        break;
      }

      long sum = 0;
      long sqsum = 0;

      for (int i = 0; i < n; i++) {
        int tmp = scan.nextInt();
        sum += tmp;
        sqsum += Math.pow(tmp, 2);
      }

      double ave = 1.0 * sum / n;
      double sqave = 1.0 * sqsum / n;

      System.out.println(Math.sqrt(sqave - Math.pow(ave, 2)));

    }

  }

}
