import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = 0;
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      if(a == (p + 1)) {
        p++;
      }
    }
    int ans = n - p;
    if(ans == n) ans = -1;
    System.out.println(ans);
  }
}
