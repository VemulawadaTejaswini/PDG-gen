import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
    main.show();
  }

  int n;
  int k;
  int[] p;
  int ans;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      k = sc.nextInt();
      p = new int[n];
      for (int i = 0; i < n; i++) p[i] = sc.nextInt();
    } finally {
      sc.close();
    }
  }
  
  void solve() {
    Arrays.sort(p);
    for (int i = 0; i < k; i++) ans += p[i];
  }

  void show() {
    System.out.println(ans);
  }
}
