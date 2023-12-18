import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int H = sc.nextInt();
    // int W = sc.nextInt();
    int[] H;
    int[] W;
    int num = 0;
    H = new int[300];
    W = new int[300];
    for (int i = 0; i < 300; i++) {
      H[i] = sc.nextInt();
      W[i] = sc.nextInt();
      if (H[i] == 0 && W[i] == 0) {
        num = i;
        break;
      }
    }
    for (int k = 0; k < num; k++) {
      for (int i = 0; i < W[k]; i++) {
        System.out.printf("#");
      }
      System.out.printf("\n");
      for (int i = 0; i < H[k] - 2; i++) {
        System.out.printf("#");
        for (int j = 0; j < W[k] - 2; j++) {
          System.out.printf(".");
        }
        System.out.printf("#");
        System.out.printf("\n");
      }
      for (int i = 0; i < W[k]; i++) {
        System.out.printf("#");
      }
      System.out.printf("\n");
      System.out.printf("\n");
    }
  }
}
