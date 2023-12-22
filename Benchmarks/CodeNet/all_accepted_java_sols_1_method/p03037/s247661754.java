import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int x=0 ,y=0;
      int[][] z;
      Scanner scanner = new Scanner(System.in);
      x = scanner.nextInt();
      y = scanner.nextInt();
      z = new int[y][2];
      for (int i=0; i<y; i++) {
         for (int j=0; j<2; j++) {
            z[i][j] = scanner.nextInt();
         }
      }
      scanner.close();
      int sum = 0;
      int i,j;
      int maxz = 0;
      int minz = 100001;
         for (j=0; j<y; j++) {
            if (maxz < z[j][0]) {
               maxz = z[j][0];
            }
            if (minz > z[j][1]) {
               minz = z[j][1];
            }
      }
      if (minz-maxz > -1) {
         System.out.println(minz-maxz+1);
      } else {
         System.out.println(0);
      }
   }
}
