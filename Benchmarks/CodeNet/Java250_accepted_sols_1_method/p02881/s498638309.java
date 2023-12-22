import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    // a*b = nを満たすなかで、a+bが最小のものを選び、そこから-2する

    long min = n;
    long x = 1, y = 1;
    for (long i = 1; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {

        if (min > i + (n / i)) {
          x = i;
          y = (n / i);
          min = x + y;
        }
      }
    }
    if (x == 1 || y == 1) {
      System.out.println(min - 1);
    } else {
      System.out.println(min - 2);
    }
  }
}
