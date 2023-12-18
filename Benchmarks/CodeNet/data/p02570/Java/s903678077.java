import java.util.*;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner s  = new Scanner(System.in);
    double D = s.nextDouble();
    double T =(double) s.nextInt();
    double S = s.nextDouble();
    double t = D/S;
    if(t<T+0.001){
      System.out.println("Yes");
    }
     else{
       System.out.println("No");
     }
    
  }
}
  
