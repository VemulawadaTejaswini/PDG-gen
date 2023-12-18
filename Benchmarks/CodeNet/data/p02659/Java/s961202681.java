import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   double n=kbd.nextDouble();
   double m=kbd.nextDouble();
   double a=n*m;
   long b=(long)Math.floor(a);
   System.out.println(b);
 }
}
