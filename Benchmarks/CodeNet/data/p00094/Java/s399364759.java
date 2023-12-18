import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   static final double T = 3.305785;
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    double a = Double.parseDouble(arr[0]);
    double b = Double.parseDouble(arr[1]);
    
    System.out.println(a*b/T);
    
   }//main
}//class