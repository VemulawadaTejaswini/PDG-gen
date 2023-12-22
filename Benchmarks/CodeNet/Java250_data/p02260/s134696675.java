import java.util.*;

public class Main {
   public static void main(String [] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      int[] arr = new int[n];
      int counter = 0;
      int minIndex;
      
      String[] input = sc.nextLine().split(" ");
      for(int i = 0; i < n; i ++) {
         arr[i] = Integer.parseInt(input[i]);
      }
      
      for(int i = 0; i < n; i ++) {
         minIndex = i;
         for(int j = i; j < n; j ++) {
            if(arr[j] < arr[minIndex]) {
               minIndex = j;
            }
         }
         int temp = arr[minIndex];
         arr[minIndex] = arr[i];
         arr[i] = temp;
         if(minIndex != i) {
            counter ++;
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

