import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   long n=kbd.nextLong();
   double m=kbd.nextDouble();
   long x=(long)(n*m);
   System.out.println(x);
 }
}
