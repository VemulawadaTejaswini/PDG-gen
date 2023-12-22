import java.util.*;

class Reader {
  Scanner sc = new Scanner(System.in);

  public int ini() {
    return sc.nextInt();
  }

  public int[] vi(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    return a;
  }
}

public class Main extends Reader {
  public static void main(String[] args) {
    Main main = new Main();
    main.show(main.solve());
  }

  int x;
  int n;
  int[] a;

  public Main() {
    x = ini();
    n = ini();
    a = vi(n);
  }
  
  int solve() {
    int ans = 0;
    int mini = x;
    int cnt[] = new int[102];
    for (int i = 0; i < n; i++) cnt[a[i]] = 1;
    for (int i = 0; i <= 101; i++) {
      if (cnt[i] != 0) continue;
      int dist = Math.abs(i - x);
      if (dist < mini) {
        mini = dist;
        ans = i;
      }
    }
    return ans;
  }

  int calc(int left, int right) {
    int ans = 0;
    for (int i = left; i <= right; i++) {
      ans += i;
    }
    return ans;
  }

  void show(int ans) {
    System.out.println(ans);
  }
}
