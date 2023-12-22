// ALDS1_1_B Greatest Common Divisor
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         String[] input = br.readLine().split(" ");
         int x = Integer.parseInt(input[0]);
         int y = Integer.parseInt(input[1]);
         System.out.println(gcd(x, y));
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static int gcd(int x, int y) {
      int r;
      if (x <= y) swap(x, y);
      while (y > 0) {
         r = x % y;
         x = y;
         y = r;
      }
      return x;
   }
   static void swap(int x, int y) {
      int work;
      work = x;
      x = y;
      y = work;
   }
}