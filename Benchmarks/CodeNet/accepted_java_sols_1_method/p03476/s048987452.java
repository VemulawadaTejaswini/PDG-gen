import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean[] p = new boolean[100000];
    p[0] = p[1] = true;
    for (int i = 2; i * 2 < p.length; i++) {
      if (!p[i]) {
        for (int j = 2; i * j < p.length; j++) {
          p[i * j] = true;
        }
      }
    }

    int[] ln = new int[100000];
    for (int i = 3; i < ln.length; i++) {
      if (!p[i] && !p[(i + 1) / 2]) {
        ln[i] = ln[i - 1] + 1;
      } else {
        ln[i] = ln[i - 1];
      }
    }

    int q = sc.nextInt();
    int ans[] = new int[q];
    for (int i = 0; i < q; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      ans[i] = ln[r] - ln[l - 1];
    }

    for (int i : ans) {
      System.out.println(i);
    }
  }
}
