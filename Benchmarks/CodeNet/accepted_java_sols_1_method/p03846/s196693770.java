import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int[] line = new int[N];
    for (int i = N - 1; i > 0; i -= 2) {
      line[i]++;
      line[i]++;
    }
    if (N % 2 == 1) {
      line[0]++;
    }
    int[] line2 = new int[N];
    for (int i = 0; i < N; i++) {
      line2[A[i]]++;
    }
    for (int i = 0; i < N; i++) {
      if (line[i] != line2[i]) {
        System.out.println(0);
        return;
      }
    }
    long ans = 1;
    for (int i = 0; i < N / 2; i++) {
      ans *= 2;
      ans %= 1000000007;
    }
    System.out.println(ans);
  }
}