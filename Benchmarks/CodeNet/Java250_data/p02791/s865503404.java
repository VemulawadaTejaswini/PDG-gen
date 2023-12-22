import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    int m = 1000000;
    for(int i = 0; i < n; i++) {
      int p = sc.nextInt();
      m = Math.min(m, p);
      if(p == m) ans++;
    }
    System.out.println(ans);
  }
}

