import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(true) {
      int H = in.nextInt();
      int W = in.nextInt();

      if (H == 0 && W == 0) break;
      
      for (int j = 0; j < W; j++) {
        System.out.print("#");
      }
      System.out.println("");

      for (int i = 1; i < H - 1; i++) {
        System.out.print("#");
        for (int j = 1; j < W - 1; j++) {
          System.out.print(".");
        }
        System.out.println("#");
      }

      for (int j = 0; j < W; j++) {
        System.out.print("#");
      }
      System.out.println("");
      System.out.println();
    }
  }
}