import java.util.*;
public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    
    int ans;
    if (L > 0) {
      ans = sum(2, N, L);
    } else if (L+N-1 < 0) {
      ans = sum(1, N-1, L);
    } else {
      ans = sum(1, N, L);
    }
    
    System.out.println(ans);
  }
  
  private static int sum(int start, int end, int L) {
    int ret = 0;
    for (int i = start; i <= end; i++) {
      ret += L+i-1;
    }
    return ret;
  }
}
