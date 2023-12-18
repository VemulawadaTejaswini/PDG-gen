import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args){
    Scanner sc = new scan(System.in);
    
            int a = sc.nextInt();
            int b = sc.nextInt();
            int C = sc.nextInt();
            
            double x = Math.sin(Math.toRadians(C));
            double y = Math.cos(Math.toRadians(C));
            double E = Math.sqrt(a*a + b*b - 2*a*b*y);
            double S = (1/2 * a * b * x);
            double L = (a + b + E);
            double h = (S*2*a);

            System.out.println(S);
            System.out.println(L);
            System.out.println(h);
        
    }
}