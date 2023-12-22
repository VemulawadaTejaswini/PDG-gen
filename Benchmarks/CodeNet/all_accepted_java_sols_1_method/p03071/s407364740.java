import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int large = Math.max(A, B);
      int small = Math.min(A, B);
      int X = large--;

      if (large < small) {
          X += small;
      } else {
          X += large;
      }

      System.out.println(X);
    }
  }
}