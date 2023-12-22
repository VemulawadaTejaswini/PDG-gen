
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
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    

    if (6 <= a && a <= 12) {
      b /= 2;
    }
    else if (a <=5) {
      b = 0;
    }

    System.out.println(b);
    
  }

}
