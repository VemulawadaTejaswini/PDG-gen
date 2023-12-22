import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.err.println("コインの数");
    int A, B, C, X;
    do{
      do {
        System.err.print("500円玉：");
        A = stdIn.nextInt();
      } while (A < 0 || A > 50);
      do {
        System.err.print("100円玉：");
        B = stdIn.nextInt();
      } while (B < 0 || B > 50);
      do {
        System.err.print(" 50円玉：");
        C = stdIn.nextInt();
      } while (C < 0 || C > 50);
    } while (A + B + C == 0);

    do {
      System.err.print("X円にする：");
      X = stdIn.nextInt();
    } while (X < 50 || X > 20000);

    int count = 0; int sum = 0;
    for (int i = 0; i <= A ; i++) {
      int a = 500 * i;
      sum = a;
      if (sum > X) {
        break;
      } else if (sum == X) {
        count++;
        break;
      }

      for (int j = 0; j <= B ; j++) {
        int b = 100 * j;
        sum = a + b;
        if (sum > X) {
          break;
        } else if (sum == X) {
          count++;
          break;
        }

        for (int k = 0; k <= C ; k++) {
          int c = 50 * k;
          sum = a + b + c;
          if (sum > X) {
            break;
          } else if (sum == X) {
            count++;
            break;
          }
        }
      }
    }

  System.out.println(count);
  }
}
