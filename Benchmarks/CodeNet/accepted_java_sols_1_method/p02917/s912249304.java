import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] B = new int[N-1];
    for (int i = 0; i < N-1; i++) {
      B[i] = sc.nextInt();
    }
    
    int ans = B[N-2];
    for (int i = N-3; i >=0; i--) {
      ans += Math.min(B[i], B[i+1]);
    }
    ans += B[0];
    
    System.out.println(ans);
  }
}