import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    for (int i = 1; true; ++i) {
      int x = in.nextInt();
      int y = in.nextInt();
      if      (x == 0 && y == 0) break;
      else if (x < y) System.out.println(x + "  "+ y);
      else            System.out.println(y + "  "+ x);
    }
  }
}