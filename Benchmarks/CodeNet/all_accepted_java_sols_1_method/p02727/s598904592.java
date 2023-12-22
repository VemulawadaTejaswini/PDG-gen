import java.math.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int[] p = new int[A];
    int[] q = new int[B];
    int[] r = new int[C];
    for (int i = 0; i < A; i++) p[i] = sc.nextInt();
    for (int i = 0; i < B; i++) q[i] = sc.nextInt();
    for (int i = 0; i < C; i++) r[i] = sc.nextInt();
    sc.close();

    Arrays.sort(p);
    Arrays.sort(q);
    Arrays.sort(r);

    int[] xy = new int[X + Y];
    for (int i = 0; i < X; i++) xy[i] = p[A - i - 1];
    for (int i = 0; i < Y; i++) xy[X + i] = q[B - i - 1];
    Arrays.sort(xy);

    long ans = 0;
    for (int i = 0; i < X + Y; i++)
      ans += Integer.max(xy[i],
          - 1 < (C - 1 - i) ? r[C - 1 - i] : 0);

    System.out.println(ans);
  }
}
