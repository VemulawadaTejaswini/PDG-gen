import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    int ans = 0;
    int p = 0;
    for(int i = 0; i < (n - 1); i++) {
      if(h[i] >= h[i + 1]) {
        p++;
      } else {
        ans = Math.max(ans, p);
        p = 0;
      }
    }
    ans = Math.max(ans, p);
    System.out.println(ans);
  }
}