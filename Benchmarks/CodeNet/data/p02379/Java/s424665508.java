// ITP1_10_D
import java.io.*;

class Main {

   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         String[] input = br.readLine().split(" ");
         double x1 = Double.parseDouble(input[0]);
         double y1 = Double.parseDouble(input[1]);
         double x2 = Double.parseDouble(input[2]);
         double y2 = Double.parseDouble(input[3]);
         double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
         System.out.println(distance);
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}