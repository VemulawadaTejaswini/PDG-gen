import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = (2 * Math.PI) * (sc.nextDouble() / 360);
        
        double height = b * Math.sin(c);
        double space = height * a / 2;
        double length = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(c));
        
        System.out.println(space);
        System.out.println(length);
        System.out.println(height);
    }

}

