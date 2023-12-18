import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    for (int i = 0; i < k; i++) {
      if (a>b) {
        b*=2;
      } else if (b>c) {
        c*=2;
      }
      if(a<b && b<c) {
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");

  }

}
