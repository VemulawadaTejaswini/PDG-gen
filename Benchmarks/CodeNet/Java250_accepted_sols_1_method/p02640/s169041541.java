
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    // y = (Y-2X)/2
    // x = (4X - Y)/2
    if( ( (y - 2 * x ) % 2) == 0 && ((4 * x - y ) % 2) == 0 ) {
      if( ( (y - 2 * x ) / 2) >= 0 && ((4 * x - y ) / 2) >= 0) {
        System.out.println("Yes");
      }else {
        System.out.println("No");
      }
    }else {
      System.out.println("No");
    }
  }

}
