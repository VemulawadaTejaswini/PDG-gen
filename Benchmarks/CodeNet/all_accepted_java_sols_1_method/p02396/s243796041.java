import java.io.*;

class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int x = Integer.valueOf(br.readLine()).intValue();
      int i = 1;
      while (x != 0) {
         System.out.println("Case " + i + ": " + x);
         i++;
         x = Integer.valueOf(br.readLine()).intValue();
      }
   }
}