import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int x = 0;
    int max = 0;

    char[] c = s.toCharArray();

    for (int i = 0; i < n; i++) {
      if (c[i] == 'I') {
        x++;
      } else if (c[i] == 'D') {
        x--;
      }

      max = Math.max(max,x);

    }

    System.out.println(max);
    
  }

}
