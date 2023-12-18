import java.math.*;
import java.util.*;
import java.util.stream.*;

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

    long ans = IntStream.concat(IntStream.concat(
        Arrays.stream(p).sorted().skip(A - X),
        Arrays.stream(q).sorted().skip(B - Y)),
        Arrays.stream(r))
      .sorted().skip(C)
      .asLongStream()
      .sum();

    System.out.println(ans);
  }
}