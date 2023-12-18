// ITP1_8_C Counting Characters
import java.io.*;

class Main {

   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str;
         int[] al = new int[26];
         while ((str = br.readLine())!= null) {
            char[] ch = str.toCharArray();
            if (ch.length == 0)
               break;
            for (char c: ch) {
               if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                  al[c - 'a']++;
            }
         }
         for (int i = 0; i < al.length; i++) {
            System.out.println((char)('a' + i) + " : " + al[i]);
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}