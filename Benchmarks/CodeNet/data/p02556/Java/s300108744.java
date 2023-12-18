import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int xPlusYMax = Integer.MIN_VALUE;
    int xPlusYMin = Integer.MAX_VALUE;
    int xMinusYMax = Integer.MIN_VALUE;
    int xMinusYMin = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      xPlusYMax = Math.max(xPlusYMax, x + y);
      xPlusYMin = Math.min(xPlusYMin, x + y);
      xMinusYMax = Math.max(xMinusYMax, x - y);
      xMinusYMin = Math.min(xMinusYMin, x - y);
    }
    int ans = Math.max(xPlusYMax - xPlusYMin, xMinusYMax - xMinusYMin);
    System.out.println(ans);
  }
}
