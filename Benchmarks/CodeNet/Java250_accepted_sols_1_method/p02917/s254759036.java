import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n - 1];
    int ans = 0;

    for (int i = 0; i < (n - 1); i++) {
      b[i] = sc.nextInt();
    }

    for (int i = 0; i < (n - 2); i++) {
      ans += Math.min(b[i], b[i + 1]);
    }

    ans += b[0];
    ans += b[n - 2];

    System.out.println(ans);

  }
}