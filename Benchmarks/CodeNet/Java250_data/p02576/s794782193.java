import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    int ans = 0;
    ans += n / x;
    if (n % x != 0) {
      ans++;
    }
    System.out.println(ans * t);
    sc.close();
  }
}
