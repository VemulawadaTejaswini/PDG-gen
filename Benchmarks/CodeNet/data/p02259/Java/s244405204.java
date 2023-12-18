import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = Integer.parseInt(sc.nextLine());
      int[] arr = getArray(n);
      int counter = 0;//checks how many swap happened
      
      /*boolean to check if sorting is completed
        If no swap made, flag = false to exit the loop*/
      boolean flag = true;
      
      while(flag) {
         flag = false;//assume sort is completed
         for(int i = n-1; i >= 1; i --) {
            if(arr[i] < arr[i-1]) {//if not in order, swap
               int temp = arr[i];
               arr[i] = arr[i-1];
               arr[i-1] = temp;
               flag = true;//if swap happened, sort not completed
               counter ++;
            }
         }
      }
      
      printArray(arr);
      System.out.println(counter);
      
   }
   
   public static int[] getArray(int n) {
      Scanner sc = new Scanner(System.in);
      String[] input = sc.nextLine().split(" ");
      int[] arr = new int[n];
      for(int i = 0; i < n; i ++) {
         arr[i] = Integer.parseInt(input[i]);
      }
      return arr;
   }
   
   public static void printArray(int[] arr) {
      String str = "";
      for(int i = 0; i < arr.length; i ++) {
         str += arr[i];
         if(i != arr.length - 1) {
            str += " ";
         }
      }
      System.out.println(str);
   }
}

