import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) {
      P[i] = sc.nextInt();
    }
    int ans1 = 0;
    int ans2 = 0;
    int ans3 = 0;
    for (int i = 0; i < N; i++) {
      if (P[i] <= A) {
        ans1++;
      }
      if (A + 1 <= P[i] && P[i] <= B) {
        ans2++;
      }
      if (B + 1 <= P[i]) {
        ans3++;
      }
    }
    System.out.println(Math.min(Math.min(ans1, ans2), ans3));
  }
}