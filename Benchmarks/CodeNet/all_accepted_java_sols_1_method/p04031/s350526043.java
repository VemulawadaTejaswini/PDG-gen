import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[2000];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int cost = 999999999;
    for (int i = -100; i <= 100; i++) {
      int k = 0;
      for (int j = 0; j < n; j++) {
        if (a[j] != i) k += (int)Math.pow(a[j] - i, 2);
      }
      cost = Math.min(cost, k);
    }

    System.out.println(cost);
  }
}