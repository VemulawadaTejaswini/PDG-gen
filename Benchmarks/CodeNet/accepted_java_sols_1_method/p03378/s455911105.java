import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int l = 0;
    int r = 0;
    for (int i = 0; i < m; i++) {
      int a = sc.nextInt();
      if (x >= a) {
        l += 1;
      } else {
        r += 1;
      }
    }
    System.out.println(Math.min(l, r));
  }
}
