import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    int _a = 0;
    int _b = 0;
    int _c = 0;

    if (a < b) {
      if (b < c) {
        _a = a; _b = b; _c = c;
      } else {
        if (a < c) {
          _a = a; _b = c; _c = b;
        } else {
          _a = c; _b = a; _c = b;
        }
      }
    } else {
      if (a < c) {
        _a = b; _b = a; _c = c;
      } else {
        if (b < c) {
          _a = b; _b = c; _c = a;
        } else {
          _a = c; _b = b; _c = a;
        }
      }
    }

    System.out.println(_a + " " + _b + " " + _c);
  }
}