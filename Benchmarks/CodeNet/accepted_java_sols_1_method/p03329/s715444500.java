import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = n;
    for(int i = 0; i <= n; i++) {
      int j = n - i;
      int s = i;
      int t = j;
      int p = 0;
      while(s > 0) {
        p += (s % 6);
        s /= 6;
      }
      while(t > 0) {
        p += (t % 9);
        t /= 9;         
      }
      ans = Math.min(ans, p);
    }
    System.out.println(ans);
  }
}