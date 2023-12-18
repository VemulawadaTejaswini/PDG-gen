import java.util.Arrays;
import java.util.Scanner;

class Main {

  int n;
  int k;
  int[] t = new int[100000];

  public static void main(String[] args) {
    new Main().solve();
  }

  private int check(int maxLoad) {
    int i = 0;
    for (int j = 0; j < k; j++) {
      int s = 0;
      while (s + t[i] <= maxLoad) {
        s += t[i];
        i++;
        if (i == n) {
          return n;
        }
      }
    }
    return i;
  }

  public void solve() {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    for (int i = 0; i < n; i++) {
      t[i] = sc.nextInt();
    }
    int left = 0;
    int right = n * Arrays.stream(t).max().orElse(0);
    while (right - left > 1) {
      int mid = (left + right) / 2;
      int v = check(mid);
      if (v >= n) {
        right = mid;
      } else {
        left = mid;
      }
    }
    System.out.println(right);
  }
}
