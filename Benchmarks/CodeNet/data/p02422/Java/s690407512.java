// ITP1_9_D Transformation
import java.io.*;

class Main {

   static String str;

   public static void main(String args[]) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         str = br.readLine();
         int q = Integer.parseInt(br.readLine());
         for (int i = 0; i < q; i++) {
            String[] inst = br.readLine().split(" ");
            int a = Integer.parseInt(inst[1]);
            int b = Integer.parseInt(inst[2]);
            if (inst[0].equals("print"))  print(a, b);
            else if (inst[0].equals("reverse")) reverse(a, b);
            else if (inst[0].equals("replace")) replace(a, b, inst[3]);
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }

   static void print(int a, int b) {
      System.out.println(str.substring(a, b + 1));
   }

   static void reverse(int a, int b) {
      str = str.substring(0, a) + new StringBuffer(str.substring(a, b + 1)).reverse().toString() + str.substring(b + 1);
   }

   static void replace(int a, int b, String p) {
      str = str.replaceAll(str.substring(a, b + 1), p); 
   }
}