// ALDS1_1_D Maximum Profit
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {
         int n = Integer.parseInt(br.readLine());
         int[] R = new int[n];
         for (int i = 0; i < n; i++) {
            R[i] = Integer.parseInt(br.readLine());
         }
         System.out.println(max(R, n));
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static int max(int[] R, int n) {
      int maxv = Integer.MIN_VALUE;
      int minv = R[0];
      for (int j = 1; j < n; j++) {
         maxv = maxv > R[j] - minv ? maxv : R[j] - minv;
         minv = minv < R[j] ? minv : R[j];
      }
      return maxv;
   }
}