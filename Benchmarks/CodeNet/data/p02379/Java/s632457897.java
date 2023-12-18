import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] arr = sc.nextLine().split(" ");
      double x1 = Double.parseDouble(arr[0]);
      double y1 = Double.parseDouble(arr[1]);
      double x2 = Double.parseDouble(arr[2]);
      double y2 = Double.parseDouble(arr[3]);
      
      double distance = Math.pow(x2-x1,2) + Math.pow(y2-y1,2);
      distance = Math.sqrt(distance);
      
      System.out.println(String.format("%.6f", distance));
      
   }//main
}//class