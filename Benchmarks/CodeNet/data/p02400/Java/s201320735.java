import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   static final double PI = 3.141592653897932384626;
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double r = Double.parseDouble(sc.nextLine());
      DecimalFormat dot6 = new DecimalFormat("0.000000");
      
      double area = PI * r * r;
      double circumference = 2.0 * PI * r;
      
      System.out.println(dot6.format(area) + " " + dot6.format(circumference));  
      
   }//main
}//class