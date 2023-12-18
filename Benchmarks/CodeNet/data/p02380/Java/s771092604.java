import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Collections;
import java.math.BigDecimal;
import java.util.LinkedList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double area = area(a, b, c);
        double len = len(a, b, c);
        double height = height(area, a);
        System.out.println(area);
        System.out.println(len);
        System.out.println(height);
    }
    
    static double area(double a, double b, double c) {
        return a*b*Math.sin(Math.toRadians(c))/2;
    }
    
    static double len(double a, double b, double c) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(c))) + a + b;
    }
    
    static double height(double area, double a) {
        return area / a * 2;
    }
}