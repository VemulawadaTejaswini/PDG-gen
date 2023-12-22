import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H, W;

    for (int i = 0;; i++) {
      H = sc.nextInt();
      W = sc.nextInt();
      if (H == 0 && W == 0) break;
      for (int h = 0; h < H; h++) {
        if (0 < h && h < H - 1) {
          System.out.printf("#");
          for (int w = 2; w < W; w++) {
            System.out.printf(".");
          }
          System.out.printf("#");
        } else {
          for (int w = 0; w < W; w++) {
            System.out.printf("#");
          }
        }
        System.out.printf("\n");
      }
      System.out.printf("\n");
    }

    sc.close();
  }
}

