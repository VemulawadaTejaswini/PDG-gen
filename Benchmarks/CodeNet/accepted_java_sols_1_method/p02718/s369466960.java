import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double M = sc.nextInt();
    double sum = 0;
    int ans = 0;
    double x = (4 * M);
    int A[] = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
      sum = sum + A[i];
    }
    double y = sum / x;
    for (int i = 0; i < N; i++) {
      if (A[i] >= y) {
        ans++;
      }
    }

    if (ans >= M) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}