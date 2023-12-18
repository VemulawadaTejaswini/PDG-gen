import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   double n=kbd.nextDouble();
   double m=kbd.nextDouble();
   double x=n*m;
   long a=(long)x;
   System.out.println(a);
 }
}
