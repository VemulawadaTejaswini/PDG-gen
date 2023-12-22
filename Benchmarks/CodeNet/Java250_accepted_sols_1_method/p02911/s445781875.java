import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long k = sc.nextLong();
    int q = sc.nextInt();
    long[] p = new long[n];
    for(int i = 0; i < n; i++) {
      p[i] = k - (long)q;
    }
    for(int i = 0; i < q; i++) {
      int a = sc.nextInt();
      p[a - 1]++;
    }
    for(int i = 0; i < n; i++) {
      String ans = "No";
      if(p[i] > 0) ans = "Yes";
      System.out.println(ans);
    }
  }
}