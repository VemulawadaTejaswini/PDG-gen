import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();
    int ans = x;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = ((d - 1) / a) + 1;
      ans += b;
    }
    System.out.println(ans);
  }
}