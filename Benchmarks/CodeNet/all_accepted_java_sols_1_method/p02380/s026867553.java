import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        double a = in.nextDouble(), b = in.nextDouble(), C = Math.toRadians(in.nextDouble());


        double h = b * Math.sin(C);
        double S = a * h / 2;
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(C));
        double L = a + b + c;

        System.out.printf("%f\n%f\n%f\n", S, L, h);
    }
}
