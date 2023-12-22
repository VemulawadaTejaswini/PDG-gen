import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
    }
    int ans = (N - 1) / (K - 1);
    if ((N - 1) % (K - 1) != 0) {
      ans += 1;
    }
    System.out.println(ans);
  }
}
