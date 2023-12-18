import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int count;
    int max = 0;
    int r = 0;

    for (int i = n; i > 0; i--) {
      count = 0;
      int k = i;
      while (k%2 == 0) {
        k /= 2;
        count++;
      }
      max = Math.max(max,count);
      if (max == count) {
        r = i;
      }
    }

    System.out.println(r);

  }

}
