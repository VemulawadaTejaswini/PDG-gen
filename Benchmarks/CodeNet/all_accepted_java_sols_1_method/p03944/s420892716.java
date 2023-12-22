import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    sc.nextLine();
    int[] x = new int[n];
    int[] y = new int[n];
    int[] a = new int[n];

    for (int i = 0; i < n; ++i) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a[i] = sc.nextInt();
      sc.nextLine();
    }

    int d = 0, u = h, r = 0, l = w;
    for (int i = 0; i < n; ++i) {
      switch (a[i]) {
        case 1:
          r = (r < x[i] ? x[i] : r);
          break;
        case 2:
          l = (l > x[i] ? x[i] : l);
          break;
        case 3:
          d = (d < y[i] ? y[i] : d);
          break;
        case 4:
          u = (u > y[i] ? y[i] : u);
          break;
      }
      if (r >= l || d >= u) {
        System.out.println("0");
        return;
      }
    }
    System.out.println((l - r) * (u - d));
  }
}
