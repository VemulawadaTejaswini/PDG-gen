import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] spot = new int[n + 2];
    spot[0] = 0;
    spot[n + 1] = 0;
    int totalPrice = 0;
    for (int i = 1; i <= n; i++) {
      spot[i] = sc.nextInt();
      totalPrice += Math.abs(spot[i] - spot[i - 1]);
    }
    totalPrice += Math.abs(spot[n]);
    for (int i = 1; i <= n; i++) {
      int delta = Math.abs(spot[i - 1] - spot[i + 1]) - Math.abs(spot[i] - spot[i - 1]) - Math.abs(spot[i + 1] - spot[i]);
      System.out.println(totalPrice + delta);
    }
   
   
  }
}