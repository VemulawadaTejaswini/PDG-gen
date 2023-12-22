import java.util.Scanner;
import java.math.*;
 
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
 
        //短針と長針のなす角（度数）
        double degree = (30*h + 0.5*m) - 6*m;
 
        double distance = Math.sqrt(a*a + b*b -2*a*b*Math.cos(Math.toRadians(degree)));
 
        System.out.println(distance);
    }    
}