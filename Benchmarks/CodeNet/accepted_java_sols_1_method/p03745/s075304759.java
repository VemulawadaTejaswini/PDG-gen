import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int state = 0;
    int ans = 0;
    int prev = 0;
    for (int i = 0; i < N; i++) {
      int A = sc.nextInt();
      if (i == 0) {
        ans++;
      } else {
        if (state == 0) {
          if (prev < A) {
            state = 1;
          } else if (prev > A) {
            state = -1;
          }
        } else if (state > 0) {
          if (prev > A) {
            state = 0;
            ans++;
          }
        } else {
          if (prev < A) {
            state = 0;
            ans++;
          }
        }
      }
      prev = A;
    }
    System.out.println(ans);
  }
}