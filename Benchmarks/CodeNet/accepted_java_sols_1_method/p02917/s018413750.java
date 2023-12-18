import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n-1];

    int[] a = new int[n];

    for (int i = 0; i < n-1; i++) {
      b[i] = sc.nextInt();
    }

    a[0] = b[0];

    for (int i = 0; i < n-1; i++) {
      if (a[i] > b[i]) {
        a[i] = b[i];
      }
      a[i+1] = b[i];
    }

    int sum = 0;

    for (int i = 0; i < n; i++) {
      sum += a[i];
    }

    System.out.println(sum);
    
  }

}
