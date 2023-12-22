import java.io.*;

public class Main {
   public static void main(String[] args) {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      try {
      int count = 0;
      String line = reader.readLine();
      for (int i = 0; i < 3; i++) {
         char c = line.charAt(i);
         if (c == 'o') {
            count ++;
         }
      }
      System.out.println(700 + 100 * count);
      } catch (IOException e) {
         System.out.println(e);
      }
   }
}