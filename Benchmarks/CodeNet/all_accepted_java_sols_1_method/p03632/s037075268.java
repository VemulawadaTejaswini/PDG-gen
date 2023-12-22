import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    sc.close();

    int start = Math.max(A, C);
    int end = Math.min(B, D);
    int ans = end - start;
    if (ans < 0) {
      ans = 0;
    }
    System.out.println(ans);
  }
}