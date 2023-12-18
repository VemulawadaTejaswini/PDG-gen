import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    int odd = 0;
    for (int i = 0; i < N; i++) {
      if (sc.nextInt()%2 == 1) odd++;
    }
    long ans = 1;
    while (N > 0) {
      ans *= 2;
      N--;
    }
    if (odd == 0) {
      System.out.println(P == 1 ? 0 : ans);
    } else {
      System.out.println(ans/2);
    }
  }
}
