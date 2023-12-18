import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int x = in.nextInt();
    for (int i = 3; i <= x; i++) {
      if (i % 3 == 0) {
        System.out.print(" " + i);
      }
      else {
        while (true) {
          if (i % 10 == 3) {
            System.out.print(" " + i);
            break;
          }
          else if (i % 10 < 10) {
            break;
          }
          i /= 10;
        }
      }
    }
    System.out.println();
  }
}