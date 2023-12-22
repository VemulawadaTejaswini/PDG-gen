import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] a = new int[n];

    long sum = 0;

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      sum += a[i];
    }

    int count = 0;
    double k = (double)1/(4*m);

    for (int i = 0; i < n; i++) {
      if (a[i] >= k*sum) {
        count++;
      }
      if (count == m) {
        System.out.println("Yes");
        return;
      }
    }

    System.out.println("No");



  }

}
