import java.util.Scanner;

public class Main {
  static int n, p = 0;
  static int[] a;
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    a = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        a[i] = scanner.nextInt();
    }
    scanner.close();

    for (int i = 1; i <= n; i++) {
        if (i == a[a[i]]) {
            p++;
            a[a[i]] = 0;
        }
    }

    System.out.println(p);
  }
}