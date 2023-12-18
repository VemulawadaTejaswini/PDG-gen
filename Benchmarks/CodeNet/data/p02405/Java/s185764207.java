// ITP1_5-C Print a Chessboard
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (true) {
         int H = Integer.parseInt(sc.next());
         int W = Integer.parseInt(sc.next());
         if (H > 300 || W > 300) break;
         if (H == 0 && W == 0)   break;
         for (int i = 1; i <= H; i++) {
            for (int j = 1; j <= W; j++) {
               if ((i + j) % 2 == 0) {
                  System.out.print("#");
               } else if ((i + j) % 2 == 1) {
                  System.out.print(".");
               }
            }
            System.out.println();
         }
         System.out.println();
      }
   }
}