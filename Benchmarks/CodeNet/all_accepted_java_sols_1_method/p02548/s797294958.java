import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 0;
    int[] a = new int[n + 1];

    for (int i = 1; i < n; i++) {
      for (int j = 1; (i * j) < n; j++) {
        a[i * j]++;
      }
    }

    for (int i = 1; i <= n; i++) {
      ans += a[i];
    }

    System.out.println(ans);

  }
}