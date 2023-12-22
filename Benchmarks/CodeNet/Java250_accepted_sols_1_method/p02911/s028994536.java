import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();
    int[] a = new int[n];
    Arrays.fill(a, k - q);

    for (int i = 0; i < q; i++) {
      int c = sc.nextInt();
      a[c - 1]++;
    }

    for (int i = 0; i < n; i++) {
      if (a[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }

  }
}