import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        double cr = deg2rad(c);
        
        System.out.println((a * b * Math.sin(cr)) / 2);
        System.out.println(a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(cr)));
        System.out.println(b * Math.sin(cr));
    }
    
    public static double deg2rad(double deg){
        return (deg / 360) * 2 * Math.PI;
    }
}
