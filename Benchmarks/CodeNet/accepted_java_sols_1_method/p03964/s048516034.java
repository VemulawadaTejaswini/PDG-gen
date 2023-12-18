import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] t = new long[n + 1];
    long[] a = new long[n + 1];
    t[0] = 1;
    a[0] = 1;
    for(int i = 1; i <= n; i++) {
      long T = sc.nextLong();
      long A = sc.nextLong();
      long i1 = (t[i - 1] + T - 1) / T;
      long i2 = (a[i - 1] + A - 1) / A;
      long ii = Math.max(i1, i2);
      t[i] = T * ii;
      a[i] = A * ii; 
    }
    System.out.println(t[n] + a[n]);
  }
}