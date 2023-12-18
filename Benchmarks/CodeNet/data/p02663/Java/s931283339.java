import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h1 = sc.nextInt();
    int m1 = sc.nextInt();
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();
    int k = sc.nextInt();

    int a = 60 * h2 + m2;
    int b = 60 * h1 + m1;

    if (a-b < k) {
      System.out.println(0);
    } else {
      System.out.println(a-b-k);
    }
  }

}
