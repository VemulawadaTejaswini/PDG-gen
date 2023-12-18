import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int h, w;

    while(true) {
      h = sc.nextInt();
      w = sc.nextInt();

      if(h == 0 && w == 0) {
        break;
      }

      for(int y = 0; y < h; y++) {
        for(int x = 0; x < w; x++) {
          if((x + y) % 2 == 0) {
            System.out.print("#");
          } else {
            System.out.print(".");
          }
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }
  }
}