import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String aString = sc.next();
    String bString = sc.next();
    String cString = sc.next();

    int i = 0;
    int j = 0;
    int k = 0;

    char now = 'a';

    while (true) {
      if (now == 'a') {
        if (i == aString.length()) {
          System.out.println("A");
          return;
        }
        now = aString.charAt(i);
        i++;
      } else if (now == 'b') {
        if (j == bString.length()) {
          System.out.println("B");
          return;
        }
        now = bString.charAt(j);
        j++;
      } else if (now == 'c') {
        if (k == cString.length()) {
          System.out.println("C");
          return;
        }
        now = cString.charAt(k);
        k++;
      }
    }


  }

}
