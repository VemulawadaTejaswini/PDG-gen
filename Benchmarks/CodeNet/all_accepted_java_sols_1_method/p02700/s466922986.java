import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    int takahashiKaisu = c / b;
    if (c % b != 0) {
      takahashiKaisu++;
    }

    int aokiKaisu = a / d;
    if (a % d != 0) {
      aokiKaisu++;
    }

    System.out.println(takahashiKaisu <= aokiKaisu ? "Yes" : "No");

  }
}
