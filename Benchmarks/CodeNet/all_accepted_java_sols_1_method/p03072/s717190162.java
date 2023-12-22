import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] hset = new int[n];
      int i,j;
      int sum = 1;
      int count = 0;
      for (i = 0; i < n; i++) {
         hset[i] = sc.nextInt();
      }
      for (i=1; i < n; i++) {
         for (j=0; j<i; j++) {
            if (hset[j] <= hset[i]) {
               count = count + 1;
            }
         }
         if (count == i) {
            sum = sum + 1;
         }
         count = 0;
      }
      System.out.println(sum);
   }
}