import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), X = sc.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) L[i] = sc.nextInt();

    int ans = 1;
    for (int i = 0, sum = 0; i < N; i++) {
      sum += L[i];
      if (sum <= X) ans++;
      else break;
    }
    System.out.println(ans);
  }
}