import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int mi = 200001, ans = 0;
    for (int i = 0; i < N; i++) {
      int P = sc.nextInt();
      if (P < mi) {
        ans++;
        mi = P;
      }
    }
    System.out.println(ans);
  }
}