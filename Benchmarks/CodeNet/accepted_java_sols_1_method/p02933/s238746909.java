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
    int judge = sc.nextInt();
    String color = sc.next();

    if (judge >= 3200) {
      System.out.println(color);
    } else {
      System.out.println("red");
    }
  }

}
