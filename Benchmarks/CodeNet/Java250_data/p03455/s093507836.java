import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        
        int x= sc.nextInt ();
         int y= sc.nextInt ();
        
        int result;
        if (((1 <= x) &&  (x <= 10000)) && ((1 <= y) &&  (y <= 10000))) {
        result = (x*y);
        if (result%2==0){
           System.out.println("Even");
        }
        else {
               System.out.println("Odd");
        }
        
    }
}
}