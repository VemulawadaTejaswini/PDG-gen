// ITP1_9_B Shuffle
import java.io.*;

class Main {

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         String cards = br.readLine();
         while (!(cards.equals("-"))) {
            int m = Integer.parseInt(br.readLine());
            for (int i = 0; i < m; i++) {
               int h = Integer.parseInt(br.readLine());
               String left = cards.substring(0, h);
               String right = cards.substring(h,cards.length());
               cards = right + left;
            }
            System.out.println(cards);
            cards = br.readLine();
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}