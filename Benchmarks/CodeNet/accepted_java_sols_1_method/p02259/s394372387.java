import java.util.*;

public class Main {
   public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int[] arr = new int[n];
      String[] input = sc.nextLine().split(" ");
      for(int i = 0; i < n; i ++) {
         arr[i] = Integer.parseInt(input[i]);
      }
      
      int counter = 0;
      boolean comp = false;
      while(!comp) {
         comp = true;
         for(int i = n-1; i >= 1; i --) {
            if(arr[i-1] > arr[i]) {
               int temp = arr[i];
               arr[i] = arr[i-1];
               arr[i-1] = temp;
               comp = false;
               counter ++;
            }
         }
      }
      
      for(int i = 0; i < n; i ++) {
         System.out.print(arr[i]);
         if(i != n-1) {
            System.out.print(" ");
         }
      }
      System.out.println("\n" + counter);
   }
}
