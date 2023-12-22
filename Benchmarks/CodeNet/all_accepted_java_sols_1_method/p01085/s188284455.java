import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int m = sc.nextInt();
      int Nmin = sc.nextInt();
      int Nmax = sc.nextInt();
      int a[] = new int[m+1];
      int gap = 0;
      int gap_n = 0;
      if (m == 0 && Nmin == 0 && Nmax == 0) return;

      for (int i = 1; i <= m; i++) {
        a[i] = sc.nextInt();
      }
      for (int i = Nmin; i <= Nmax; i++) {
        int g = a[i]-a[i+1];
        if (gap <= g) {
          gap = g;
          gap_n = i;
        }
      }
      System.out.println(gap_n);
    }
  }
}

