import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int H = Integer.parseInt(sc.next());
      int W = Integer.parseInt(sc.next());
      while (H != 0 && W != 0) {
         if (H > 300 || W > 300) break;
         for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
               System.out.print("#");
            }
            System.out.println();
         }
         System.out.println();
         H = Integer.parseInt(sc.next());
         W = Integer.parseInt(sc.next());
      }
   }
}