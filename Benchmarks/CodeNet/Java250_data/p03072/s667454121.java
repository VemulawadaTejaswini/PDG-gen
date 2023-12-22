import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] H = new int[N+1];
    for (int i = 1; i <= N; i++) {
      H[i] = sc.nextInt();
    }
    
    int ans = 1;
    for (int i = 2; i <= N; i++) {
      if (canSee(H, i)) {
        ans++;
      }
    }
    
    System.out.println(ans);
  }
  
  private static boolean canSee(int[] H, int i) {

    for (int j = 1; j <= i-1; j++) {
      if (H[i] < H[j]) {
        return false;
      }
    }
    
    return true;
  }
}