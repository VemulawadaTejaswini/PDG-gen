import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int[] c = new int[1000];
    int[] t = new int[1000];
    int mincost = 1001;
    for (int i = 0; i < N; i++) {
      c[i] = sc.nextInt();
      t[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      if (t[i] <= T && c[i] < mincost) {
        mincost = c[i];
      }
    }
    if (mincost >= 1001) {
      System.out.println("TLE");
    } else {
      System.out.println(mincost);
    }
  }
}