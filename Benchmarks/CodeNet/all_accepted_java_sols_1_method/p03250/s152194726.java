import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    final int ans;
    if (A >= B && A >= C) {
      ans = A*10 + B + C;
    } else if (B >= A && B >= C) {
      ans = B*10 + C + A;
    } else {
      ans = C*10 + A + B;
    }

    System.out.println(ans);
  }
}