import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str;
      String[] arr;
      
      int row;
      int column;
      
      int[][] a;
      int[] sum_r;
      int[] sum_c;
      int grandTotal = 0;
      
      //read column and row
      str = sc.nextLine();
      arr = str.split(" ");
      
      row = Integer.parseInt(arr[0]);
      column = Integer.parseInt(arr[1]);
      
      a = new int[row][column];
      sum_r = new int[row];
      sum_c = new int[column];
      
      //read the table
      for(int i = 0; i < row; i ++){
         str = sc.nextLine();
         arr = str.split(" ");
         for(int j = 0; j < column; j ++){
            a[i][j] = Integer.parseInt(arr[j]);
            sum_r[i] += a[i][j];
            sum_c[j] += a[i][j];
            grandTotal += a[i][j];
            
         }
      }
      
      //check
      for(int i = 0; i < row; i ++){
         for(int j = 0; j < column; j ++){
            System.out.print(a[i][j] + " ");
         }
         System.out.print(sum_r[i]);
         System.out.println();
      }
      
      for(int i = 0; i < column; i++){
         System.out.print(sum_c[i] + " ");
      }
      System.out.println(grandTotal);
      
      
      
   }//main
}//class