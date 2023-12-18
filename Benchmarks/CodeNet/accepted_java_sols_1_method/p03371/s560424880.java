import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int X = sc.nextInt();
      int Y = sc.nextInt();

      int cost = Integer.MAX_VALUE;
      // ABセット（C*2）の枚数に基づいてA,Bの枚数を求める。
      for (int i = 0; i <= 100000; i++) {
        int tmp = i * (2 * C) + Math.max(0, X - i) * A + Math.max(0, Y - i) * B;
        cost = Math.min(tmp, cost);
      }

      System.out.println(cost);
    }
  }
}
