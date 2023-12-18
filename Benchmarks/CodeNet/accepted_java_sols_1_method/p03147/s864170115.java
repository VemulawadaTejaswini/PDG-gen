import java.util.*;
 
public class Main {
  static int n;
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int[] h = new int[n];
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
          h[i] = sc.nextInt();
      }
      int ans = 0;
      int active = 0;
      for (int i = 0; i < n; i++) {
        if (active >= h[i]) {
          active = h[i];
        } else {
          ans += h[i] - active;
          active = h[i];
        }
      }
      System.out.println(ans);
    }
}