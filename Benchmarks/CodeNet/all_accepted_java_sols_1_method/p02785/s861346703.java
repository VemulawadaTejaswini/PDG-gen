import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    long[] h = new long[n];
    for (int i = 0; i < n; i++) {
      h[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(h);

    long ans = 0;
    for (int i = 0; i < n - k; i++) {
      ans += h[i];
    }

    System.out.println(ans);

  }
}
