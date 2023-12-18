import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int c = 0;

    for (int i = 0; i <= n-3; i++) {
      String k = s.substring(i,i+3);
      if (k.equals("ABC")) {
        c++;
      }
    }

    System.out.println(c);

  }

}
