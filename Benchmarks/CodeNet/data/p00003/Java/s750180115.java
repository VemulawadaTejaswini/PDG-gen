import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if (isTriangle(a, b, c)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  static boolean isTriangle(int a, int b, int c) {
    if (a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
      return true;
    } else {
      return false;
    }
  }
}