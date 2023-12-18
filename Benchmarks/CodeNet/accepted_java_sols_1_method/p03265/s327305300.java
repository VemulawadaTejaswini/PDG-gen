import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int x1 = in.nextInt();
      int y1 = in.nextInt();
      int x2 = in.nextInt();
      int y2 = in.nextInt();
      int xDiff = x2 - x1;
      int yDiff = y2 - y1;

      System.out.printf("%d %d %d %d\n", x2 - yDiff, y2 + xDiff, x1 - yDiff, y1 + xDiff);
    }
  }
}