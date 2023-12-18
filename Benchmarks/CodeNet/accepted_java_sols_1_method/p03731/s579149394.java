import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    long T = Long.parseLong(sc.next());
    long[] t = new long[N];
    t[0] = Long.parseLong(sc.next());
    long total =0;
    for (int i =1; i<N; i++) {
      t[i] = Long.parseLong(sc.next());
      if (t[i] - t[i-1] <= T) {
        total += t[i] - t[i-1];
      } else {
        total += T;
      }
    }
    total += T;
    System.out.println(total);
  }
}