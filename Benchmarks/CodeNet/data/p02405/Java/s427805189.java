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
         for (int i = 0; i < H; i++) {
            if (i % 2 == 0) {
               for (int j = 0; j < W / 2; j++) {
                  System.out.print("#.");
                  if (W % 2 == 1)
                     System.out.print("#");
               }
            } else if (i % 2 == 1) {
               for (int j = 0; j < W / 2; j++) {
                  System.out.print(".#");
                  if (W % 2 == 1)
                     System.out.print(".");
               }
            }
            System.out.println();
         }
         System.out.println();
      }
   }
}