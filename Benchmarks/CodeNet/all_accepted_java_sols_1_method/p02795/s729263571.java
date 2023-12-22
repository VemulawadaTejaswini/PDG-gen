import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int n = sc.nextInt();

    int max = Math.max(h,w);
    int min = Math.min(h,w);
    int count = 0;

    for (int i = 1; i <= min; i++) {
      count++;
      if (i*max >= n) {
        break;
      }
    }

    System.out.println(count);

  }

}
