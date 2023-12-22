import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int A = in.nextInt();
      int B = in.nextInt();
      int C = in.nextInt();

      if (A - B >= C) {
        System.out.println(0);
      } else {
        System.out.println(C - (A - B));
      }
    }
  }
}