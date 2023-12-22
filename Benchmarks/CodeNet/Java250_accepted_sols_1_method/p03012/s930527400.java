import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] w = new int[n];
    int l = 0;
    int r = 0;
    int ans = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++) {
      w[i] = sc.nextInt();
      r += w[i];
    }

    r -= w[0];
    l += w[0];

    for (int i = 1; i < n; i++) {
      ans = Math.min(ans, Math.abs(l - r));
      r -= w[i];
      l += w[i];
    }

    System.out.println(ans);

  }
}