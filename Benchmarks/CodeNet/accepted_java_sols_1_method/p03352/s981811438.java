
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();

    if ( X == 1 ) {
      System.out.println(1);
      System.exit(0);
    }

    int max = 0;
    for (int i = 2; i <= X; i++) {
      for ( int j = 2; j <= 1000; j++ ) {
          int b = (int)Math.pow((int)i, (int)j);
          if ( b > X) {
            break;
          }
          if ( b > max ) {
            max = b;
          }
      }
    }
    System.out.println(max);
  }

}
