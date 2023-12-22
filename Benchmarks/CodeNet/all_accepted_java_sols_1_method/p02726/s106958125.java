import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    sc.close();

    int[] ans = new int[N];
    for (int i = 1; i < N + 1; i++)
      for (int j = i + 1; j < N + 1; j++)
        ans[Integer.min(j - i,
            Math.abs(X - i) + 1 + Math.abs(j - Y))]++;

    for (int i = 1; i < N; i++)
      System.out.println(ans[i]);
  }
}
