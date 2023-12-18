import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args){
    Scanner sc = new scan(System.in){
    
            int a = sc.nextInt();
            int b = sc.nextInt();
            int C = sc.nextInt();
            double sin = Math.sin(Math.toRadians(C));
            double cos = Math.cos(Math.toRadians(C));
            double d = (a*a + b*b - 2*a*b*cos); 
            double E = Math.sqrt(d);
            double S = (1/2 * a * b * sin);
            double L = (a + b + E);
            double h = S*2*a;

            System.out.println(S + " " + L + " " + h);

    }
    }
}