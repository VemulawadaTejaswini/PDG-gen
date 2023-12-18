import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        double l = sc.nextInt();
        double x = l/3;
        x *= x*x;
        
        System.out.printf("%f\n", x);
     }
}