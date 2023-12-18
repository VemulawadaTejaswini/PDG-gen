import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int a, ans;
    Scanner sc = new Scanner(System.in);

    a = sc.nextInt();
    sc.close();
    ans = a + a * a + a * a * a;
    System.out.printf("%d", ans);
  }
}