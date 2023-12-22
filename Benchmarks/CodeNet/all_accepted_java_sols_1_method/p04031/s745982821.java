import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int min = Integer.MAX_VALUE;
    for (int i = -100; i <= 100; i++) {
      int cost = 0;
      for (int j = 0; j < n; j++) {
        cost += (a[j] - i) * (a[j] - i);
      }
      if (cost < min) {
        min = cost;
      }
    }
    System.out.println(min);
  }
}