import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] h = new int[n];

    h[0] = sc.nextInt();
    int max = h[0];
    for (int i = 1; i < n; ++i) {
      h[i] = sc.nextInt();
      max = (h[i] > max) ? h[i] : max;

      if (h[i] <= max - 2) {
        System.out.println("No");
        System.exit(0);
      }
    }

    System.out.println("Yes");
  }
}