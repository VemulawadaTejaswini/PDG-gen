import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double sum = 0;

    for (int i = 0; i < n; i++) {
      sum += (1.0 / sc.nextInt());
    }
    System.out.println((1 / sum));
  }

}
