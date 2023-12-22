import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] p = new int[n];
    int ans = 0;
    for(int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }
    Arrays.sort(p);
    for(int i = 0; i < (n - 1); i++) {
      ans += p[i];
    }
    ans += (p[n - 1] / 2);
    System.out.println(ans);
  }
}