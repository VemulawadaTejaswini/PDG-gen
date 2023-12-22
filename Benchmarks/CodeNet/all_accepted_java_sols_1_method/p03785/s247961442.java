import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    int[] T = new int[N];
    for (int i = 0; i < N; i++) {
      T[i] = sc.nextInt();
    }
    Arrays.sort(T);
    int ans = 0;
    int end = 0;
    int carry = 0;
    for (int i = 0; i < N; i++) {
      if (T[i] > end || carry >= C) {
        ans++;
        end = T[i]+K;
        carry = 0;
      }
      carry++;
    }
    System.out.println(ans);
  }
}