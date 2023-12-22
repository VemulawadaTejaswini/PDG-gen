// ITP1_6_D Matrix Vector Multiplication
import java.io.*;

public class Main {
   public static void main(String[] args) {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String[] strAry1 = (br.readLine()).split(" ");
         int n = Integer.parseInt(strAry1[0]);
         int m = Integer.parseInt(strAry1[1]);
         int[][] A = new int[n][m];
         int[] b = new int[m];
         int[] c = new int[n];

         for (int i = 0; i < A.length; i++) {
            String[] strAry2 = (br.readLine()).split(" ");
            for (int j = 0; j < A[i].length; j++) {
               A[i][j] = Integer.parseInt(strAry2[j]);
            }
         }

         for (int i = 0; i < b.length; i++) {
            String str = br.readLine();
            b[i] = Integer.parseInt(str);
         }

         for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
               c[i] += A[i][j] * b[j];
            }
         }

         for (int result : c)
            System.out.printf("%d\n", result);
      }

      catch (Exception e) {
         System.err.println(e);
      }
   }
}