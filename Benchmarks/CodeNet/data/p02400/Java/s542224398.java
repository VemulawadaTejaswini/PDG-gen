import java.util.Scanner;

class Main{
 public static void main(String[] args){
  Scanner num = new Scanner(System.in);
  double r = num.nextDouble();
  double x = Math.PI;

 System.out.printf("%5f %5f",(r*r*x),(2*r*x));
 }
}
