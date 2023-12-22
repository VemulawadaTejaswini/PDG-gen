import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < m; i++) {
      a[sc.nextInt()] = 1;
    }

    int c1 = 0;
    int c2 = 0;

    for (int i = x; i < n; i++) {
      if (a[i] == 1) {
        c1++;
      }
    }

    for (int i = x; i > 0; i--) {
      if (a[i] == 1) {
        c2++;
      }
    }

    System.out.println(Math.min(c1,c2));
  }

}
