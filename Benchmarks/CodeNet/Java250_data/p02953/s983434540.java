import java.util.Scanner;

public class Main {
  private static void solve(int n, int[] h) {
    h[0]--;
    for (int i = 1; i < n; i++) {
      if (h[i - 1] > h[i]) {
        System.out.println("No");
        return;
      }
      h[i] = Math.max(h[i - 1], h[i] - 1);
    }
    System.out.println("Yes");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] hs = sc.nextLine().split(" ");
    sc.close();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = Integer.parseInt(hs[i]);
    }
    solve(n, h);
  }
}