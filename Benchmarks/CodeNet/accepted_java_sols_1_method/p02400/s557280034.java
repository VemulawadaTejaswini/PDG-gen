import java.util.Scanner;
public class Main {
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     double r = scanner.nextDouble();
     double s=r*r*Math.PI;
     double c=2*r*Math.PI;
        System.out.print(String.format("%f", s));
         System.out.print(" ");
         System.out.print(String.format("%f", c));
   }   
}