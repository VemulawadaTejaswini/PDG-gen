import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      int N=0;
      int[] z;
      Scanner scanner = new Scanner(System.in);
      N = scanner.nextInt();
      z = new int[N];
      for (int i=0; i<N; i++) {
         z[i] = scanner.nextInt();
      }
      scanner.close();
      int max = -1;
      int count = 0;
      for (int i=0; i<N; i++) {
         if (z[i]>max) {
            //System.out.println(z[i]);
            max = z[i];
         }
      }
      for (int i=0; i<N; i++) {
         if (z[i] == max) {
            count++;
         }
      }
      int max2 = -1;
      for (int i=0; i<N; i++) {
         if (z[i] == max) {
            continue;
         } else if (z[i] > max2) {
            max2 = z[i];
         }
      }

      if (max2 == -1) {
         for (int i=0; i<N; i++) {
            System.out.println(max);
         }
      } else {
         for (int i=0; i<N; i++) {
            if (z[i] == max && count == 1) {
               System.out.println(max2);
            } else {
               System.out.println(max);
            }
         }
      }

   }
}
