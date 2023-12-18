import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();

      System.out.println(gcd(a, b) + " " + lcm(a, b));
    }
  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
  }

  static int gcd(int a, int b) {
    if (a < b) swap(a, b);

    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }

    return a;
  }

  static int lcm(int a, int b) {
    return a / gcd(a, b) * b;
  }
}