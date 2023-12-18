// ITP1_10_C Standard_Deviation
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         double sum = 0;
         double sumx = 0;
         double ave = 0;

         while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            String[] input = br.readLine().split(" ");
            double[] s = new double[n];

            for (int i = 0; i < n; i++) {
               s[i] = Double.parseDouble(input[i]);
               sum += s[i];
            }

            ave = sum / n;

            for (int j = 0; j < n; j++) {
               sumx += Math.pow(s[j] - ave, 2) / n;
            }

            System.out.println(Math.sqrt(sumx));
         }
      }

      catch (Exception e) {
         e.printStackTrace();
      }
   }
}