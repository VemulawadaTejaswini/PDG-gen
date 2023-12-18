import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int W = stdin.nextInt();
    int H = stdin.nextInt();
    int x = stdin.nextInt();
    int y = stdin.nextInt();
    int r = stdin.nextInt();

    if (x - r >= 0 && x + r <= W && y - r >= 0 && y + r <= H) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}