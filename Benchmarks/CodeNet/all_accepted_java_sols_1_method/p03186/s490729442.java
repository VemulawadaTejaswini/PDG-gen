import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int ans = 0;
    int ac_min = Math.min(A, C);
    ans += ac_min;
    A -= ac_min;
    C -= ac_min;
    int bc_min = Math.min(B, C);
    ans += (2 * bc_min);
    B -= bc_min;
    C -= bc_min;
    if (B > 0) {
      ans += B;
    }
    if (C > 0) {
      ans++;
    }
    System.out.println(ans);
  }
}