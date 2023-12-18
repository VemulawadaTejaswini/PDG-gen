import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();

    long d = 100;
    int count = 0;

    while (true) {
      if (d >= x) {
        System.out.println(count);
        break;
      }
      d += d*0.01;
      count++;
    }

  }

}
