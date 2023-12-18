import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    c = c * (int)Math.pow(2, k);
    for (int i = 0; i <= k; i++) {
      if (a < b && b < c) {
        System.out.println("Yes");
        break;
      }
      if (i == k) {
        System.out.println("No");
        break;
      }
      b *= 2;
      c /= 2;
    }
  }
}
