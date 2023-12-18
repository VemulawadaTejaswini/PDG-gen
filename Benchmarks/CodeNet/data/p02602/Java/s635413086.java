import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    long[] a = new long[n+1];

    for (int i = 1; i < n+1; i++) {
      a[i] = sc.nextLong();
    }

    long[] t = new long[n-k+1];
    for (int i = 0; i < n-k+1; i++) {
      t[i] = 1;
    }

    for (int i = k; i < n+1; i++) {
      for (int j = i; j > i-k; j--) {
        t[i-k] *= a[j];
      }
    }

    for (int i = 0; i < n-k; i++) {
      if (t[i] < t[i+1]) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }

}
