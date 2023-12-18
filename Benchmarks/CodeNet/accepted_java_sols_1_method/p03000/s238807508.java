
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
    int n = Integer.parseInt(sc.next());
    long x = Long.parseLong(sc.next());
    int d = 0;

    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(sc.next());
    }


    int resultNum = 1;
    for (int i = 0; i < n; i++) {
      d += numbers[i];
      if (d <= x) {
        resultNum++;
      } else {
        break;
      }
    }
    System.out.println(resultNum);
  }
}
