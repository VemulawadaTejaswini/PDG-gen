import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] buf = new int[3];

    for ( int i = 0; i < buf.length; i++ ) {
      buf[i] = num % 10;
      num /= 10;
    }
    for ( int b : buf ) {
      if ( b == 7 ) {
        System.out.println("Yes");
        System.exit(0);
      }
    }
    System.out.println("No");
  }
}
