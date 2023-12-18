import java.util.Scanner;
public class cubic{
     public static void main(String [] args){
           Scanner a = new Scanner(System.in);
           System.out.print("x = ");
           int x = a.nextInt();
           x = x*x*x;
          System.out.println("x = %d",x);
          return;
       }
}