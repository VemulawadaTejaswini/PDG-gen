import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    for (int i = 1; ; i++) {
      int k = a*i;
      if (k%b == c) {
        System.out.println("YES");
        return;
      }
      if ((k%b == a%b) && i > 1) {
        System.out.println("NO");
        return;
      }
    }


  }

}
