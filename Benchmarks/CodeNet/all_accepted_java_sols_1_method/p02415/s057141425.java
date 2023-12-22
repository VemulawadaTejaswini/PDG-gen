// ITP1_8_A Toggling Cases
import java.io.*;

class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         char[] c = br.readLine().toCharArray();
         for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z')
               c[i] = Character.toLowerCase(c[i]);
            else if (c[i] >= 'a' && c[i] <= 'z')
               c[i] = Character.toUpperCase(c[i]);
         }

         System.out.println(String.valueOf(c));
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}