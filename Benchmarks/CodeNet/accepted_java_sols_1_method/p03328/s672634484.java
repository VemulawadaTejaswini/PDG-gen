import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int t = b - a - 1;
    int ans = -a;

    for (int i = 1; i <= t; i++) {
      ans += i;
    }

    System.out.println(ans);

  }
}