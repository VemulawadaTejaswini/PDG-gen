import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(calcDebt(n));
  }

  static int calcDebt(int a) {
    int debt = 100000;

    for (int i = 0; i < a; i++) {
      debt *= 1.05;
      debt = (int)Math.ceil((debt / 1000.0)) * 1000;
    }

    return debt;
  }
}