import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    while (true) {
      int H = stdin.nextInt();
      int W = stdin.nextInt();
      if (H == 0 && W == 0) {
        break;
      }

      StringBuilder rect = new StringBuilder();
      for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
          if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
            rect.append("#");
          } else {
            rect.append(".");
          }
        }
        rect.append("\n");
      }

      System.out.println(rect);
    }
  }

}