
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

    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(sc.next());
    }

    int count = 0;
    for (int i = 2; i < numbers.length; i++) {
      if (numbers[i] > numbers[i - 1] && numbers[i - 1] > numbers[i - 2]
          || numbers[i - 2] > numbers[i - 1] && numbers[i - 1] > numbers[i]) {
        count++;
      }
    }
    System.out.println(count);
  }

}
