import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long[] sa = new long[n + 1];
    long sum = 0;
    long[] ab = new long[n + 1];
    sa[0] = a[0];
    sa[n] = (-1) * a[n - 1];
    ab[0] = Math.abs(sa[0]);
    ab[n] = Math.abs(sa[n]);
    sum = ab[0] + ab[n];
    for(int i = 1; i < n; i++) {
      sa[i] = a[i] - a[i - 1];
      ab[i] = Math.abs(sa[i]);
      sum += ab[i];
    }
    for(int i = 0; i < n; i++) {
      long t = sum - ab[i] - ab[i + 1];
      t += (Math.abs(sa[i + 1] + sa[i]));
      System.out.println(t);
    }
  }
}