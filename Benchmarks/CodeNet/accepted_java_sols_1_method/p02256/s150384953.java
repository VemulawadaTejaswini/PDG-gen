import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int x = stdIn.nextInt();
    int y = stdIn.nextInt();

    if (x < y) {
      int t = x;
      x = y;
      y = t;
    }
    x = x % y;

    while (x != 0) {
      int t = x;
      x = y;
      y = t;
      x = x % y;
    }

    System.out.println(y);
  }
}