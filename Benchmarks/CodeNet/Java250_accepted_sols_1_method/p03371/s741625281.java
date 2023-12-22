import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();

    sc.close(); 

    long sum = 0;

    if ((C * 2) <= (A + B)) {
      if (X < Y) {
        sum += C * 2 * X;
        if (C * 2 < B) {
          sum += C * (Y - X) * 2;
        } else {
          sum += B * (Y - X);
        }
      } else {
        sum += C * 2 * Y;
        if (C * 2 < A) {
          sum += C * (X - Y) * 2;
        } else {
          sum += A * (X - Y);
        }
      }
    } else {
      sum += X * A;
      sum += Y * B;
    }

    System.out.println(sum);
  
  }

}