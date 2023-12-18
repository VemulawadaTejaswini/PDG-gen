import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      int x = i;
      if (x % 3 == 0) {
        System.out.print(" " + x);
      } else {
        while (x > 0) {
          if (x % 10 == 3) {
            System.out.print(" " + x);
          }
          x /= 10;
        }
      }
    }
  }
}

