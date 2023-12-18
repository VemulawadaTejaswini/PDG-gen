import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ctr_rt = 0;
      int ctr_ac = 0;
      int ctr_ob = 0;
      
      while(sc.hasNext()) {
         String[] input = sc.nextLine().split(" ");
         Arrays.sort(input);
         int a = Integer.parseInt(input[0]);
         int b = Integer.parseInt(input[1]);
         int c = Integer.parseInt(input[2]);
         
         if (c >= a + b ) {
            //
         } else if(c * c == a * a + b * b) {
            ctr_rt ++;
         } else if (c * c > a * a + b * b) {
            ctr_ob ++;
         } else {
            ctr_ac ++;
         }
      }
      int total = ctr_rt + ctr_ac + ctr_ob;
      System.out.println(total + " " +
                         ctr_rt + " " +
                         ctr_ac + " " +
                         ctr_ob + " ");
   }
}
