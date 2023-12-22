import java.util.*;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    boolean[] sunukes = new boolean[n];
    for (int i = 0; i < k; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        sunukes[sc.nextInt() - 1] = true;
      }
    }
    int ans = 0;
    for (boolean hasSweets : sunukes) {
      if (hasSweets) continue;
      ans++;
    }
    System.out.println(ans);
  }
}
