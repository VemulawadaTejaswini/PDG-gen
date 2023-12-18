import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();

    if (h == 1 || w == 1) {
      System.out.println(1);
      return;
    }

    long n = h*w % 2;

    if (n == 0) {
      System.out.println(h*w/2);
    } else {
      System.out.println(h*w/2+n);
    }
  }
}
