import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    Arrays.sort(h);
    int ans = h[n - 1] - h[0];
    for(int i = 0; i < (n - k + 1); i++) { 
      ans = Math.min(ans, h[i + k - 1] - h[i]);
    }
    System.out.println(ans);
  }
}