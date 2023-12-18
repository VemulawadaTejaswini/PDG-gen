import java.util.*;
import java.text.*;
/*
Main class for AOJ where there is no input.
*/
public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String[] arr = sc.nextLine().split(" ");
      double pi = Math.PI;
      
      double a = Double.parseDouble(arr[0]);
      double b = Double.parseDouble(arr[1]);
      double degree = Double.parseDouble(arr[2]);
      double radian = degree * pi/180.0;
      
      double s = 0.50 * a * b * Math.sin(radian);
      double l = a * a + b * b - 2.0 * a * b * Math.cos(radian);
      l = Math.sqrt(l);
      l += a + b;
      
      double h = 2.0 * s / a;
      
      System.out.println(String.format("%.5f",s));
      System.out.println(String.format("%.5f",l));
      System.out.println(String.format("%.5f",h));
      
   }//main
   
   
}//class