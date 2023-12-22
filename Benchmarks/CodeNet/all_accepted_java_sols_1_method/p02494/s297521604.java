import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

loop:
    while(true) {
      int h = sc.nextInt();
      int w = sc.nextInt();

      if(w == 0 && h == 0) {
        break loop;
      }

      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          System.out.print("#");
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }
  }
}