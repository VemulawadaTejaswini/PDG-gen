import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] heights = new long[n];
    for (int i = 0; i < n; i++) {
      heights[i] = sc.nextLong();
    }
    long ans = 0;
    for (int j = 0; j < n - 1; j++) {
      if (heights[j] <= heights[j + 1]) continue;
      ans += heights[j] - heights[j + 1];
      heights[j + 1] = heights[j];
    }
    System.out.println(ans);
  }
}
