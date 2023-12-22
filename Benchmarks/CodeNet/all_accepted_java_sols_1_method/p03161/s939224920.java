import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int[] height = new int[n];
    int[] cost = new int[n];
    Arrays.fill(cost, Integer.MAX_VALUE);
    cost[0] = 0;
    for(int i = 0; i < n; i++) height[i] = Integer.parseInt(sc.next());
    for(int i = 0; i < n; i++) {
      for(int j = 1; j <= k && i + j < n; j++) {
        cost[i+j] = Math.min(cost[i+j], cost[i] + Math.abs(height[i+j] - height[i]));
      }
    }
    System.out.println(cost[n-1]);
  }
}
