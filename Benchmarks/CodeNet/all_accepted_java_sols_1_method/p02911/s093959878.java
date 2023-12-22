import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int q = sc.nextInt();

    int[] ps = new int[n];
    Arrays.fill(ps, k);

    for (int i = 0; i < q; i++) {
      int p = sc.nextInt();
      ps[p - 1]++;
    }

    for (int p : ps) {
      if (p - q > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}