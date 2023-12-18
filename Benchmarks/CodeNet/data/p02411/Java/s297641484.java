// ITP1_7_A Grading
import java.io.*;

public class Main {

   public static void main(String[] args) {
      int m = 0, f = 0, r = 0;
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         while (true){
            String[] strAry = br.readLine().split(" ");
            m = Integer.parseInt(strAry[0]);
            f = Integer.parseInt(strAry[1]);
            r = Integer.parseInt(strAry[2]);

            if (m == -1 && f == -1 && r == -1)  break;

            System.out.printf("%s\n", judge(m, f, r));
         }
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }

   private static String judge(int m, int f, int r) {
      if ((m == -1 || f == -1) || m + f < 30)
         return "F";
      else if (m + f < 50) {
         if (r >= 50)
            return "C";
         else
            return "D";
      }
      else if (m + f < 65)
         return "C";
      else if (m + f < 80)
         return "B";
      else
         return "A";
   }
}