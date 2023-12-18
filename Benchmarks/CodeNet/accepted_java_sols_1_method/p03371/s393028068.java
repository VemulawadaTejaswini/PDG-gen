import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int C = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    int Y = Integer.parseInt(sc.next());

    int cost = 0;

    if (2 * C < A && 2 * C < B) {
      cost += 2 * C * Math.max(X, Y);
    } else if (2 * C < A) {
      cost += 2 * C * X;
      if (X < Y) {
        cost += B * (Y - X);
      }
    } else if (2 * C < B) {
      cost += 2 * C * Y;
      if (Y < X) {
        cost += A * (X - Y);
      }
    } else if (2 * C < A + B) {
      if (X > Y) {
        cost += 2 * C * Y + A * (X - Y);
      } else {
        cost += 2 * C * X + B * (Y - X);
      }
    } else {
      cost += A * X + B * Y;
    }

    System.out.println(cost);
  }

}