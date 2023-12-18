import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      int n = sc.nextInt();
      int l = sc.nextInt();
      int r = sc.nextInt();
      if (n == 0) return;
      int a[] = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = sc.nextInt();

      int count = 0;
      for (int x = l; x <= r; x++) {
        for (int i = 1; i <= n; i++) {
          if (x % a[i-1] == 0) {
            if (i % 2 == 1) {
              count++;
              break;
            }
            else break;
          }
          else if (i == n) {
            if (n % 2 == 0) count++;
          }
        }
      }
      System.out.println(count);
    }
  }
}

