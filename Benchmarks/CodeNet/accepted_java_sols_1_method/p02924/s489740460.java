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
    long n = Integer.parseInt(sc.next());

    
    System.out.println(((n - 1) * n) / 2);

  }

}
