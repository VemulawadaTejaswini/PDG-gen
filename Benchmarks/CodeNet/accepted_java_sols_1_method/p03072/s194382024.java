import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int ans = 1;
    int max = sc.nextInt();

    for (int i = 1; i < n; i++) {
      int h = sc.nextInt();
      if (h >= max) {
        ans++;
        max = h;
      }
    }

    System.out.println(ans);

  }
}