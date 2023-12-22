import java.util.Arrays;
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

    Arrays.sort(numbers);

    if (numbers[numbers.length / 2] == numbers[(numbers.length / 2) - 1]) {
      System.out.println(0);
    } else {
      System.out.println(numbers[numbers.length / 2] - numbers[(numbers.length / 2) - 1]);
    }

  }

}
