import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int M = sc.nextInt();
    int[] a = new int[A];
    int[] b = new int[B];
    int[] x = new int[M];
    int[] y = new int[M];
    int[] c = new int[M];
    for (int i = 0; i < A; i++) a[i] = sc.nextInt();
    for (int i = 0; i < B; i++) b[i] = sc.nextInt();
    for (int i = 0; i < M; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    sc.close();

    int minA = Integer.MAX_VALUE;
    for (int p : a)
      minA = Math.min(minA, p);
    int minB = Integer.MAX_VALUE;
    for (int p : b)
      minB = Math.min(minB, p);

    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < M; i++) {
      int p = a[x[i] - 1] + b[y[i] - 1] - c[i];
      ans = Math.min(ans,p);
    }

    ans = Math.min(ans, minA + minB);
    System.out.println(ans);
  }
}
