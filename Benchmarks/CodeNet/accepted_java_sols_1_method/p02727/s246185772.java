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

    Arrays.parallelSort(p);
    Arrays.parallelSort(q);

    int[] xyc = new int[X + Y + C];
    System.arraycopy(p, A - X, xyc, 0, X);
    System.arraycopy(q, B - Y, xyc, X, Y);
    System.arraycopy(r, 0, xyc, X + Y, C);
    Arrays.parallelSort(xyc);

    long ans = 0;
    for (int i = C; i < X + Y + C; i++) ans += xyc[i];

    System.out.println(ans);
  }
}