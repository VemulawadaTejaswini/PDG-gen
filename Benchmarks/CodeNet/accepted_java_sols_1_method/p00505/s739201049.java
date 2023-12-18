import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ctr_rt = 0;
      int ctr_ac = 0;
      int ctr_ob = 0;
      boolean loop = true;
      while(loop && sc.hasNext()) {
         String[] input = sc.nextLine().split(" ");
         int[] temp = new int[3];
         
         temp[0] = Integer.parseInt(input[0]);
         temp[1] = Integer.parseInt(input[1]);
         temp[2] = Integer.parseInt(input[2]);
         
         Arrays.sort(temp);
         
         int a = temp[0];
         int b = temp[1];
         int c = temp[2];
         
         
         if (c >= a + b ) {
            int total = ctr_rt + ctr_ac + ctr_ob;
            System.out.println(total + " " +
                         ctr_rt + " " +
                         ctr_ac + " " +
                         ctr_ob);
            loop = false;
            break;
         } else if(c * c == a * a + b * b) {
            ctr_rt ++;
         } else if (c * c > a * a + b * b) {
            ctr_ob ++;
         } else {
            ctr_ac ++;
         }
      }
      
   }
}
