import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }

    Arrays.sort(x);

    long ans = 1000000000;

    for (int i = x[0]; i <= x[n-1]; i++) {
      long sum = 0;
      for (int j = 0; j < n; j++) {
        sum += (i-x[j])*(i-x[j]);
      }
      ans = Math.min(ans,sum);
    }

    System.out.println(ans);

  }

}
