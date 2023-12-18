import java.util.*;

public class Main {

  private static void solve(int L, int R, int d) {
    int res = 0;
    for (int i = L; i <= R; i++) {
      if (i % d == 0) {
        res++;
      }
    }
    System.out.println(res);
  }

  public static void main(String[] args) {
    int L = scanner.nextInt();
    int R = scanner.nextInt();
    int d = scanner.nextInt();
    solve(L, R, d);
  }

  private static final Scanner scanner = new Scanner(System.in);
}
