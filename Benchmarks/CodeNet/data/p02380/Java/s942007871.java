import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
            int a = scan.nextInt();
            int b = scan.nextInt();
            int C = scan.nextInt();
            
            double x = Math.sin(Math.toRadians(C));
            double y = Math.cos(Math.toRadians(C));
            double E = Math.sqrt(a*a + b*b - 2*a*b*y);
            double S = 1/2 * a * b * x;
            double L = a + b + E;
            double h = S*2*a;

            System.out.println(S);
            System.out.println(L);
            System.out.println(h);
        
    }
}