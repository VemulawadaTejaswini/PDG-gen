import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] t = new int[N + 1];
    int[] x = new int[N + 1];
    int[] y = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      t[i] = sc.nextInt();
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    boolean flag = true;
    for (int i = 1; i <= N; i++) {
      int dt = t[i] - t[i - 1];
      int dist = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
      if (dt < dist) {
        flag = false;
      }
      if (dt % 2 != dist % 2) {
        flag = false;
      }
    }
    if (flag) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}