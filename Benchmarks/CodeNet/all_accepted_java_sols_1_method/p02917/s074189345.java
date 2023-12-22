import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] b = new int[n + 5];

    for (int i = 0; i < n - 1; i++) {
      b[i] = sc.nextInt();
    }

    int res = 0;
    for (int i = 0; i < n; i++) {
      if (i == 0) res += b[i];
      else if (i == n - 1) res += b[i - 1];
      else res += Math.min(b[i], b[i - 1]);
    }

    System.out.println(res);
  }
}
