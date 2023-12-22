import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long p1 = 0;
    long p2 = 0;
    long[] a = new long[n];
    long[] b = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    for(int i = 0; i < n; i++) {
      b[i] = sc.nextLong();
    }
    for(int i = 0; i < n; i++) {
      if(a[i] >= b[i]) {
        p2 += (a[i] - b[i]);
      } else {
        p1 += ((b[i] - a[i]) / 2);
      }
    }
    String ans = "No";
    if(p1 >= p2) ans = "Yes";
    System.out.println(ans);
  }
}