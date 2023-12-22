import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int[] a = new int[n+1];

    for (int i = 1; i <= n; i++) {
      a[i] = k - q;
    }

    for (int i = 1; i <= q; i++) {
      int x = sc.nextInt();
      a[x]++;
    }

    for (int i = 1; i <= n; i++) {
      if (a[i] <= 0) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    }

  }

}
