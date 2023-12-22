import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }
    int ans = Integer.MAX_VALUE;
    for(int t = -100; t <= 100; t++) {
      int s = 0;
      for(int j = 0; j < n; j++) {
        s += ((x[j] - t) * (x[j] - t));
      }
      ans = Math.min(s, ans);
    }
    System.out.println(ans);
  }
}