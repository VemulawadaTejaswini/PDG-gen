import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long MOD = 1000000007;

    int[] color = new int[3];
    long out = 1;
    while (N-- > 0){
      int n = sc.nextInt();
      int p = 0;
      for (int i = 0; i < 3; i++) {
        if (color[i] == n) {
          p++;
          if (p == 1) color[i]++;
        }
      }
      out *= p;
      out %= MOD;
    }
    System.out.println(out);
  }
}
