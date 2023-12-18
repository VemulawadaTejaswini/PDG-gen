import java.util.*;
import java.util.stream.*;

public class Main {
  public static int MOD = 1_000_000_007;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt(), X = in.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) {
      L[i] = in.nextInt();
    }
    int ans = 1, pos = 0;
    for (int i = 0; i < N; i++) {
      pos += L[i];
      if (X < pos) {
        break;
      }
      ans++;
    }
    System.out.println(ans);
  }
}
