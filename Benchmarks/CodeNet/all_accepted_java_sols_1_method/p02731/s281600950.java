import java.util.*;
import java.math.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double l = sc.nextDouble();
    BigDecimal  l2 = new BigDecimal(l/3);
    
    System.out.println(l2.multiply(l2).multiply(l2));
    
   
  }
}