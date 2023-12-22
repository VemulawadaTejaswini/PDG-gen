// ITP1_8_C Counting Characters
import java.io.*;

class Main {

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      try {
         String str;
         int[] alphabet = new int[26];
         while ((str = br.readLine()) != null) {
            if (str.equals(""))
               break;
            str = str.toLowerCase();
            char[] ch = str.toCharArray();
            for (char c: ch) {
               if ('a' <= c && c <= 'z'){
                  alphabet[c - 'a']++;
               }
            }
         }

         for (int i = 0; i < alphabet.length; i++) {
            System.out.println((char)('a' + i) + " : " + alphabet[i]);
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}