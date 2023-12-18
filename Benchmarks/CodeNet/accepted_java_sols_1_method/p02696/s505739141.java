import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long n = sc.nextLong();

    long x;

    if (b <= n) {
      x = b - 1;
    } else {
      x = n;
    }

    long ret1 = a * x / b;
    long ret2 = x / b;
    long ret3 = ret1 - a * ret2;

    System.out.println(ret3);

  }
}
