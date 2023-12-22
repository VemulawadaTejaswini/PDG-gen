// ITP1_8_B Sum of Numbers
import java.io.*;

class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str = br.readLine();
         char[] x = str.toCharArray();
         while (x[0] != '0') {
            int i = 0;
            int sum = 0;

            while (i < x.length) {
               sum += x[i++] - '0';
            }

            System.out.println(sum);
            str = br.readLine();
            x = str.toCharArray();
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}