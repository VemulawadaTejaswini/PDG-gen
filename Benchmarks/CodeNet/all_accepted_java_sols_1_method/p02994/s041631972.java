
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
    int l = Integer.parseInt(sc.next());
    
    
    int sum = 0;
    int min = Math.abs(1 + l - 1);
    for (int j = 1; j <= n; j++) {
      min = Math.min(Math.abs(j + l - 1), min);
      sum += j + l - 1;
    }
    if (sum < 0)
      System.out.println(sum + min);
    else
      System.out.println(sum - min);
  }

}
