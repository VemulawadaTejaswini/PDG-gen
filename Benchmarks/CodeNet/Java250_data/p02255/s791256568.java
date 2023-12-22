import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int size = Integer.parseInt(sc.nextLine());
      int[] arr = new int[size];
      
      String[] input = sc.nextLine().split(" ");
      
      for(int i = 0; i < size; i ++) {
         arr[i] = Integer.parseInt(input[i]);
      }
      printArray(arr);
      
      for(int i = 1; i < size; i ++) {
         int key = arr[i];
         int index = i - 1;
         
         while (index >= 0 && arr[index] > key) {
            arr[index + 1] = arr[index];
            index --;
         }
         
         arr[index + 1] = key;
         printArray(arr);
      }
   }//main
   public static void printArray(int[] arr) {
      for(int i = 0; i < arr.length; i ++) {
         System.out.print(arr[i]);
         if(i != arr.length - 1) {
            System.out.print(" ");
         } else {
            System.out.println();
         }
      }
         
   }
      
      
}
