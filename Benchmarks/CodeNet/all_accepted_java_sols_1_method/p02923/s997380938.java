
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
    int prev = Integer.parseInt(sc.next());
    int max = 0;
    int count = 0;
    for (int i = 1; i < n; i++) {
      int after = Integer.parseInt(sc.next());

      if (prev >= after) {
        count++;
      } else {
        count = 0;
      }
      max = Math.max(max, count);
      prev = after;
    }
    System.out.println(max);
  }
}
