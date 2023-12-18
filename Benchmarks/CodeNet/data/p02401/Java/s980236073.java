import java.io.*;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int    a = in.nextInt();
       String op = in.next(); 
       int    b = in.nextInt();
       int    x;
       
      
       while(!op.equals("?")){
          x = a op b;

          a = in.nextInt();
          op = in.next();
          b = in.nextInt();
       }


        System.out.println(x);

      

}
}