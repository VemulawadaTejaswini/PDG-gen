
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
    int r = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());

    int xBefore = x;
    int xNext = 0;
    for (int i = 1; i <= 10; i++) {
      xNext = r * xBefore - d;
      System.out.println(xNext);
      xBefore = xNext;
    }
  }

}
