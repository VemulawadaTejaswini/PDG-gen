import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) P[i] = sc.nextInt();
    int ans = 0;
    for (int i = 1; i + 1 < N; i++) {
      if (P[i] > P[i - 1] && P[i] < P[i + 1] || P[i] < P[i - 1] && P[i] > P[i + 1]) ans++;
    }
    System.out.println(ans);
  }
}