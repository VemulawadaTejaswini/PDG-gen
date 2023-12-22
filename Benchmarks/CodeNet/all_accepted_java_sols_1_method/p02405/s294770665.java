import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    int[][] a = new int [100000][2];
    int i = 0;
    while(true) {
      int h = stdIn.nextInt();
      int w = stdIn.nextInt();

      if (h == 0 && w == 0)
      break;
      a[i][0] = h;
      a[i++][1] = w;
    }

    for (int j = 0; j < i; j++) {
      for (int k = 0; k < a[j][0]; k++) {
        for (int l = 0; l < a[j][1]; l++) {
           if ((k+l)%2 == 0) {
             System.out.print("#");
           } else {
             System.out.print(".");
           }
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
