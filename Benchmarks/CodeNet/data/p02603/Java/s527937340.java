
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    ArrayList<Integer> p = new ArrayList<Integer>();
    ArrayList<Integer> q = new ArrayList<Integer>();
    p.add(0);
    for(int i = 1; i < n; i++) {
      if(a[i] < a[i - 1]) {
        q.add(i - 1);
        p.add(i);
      }
    }
    q.add(n - 1);
    long ans = 1000;
    long kabu = 0;
    for(int i = 0; i < p.size(); i++) {
      long a1 = a[p.get(i)];
      long t = (ans / a1);
      kabu += t;
      ans -= (a1 * t);
      long a2 = a[q.get(i)];
      ans += (a2 * kabu);
      kabu = 0;
    }
    System.out.println(ans);
  }
}
