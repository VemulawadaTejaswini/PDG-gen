import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    String ans = "No";
    for(int i = 0; i <= n; i++) {
      for(int j = 0; j <= m; j++) {
        if(((n - i) * j + (m - j) * i) == k) {
          ans = "Yes";
          break;
        }
      }
    }
    System.out.println(ans);
  }
}