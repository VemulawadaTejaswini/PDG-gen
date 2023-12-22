import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }

  int n;
  int m;
  int p[];
  String s[];
  int ac[];
  int wa[];

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      m = sc.nextInt();
      p = new int[m];
      s = new String[m];

      for (int i = 0; i < m; i++) {
        p[i] = sc.nextInt() - 1;
        s[i] = sc.next();
      }
      ac = new int[n];
      wa = new int[n];
    } finally {
      sc.close();
    }
  }

  void solve() {
    update();
    int a = good();
    int b = bad();
    System.out.printf("%d %d\n", a, b);
  }

  void update() {
    for (int i = 0; i < m; i++) {
      if (s[i].equals("WA") && ac[p[i]] == 0) wa[p[i]]++;
      if (s[i].equals("AC")) ac[p[i]]++;
    }
  }

  int good() {
    int ans = 0;
    for (int i = 0; i < n; i++) if (ac[i] > 0) ans++;
    return ans;
  }

  int bad() {
    int ans = 0;
    for (int i = 0; i < n; i++) if (ac[i] > 0) ans += wa[i];
    return ans;
  }

}
