// ITP1_6_B Finding Missing Cards
import java.io.*;

public class Main {
   private static boolean[][] cards = new boolean[4][13];
   private static String[] suit = {"S", "H", "C", "D"};

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         if (n <= 52 && n >= 0) {
            for (int i = 0; i < n; i++) {
               String str[] = (br.readLine()).split(" ");

               if (str[0].equals(suit[0]))
                  cards[0][Integer.parseInt(str[1]) - 1] = true;
               else if (str[0].equals(suit[1]))
                  cards[1][Integer.parseInt(str[1]) - 1] = true;
               else if (str[0].equals(suit[2]))
                  cards[2][Integer.parseInt(str[1]) - 1] = true;
               else if (str[0].equals(suit[3]))
                  cards[3][Integer.parseInt(str[1]) - 1] = true;
               else
                  System.exit(1);
            }

            for (int i = 0; i < 4; i++) {
               for (int j = 0; j < 13; j++) {
                  if (cards[i][j] == false)
                     System.out.printf("%s %d\n", suit[i], j + 1);
               }
            }
         }
      }
      catch (Exception e) {
         System.out.println(e);
      }
   }
}