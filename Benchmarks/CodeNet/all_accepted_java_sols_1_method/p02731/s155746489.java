import java.util.Scanner;
import java.math.BigDecimal;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

  double L = scan.nextInt();
    double M = L / 3;
  BigDecimal bd1 = new BigDecimal(M);
  BigDecimal bd2 = new BigDecimal(M);
  BigDecimal result1 = bd1.multiply(bd2);
  BigDecimal result2 = result1.multiply(bd1);
  
  System.out.println(result2);
  
 }
}