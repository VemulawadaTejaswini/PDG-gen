import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] arr;
      int n;
      int[] score;
      double avg;
      int sum;
      double stdDeviation;
      
      while(true){
         n = Integer.parseInt(sc.nextLine());
         if(n == 0){
            break;
         }
         
         sum = 0;
         stdDeviation = 0;
         
         arr = sc.nextLine().split(" ");
         score = new int[arr.length];
         
         for(int i = 0; i < n; i ++){
            score[i] = Integer.parseInt(arr[i]);
            sum += score[i];
         }
         
         avg = sum/(double)n;
         
         for(int i = 0; i < n; i ++){
            stdDeviation += Math.pow((double)score[i] - avg,2);
         }
         stdDeviation /= (double)n;
         stdDeviation = Math.sqrt(stdDeviation);
         
         System.out.println(String.format("%.6f",stdDeviation));
      }
   }//main
   
   
}//class