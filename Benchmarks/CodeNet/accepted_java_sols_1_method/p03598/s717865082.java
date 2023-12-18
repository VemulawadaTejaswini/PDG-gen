import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int ans = 0;
    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      ans += Math.min(2*x, 2*Math.abs(K-x));
    }
    
    System.out.println(ans);
  }
}